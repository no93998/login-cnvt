package com.cnvt.bckend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnvt.bckend.model.Convention;

@Repository
public interface ConventionRepository  extends JpaRepository<Convention, Long>{

}
