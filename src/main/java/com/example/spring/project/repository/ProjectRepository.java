package com.example.spring.project.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.spring.project.model.ProjectModel;

import jakarta.transaction.Transactional;

public interface ProjectRepository extends JpaRepository<ProjectModel,Integer>{

    

	boolean existsByIdno(int idno);

//	public ProjectModel findByIdno(int idno);


//	public int updateUser(String fooditem, int idno);
//
//	int deleteUser(int idno);


	
//	ProjectModel getIdno(int idno);
	
	@Query("select u from ProjectModel u")
	List<ProjectModel> findAllQuery();
	
	@Query("select u from ProjectModel u where u.idno = :idno")
    ProjectModel findByIdno(@Param("idno")int idno);
	

    
    @Query("select u from ProjectModel u where u.idno = ?1 and u.products = ?2 and u.order_date = ?3")
    ProjectModel findByIdno(int idno,String products,int order_date);
	
	@Modifying
	@Transactional
	@Query("update ProjectModel u set u.products = :products where u.idno = :idno")
	int updateUser(@Param("products") String products,@Param("idno") int idno);
	
	@Modifying
	@Transactional
    @Query("delete ProjectModel u where u.idno = ?1")
    int deleteUser(int idno);
	

    
}
