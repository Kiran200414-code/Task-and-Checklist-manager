package com.store.taskmanager.dto;

import com.store.taskmanager.entity.enums.Role;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class NoteDTO {
    private Long id;
    private String content;
    private Long taskId;
    private String taskTitle;
    private Long createdById;
    private String createdByName;
    private Role createdByRole;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}