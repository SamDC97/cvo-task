package be.cvo.task.service;

import be.cvo.task.domain.Task;
import be.cvo.task.domain.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskMapper taskMapper;

    public TaskDTO getTask(Integer id) {
        Task task = taskRepository.getOne(id);

        return taskMapper.map(task);
    }

    public void addTask(String description) {
        taskRepository.save(Task.builder().description(description).build());
    }
}
