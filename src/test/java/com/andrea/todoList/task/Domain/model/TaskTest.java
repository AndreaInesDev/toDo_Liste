package com.andrea.todoList.task.Domain.model;

import com.andrea.todoList.tasks.domaine.exception.TaskValidationException;
import com.andrea.todoList.tasks.domaine.model.Tasks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class TaskTest {
    @Test
    @DisplayName("Doit créer une tache valide quand les données sont correctes")
    void shouldCreateValidTask(){
        Tasks tasks = new Tasks(1L, "Maitriser la clean Architecture", false, 100L);

        assertEquals("Maitriser la clean Architecture", tasks.title());
    }

    @Test
    @DisplayName("Doit lancer une exception si le titre est vide")
    void shouldThrowExceptionWhenTitleIsEmpty(){
        String invalidTitle = "";

        Exception exception = assertThrows(TaskValidationException.class, () -> {
            new Tasks(1L, invalidTitle, false, 100L);
        });

        assertTrue(exception.getMessage().contains("Le titre de la tache est obligatoire"));
    }

    @Test
    @DisplayName("doit lancer une exception si le userId est null")
    void shouldThrowExceptionWhenUserIdIsEmpty(){
        Exception exception = assertThrows(TaskValidationException.class, () -> {
            new Tasks(1L, "A oublié d'inserer l'id de l'utilisateur", false, null);

        });

        assertEquals("l'id utilisateur manquant", exception.getMessage());
    }
}
