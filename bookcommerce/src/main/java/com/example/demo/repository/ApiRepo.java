package com.example.demo.repository;
//to access data and interaction b/w application and database
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ApiModel;

@Repository
public interface ApiRepo extends JpaRepository<ApiModel, Integer>{

}
