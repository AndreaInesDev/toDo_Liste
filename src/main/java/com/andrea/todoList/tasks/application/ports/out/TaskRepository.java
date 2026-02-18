package com.andrea.todoList.tasks.application.ports.out;

import com.andrea.todoList.tasks.domaine.model.Tasks;

import java.util.List;
import java.util.Optional;


// Utilisé par la couche infrastructure(comme la bd)
public interface TaskRepository {

    Tasks save (Tasks tasks);

    Optional<Tasks> findTasksById(Long id);

    List<Tasks> findByUserId(Long idUser);

    void deleteById(Long id);
}
