package com.andrea.todoList.tasks.application.service;

import com.andrea.todoList.tasks.application.ports.in.TaskUseCase;
import com.andrea.todoList.tasks.application.ports.out.TaskRepository;
import com.andrea.todoList.tasks.domaine.model.Tasks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements TaskUseCase {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Tasks createTodo(Tasks tasks){
        return taskRepository.save(tasks);
    }

    @Override
    public Tasks getTasksById(Long id){
        return taskRepository.findTasksById(id)
                .orElseThrow(() -> new RuntimeException("Cette tache n'existe pas"));
    }

    @Override
    public List<Tasks> getAllTasksByUser(Long idUser){
        return taskRepository.findByUserId(idUser);
    }

    @Override
    public Tasks markAsCompleted(Long id){
        Tasks tasks = getTasksById(id);

        Tasks completedTask = new Tasks(tasks.id(), tasks.title(), true, tasks.userId());
        return taskRepository.save(completedTask);
    }

    @Override
    public void removeTasksById(Long id){
         taskRepository.deleteById(id);
    }
}
