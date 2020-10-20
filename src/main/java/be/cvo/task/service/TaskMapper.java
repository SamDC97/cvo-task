package be.cvo.task.service;

import be.cvo.task.domain.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public TaskDTO map(Task task) {
        return new TaskDTO(task.getId(), task.getDescription());
    }
}
