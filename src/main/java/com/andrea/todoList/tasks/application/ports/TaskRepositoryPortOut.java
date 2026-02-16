package com.andrea.todoList.tasks.application.ports;

import com.andrea.todoList.tasks.domaine.model.Tasks;

import java.util.List;
import java.util.Optional;


// Utilisé par la couche infrastructure(comme la bd)
public interface TaskRepositoryPortOut {

    Tasks save (Tasks tasks);

    Optional<Tasks> findByid(Long id);

    List<Tasks> findByUserId(Long idUser);

    void deleteById(Long id);
}
