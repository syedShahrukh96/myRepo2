package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Candidate1;



public interface CandidateRepo extends CrudRepository<Candidate1, Integer> 
{
	
	List<Candidate1> findByCtech(String Ctech);
	List<Candidate1> findByCidGreaterThan(int Cid);
}
