package com.example.springbootcassendra.respository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootcassendra.api.Users;

@Repository
public interface UserRepository extends CassandraRepository<Users, Integer>{

	@AllowFiltering
	List<Users> getUsersFilterByAge(int age);

}
