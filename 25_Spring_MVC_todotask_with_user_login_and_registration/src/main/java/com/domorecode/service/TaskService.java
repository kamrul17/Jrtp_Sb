package com.domorecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domorecode.entity.UserEntity;
import com.domorecode.entity.UserTask;
import com.domorecode.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void addTask(UserTask task) {
        taskRepository.save(task);
    }

    public List<UserTask> getTasksForUser(UserEntity user) {
        return taskRepository.findByUser(user);
    }
}

