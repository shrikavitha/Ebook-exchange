package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ApiModel;
import com.example.demo.repository.ApiRepo;

@Service
public class ApiService {
	
     @Autowired//to create object 
     ApiRepo ar;
     
     public ApiModel saveinfo(ApiModel am) {
 		return ar.save(am);//post
 	}
 	
     public List<ApiModel> saveinfo(List<ApiModel> s) {
 		return (List<ApiModel>)ar.saveAll(s);//post
 	}
     
 	public List<ApiModel> showinfo(){
 		return ar.findAll();//get
 	}
 	public ApiModel changeinfo(ApiModel s) {
		return ar.saveAndFlush(s);//update
	}
 	public String updateinfobyid(int id,ApiModel s)

	{

		ar.saveAndFlush(s);

		if(ar.existsById(id))

		{

			return "Updated";

		}

		else

		{

			return "Enter valid id";//updatebyid

		}

	}
	
	public void deleteinfo(ApiModel s) {
		ar.delete(s);//delete
	}
	public void deleteparamid(int id) {
		ar.deleteById(id);//deletebyid
	}
}
