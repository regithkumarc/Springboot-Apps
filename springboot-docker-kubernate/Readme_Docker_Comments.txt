Docker Comments :-

1) Download

https://www.docker.com/products/docker-desktop/ 

2) Login

docker login

mailid : regithit@gmail.com
username : regithcprm
password : Regithcprm123@

3) Docker Build

docker build -t springboot-docker-kubernate .


4) Image Status 

docker images


5) Tag Image to docker image hub

docker tag springboot-docker-kubernate regithcprm/docker-kubernate


6) Push to Docker Hub

docker push regithcprm/docker-kubernate

7) Reomove tag using image name

docker rmi springboot-docker-kubernate


8) Run docker in locally

docker run -p 8085:8085 regithcprm

9) Remove tag force

docker rmi -f regithcprm/docker-kubernate

10) Pull

docker pull regithcprm/docker-kubernate