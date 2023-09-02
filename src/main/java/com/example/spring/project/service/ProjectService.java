package com.example.spring.project.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


import com.example.spring.project.model.ProjectModel;

public interface ProjectService {

	List<ProjectModel> getUser();

	boolean updateUser(int idno, ProjectModel user);

	boolean deleteUser(int idno);

	boolean addUser(ProjectModel user);


	public Page<ProjectModel> getAllUser(PageRequest pageReq);


	public int updateUserQuery(String products, int idno);
	
	int deleteUserQuery(int idno);

    
	public ProjectModel getIdno(int idno);

	List<ProjectModel> findAllQuery();
    


	



}
