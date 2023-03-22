package com.cnvt.bckend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cnvt.bckend.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

}
