package com.example.spring.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.spring.project.model.ProjectModel;
import com.example.spring.project.repository.ProjectRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<ProjectModel> getUser() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	@Override
	public boolean updateUser(int idno, ProjectModel user) {
	   Optional<ProjectModel> existingUserOptional=projectRepository.findById(idno);
		if(existingUserOptional.isPresent()){
		ProjectModel userExists = existingUserOptional.get();
		userExists.setProducts(user.getProducts());;
		userExists.setOrder_date(user.getOrder_date());;
		userExists.setDue_date(user.getDue_date());
		userExists.setAmount(user.getAmount());
		projectRepository.save(userExists);
		return true;
	}else {
		return false;
		}
	}

	@Override
	public boolean deleteUser(int idno) {
		Optional<ProjectModel>existingUserOptional = projectRepository.findById(idno);
		if(existingUserOptional.isPresent()) {
			projectRepository.deleteById(idno);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean addUser(ProjectModel user) {
		boolean userExists = projectRepository.existsByIdno(user.getIdno());
		if(!userExists) {
			projectRepository.save(user);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Page<ProjectModel> getAllUser(PageRequest pageReq) {
		// TODO Auto-generated method stub
		return  projectRepository.findAll(pageReq);
	}

	@Override
	public ProjectModel getIdno(int idno) {
		return projectRepository.findByIdno(idno);
	}

	
	@Override
	public List<ProjectModel> findAllQuery() {
		return projectRepository.findAll();
	}

	@Override
	public int updateUserQuery(String products, int idno) {
		return projectRepository.updateUser(products, idno);
	}

	
	@Override
	public int deleteUserQuery(int idno) {
		return projectRepository.deleteUser(idno);
	}


	






}
