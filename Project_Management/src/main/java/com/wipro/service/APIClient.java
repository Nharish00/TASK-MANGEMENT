package com.wipro.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.dto.TaskDto;

@FeignClient(url="http://localhost:9093",name = "Task-Management")
//@FeignClient(name="Task-Management")
public interface APIClient {
	
	@GetMapping("/api/task/get-all-tasks-by-project-id/{pid}")
    public List<TaskDto> getAllTasksByPid(@PathVariable("pid") Long pid);

}
