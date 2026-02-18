package com.andrea.todoList.tasks.application.ports.in;

import com.andrea.todoList.tasks.domaine.model.Tasks;

import java.util.List;

public interface TaskUseCase {
    Tasks createTodo(Tasks tasks);

    Tasks getTasksById(Long id);

    List<Tasks> getAllTasksByUser(Long userId);

    Tasks markAsCompleted(Long id);

    void removeTasksById(Long id);
}
