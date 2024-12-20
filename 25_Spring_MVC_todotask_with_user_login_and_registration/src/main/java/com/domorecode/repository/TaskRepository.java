package com.domorecode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domorecode.entity.UserEntity;
import com.domorecode.entity.UserTask;

public interface TaskRepository extends JpaRepository<UserTask,Integer> {
	  List<UserTask> findByUser(UserEntity user);
}
