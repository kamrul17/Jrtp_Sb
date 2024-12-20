package com.domorecode.studentrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domorecode.entity.StudentEntity;
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {

  

}
