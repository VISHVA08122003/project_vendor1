package com.example.spring.project.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.spring.project.model.ProjectModel;
import com.example.spring.project.service.ProjectService;

@RestController
@RequestMapping("api/v1/user")
public class ProjectController {
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	@Autowired
	private ProjectService projectService;	
	@GetMapping("/getUser")
    public ResponseEntity<List<ProjectModel>> getUser(){
		
		System.out.println("SOP");
		logger.info("This is bucks bunny");
		logger.debug("debug");
		logger.warn("warn");
		logger.error("err");
		System.out.println("hi");
		return ResponseEntity.status(200).body(projectService.getUser());
	}


	@GetMapping("/getQuery")
	public ResponseEntity<List<ProjectModel>> getQuery(){
		return ResponseEntity.status(200).body(projectService.findAllQuery());
	}
	
	@GetMapping("/getIdno/{idno}")
    public ResponseEntity<ProjectModel> getIdno(@PathVariable int idno){
		return ResponseEntity.status(200).body(projectService.getIdno(idno));
	}
	

	@GetMapping("/AllUser")
	 public ResponseEntity<Page<ProjectModel>> getAllUser(
		@RequestParam(defaultValue = "0") int page, 
		@RequestParam(defaultValue = "10") int size,
		@RequestParam(defaultValue = "idno") String sortField,
		@RequestParam(defaultValue = "asc") String sortOrder
		){
		PageRequest pageReq = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortOrder),sortField));
		return ResponseEntity.status(200).body(projectService.getAllUser(pageReq));
	}
	@PostMapping("/addUser")
     public ResponseEntity<String> addUser(@RequestBody ProjectModel user){
    	 boolean dataSaved = projectService.addUser(user);
    	 if(dataSaved) {
    		 return ResponseEntity.status(200).body("User added successfully!");
    	 }
    	 else {
    		 return ResponseEntity.status(404).body("Something went wrong!");
    	 }
    	 
     }
     
     @PutMapping("/updateUser/{idno}")
     public ResponseEntity<String> updateUser(@PathVariable int idno,@RequestBody ProjectModel user){
    	 boolean userData = projectService.updateUser(idno,user);
    	 if(userData) {
    		 return ResponseEntity.status(200).body("User updated successfully");
    	 }
    	 else {
    		 return ResponseEntity.status(404).body("nO RECORD FOUND TO BE updated");
    	 }
    	
     }
     
     @PutMapping("/updateUserQuery/{products}/{idno}")
 	public ResponseEntity<String> updateUserQuery(@PathVariable String products, @PathVariable int idno){
 		int flag = projectService.updateUserQuery(products, idno);
 		if(flag == 1)
 			return ResponseEntity.status(200).body("Record updated successfully!");
 		else
 			return ResponseEntity.status(200).body("Something went wrong!");
 	}
  
  
     @DeleteMapping("/deleteUser/{idno}")
     public ResponseEntity<String> deleteUser(@PathVariable int idno){
    	 boolean userDeleted = projectService.deleteUser(idno);
    	 if(userDeleted) {
    		 return ResponseEntity.status(200).body("User deleted successfully");
    	 }
    	 else {
    		 return ResponseEntity.status(200).body("User not deleted successfully");
    	 }
     }
     
     @DeleteMapping("/deleteUserQuery/{idno}")
 	public ResponseEntity<String> deleteUserQuery(@PathVariable int idno) {
 		int flag = projectService.deleteUserQuery(idno);
 		if(flag == 1)
 			return ResponseEntity.status(200).body("Record deleted successfully!");
 		else
 			return ResponseEntity.status(200).body("Something went wrong!");
 	}
 

}
