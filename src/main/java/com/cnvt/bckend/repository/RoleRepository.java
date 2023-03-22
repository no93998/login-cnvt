package com.cnvt.bckend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cnvt.bckend.model.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, String>{

}
