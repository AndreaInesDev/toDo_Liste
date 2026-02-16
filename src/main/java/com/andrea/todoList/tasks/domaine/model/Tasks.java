package com.andrea.todoList.tasks.domaine.model;

import com.andrea.todoList.tasks.domaine.exception.TaskValidationException;

public record Tasks(Long id, String title, boolean completed, Long userId) {

    public Tasks{
        if (title == null || title.isBlank()){
            throw new TaskValidationException("Le titre de la tache est obligatoire");
        }

        if (userId == null){
            throw new TaskValidationException("l'id utilisateur manquant");
        }
    }
}
