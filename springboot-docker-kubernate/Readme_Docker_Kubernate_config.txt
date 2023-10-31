
Springboot :

1) create the spring boot app with dependency - spring web,spring dev tools

Docker Config :

1) create the docker file
2) add below code

FROM openjdk:8

EXPOSE 8085

ADD target/springboot-docker-kubernate.jar springboot-docker-kubernate.jar

ENTRYPOINT ["java","-jar","springboot-docker-kubernate.jar"]


pom.xml :

1) Add below code for create jar file  with this name

<finalName>springboot-docker-kubernate</finalName>


Run :

runAs -> maven build -> mvn clean -> click run -> will create two jar files under target folder

springboot-docker-kubernate.jar

springboot-docker-kubernate.jar.original


Docker Setup local :

1) download Docker exe file from below and install in our local machine

https://www.docker.com/products/docker-desktop/ 

2) After installation need to launch Docker App

3) then check the below comments

docker login

username : regithcprm
password : Regithcprm123@

4) After enter the creadentials if its get success then below message will show then we can access

Authenticating with existing credentials...
Login Succeeded


Docker Build :

1) run below comment for build docker

docker build -t springboot-docker-kubernate .

2) After run this comment if get sucess will get the below message

 => CACHED [2/2] ADD target/springboot-docker-kubernate.jar springboot-docker-kubernate.jar                                                                        0.0s
 => exporting to image                                                                                                                                             0.3s
 => => exporting layers                                                                                                                                            0.0s
 => => writing image sha256:1ced3d926d533f8b0ad89d2e63c03a4c194003c7790f5a672dde3269e3b17337                                                                       0.1s
 => => naming to docker.io/library/springboot-docker-kubernate

Check Docker Image Created Or Not :

1) Need to run below comment to check the docker image

docker images

2) Above comment will return all images here we can see our image is created or not. if created then we can see the images like below

REPOSITORY                    TAG       IMAGE ID       CREATED          SIZE
springboot-docker-kubernate   latest    1ced3d926d53   31 minutes ago   575MB


Push to Docker HUB :

1) tagging image name to docker hub name

docker tag springboot-docker-kubernate regithcprm/docker-kubernate

2) After that push to doccker hub

docker push regithcprm/docker-kubernate

Using default tag: latest
The push refers to repository [docker.io/regithcprm/docker-kubernate]
1f236f0d2739: Pushed
6b5aaff44254: Pushed
53a0b163e995: Pushed
b626401ef603: Pushed
9b55156abf26: Pushed
293d5db30c9f: Pushed
03127cdb479b: Pushed
9c742cd6c7a5: Pushed
latest: digest: sha256:8dc7d2bff2e1ffc30d1ec9cefc2dc182b2f3d615d843057cd8c5f155bc37a3dd size: 2007

3) Remove Tag

Single :-

E:\Regith\Apps\Apps\Springboot\springboot-docker-kubernate>docker rmi springboot-docker-kubernate

Untagged: springboot-docker-kubernate:latest
Deleted: sha256:1ced3d926d533f8b0ad89d2e63c03a4c194003c7790f5a672dde3269e3b17337

Multiple :-

E:\Regith\Apps\Apps\Springboot\springboot-docker-kubernate>docker rmi springboot-docker-kubernate regithcprm/docker-kubernate
Untagged: springboot-docker-kubernate:latest
Untagged: regithcprm/docker-kubernate:latest
Untagged: regithcprm/docker-kubernate@sha256:8dc7d2bff2e1ffc30d1ec9cefc2dc182b2f3d615d843057cd8c5f155bc37a3dd
Deleted: sha256:1ced3d926d533f8b0ad89d2e63c03a4c194003c7790f5a672dde3269e3b17337


4) Run Tag

E:\Regith\Apps\Apps\Springboot\springboot-docker-kubernate>docker run -p 8085:8085 regithcprm/docker-kubernate
Unable to find image 'regithcprm/docker-kubernate:latest' locally
latest: Pulling from regithcprm/docker-kubernate
001c52e26ad5: Already exists
d9d4b9b6e964: Already exists
2068746827ec: Already exists
9daef329d350: Already exists
d85151f15b66: Already exists
52a8c426d30b: Already exists
8754a66e0050: Already exists
9f03d58f8254: Already exists
Digest: sha256:8dc7d2bff2e1ffc30d1ec9cefc2dc182b2f3d615d843057cd8c5f155bc37a3dd
Status: Downloaded newer image for regithcprm/docker-kubernate:latest
docker: Error response from daemon: Ports are not available: exposing port TCP 0.0.0.0:8085 -> 0.0.0.0:0: listen tcp 0.0.0.0:8085: bind: Only one usage of each socket address (protocol/network address/port) is normally permitted.


5) Remove tag force

docker rmi -f regithcprm/docker-kubernate

6) Pull

docker pull regithcprm/docker-kubernate


E:\Regith\Apps\Apps\Springboot\springboot-docker-kubernate>docker pull regithcprm/docker-kubernate
Using default tag: latest
latest: Pulling from regithcprm/docker-kubernate
001c52e26ad5: Already exists
d9d4b9b6e964: Already exists
2068746827ec: Already exists
9daef329d350: Already exists
d85151f15b66: Already exists
52a8c426d30b: Already exists
8754a66e0050: Already exists
9f03d58f8254: Already exists
Digest: sha256:8dc7d2bff2e1ffc30d1ec9cefc2dc182b2f3d615d843057cd8c5f155bc37a3dd
Status: Downloaded newer image for regithcprm/docker-kubernate:latest
docker.io/regithcprm/docker-kubernate:latest

What's Next?
  View a summary of image vulnerabilities and recommendations → docker scout quickview regithcprm/docker-kubernate


