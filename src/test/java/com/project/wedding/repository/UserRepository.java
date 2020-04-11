package com.project.wedding.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.project.wedding.entity.User;

@Repository
public class UserRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<User> findAll(){
		Query query = entityManager.createQuery("from User");
		return query.getResultList();
	}
	
	public User findById(Integer id) {
		return entityManager.find(User.class, id);
	}
	

}
