package be.cvo.task.service;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskDTO {
    private Integer id;
    private String description;
}
