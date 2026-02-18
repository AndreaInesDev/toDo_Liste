package com.andrea.todoList.tasks.infrastructure.mapper;


import com.andrea.todoList.tasks.domaine.model.Tasks;
import com.andrea.todoList.tasks.infrastructure.entity.TasksEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TasksEntityMapper {
    Tasks toDomain(TasksEntity entity);

    @Mapping(target = "id", source = "id")
    TasksEntity toEntity(Tasks domain);
}
