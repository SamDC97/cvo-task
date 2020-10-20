package be.cvo.task;

import be.cvo.task.service.TaskDTO;
import be.cvo.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskResource {
    @Autowired
    private TaskService taskService;

    //Add code on what to do if id not found.
    @GetMapping("/task/{id}")
    public TaskDTO getTask(@PathVariable Integer id) {
        return taskService.getTask(id);
    }

    @PostMapping(path = "/add-task", consumes = "application/json")
    public void addRandomTask(@RequestBody TaskRequest taskRequest) {

        taskService.addTask(taskRequest.getDescription());
    }
}
