package com.myeg.springBootDemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class CommentController {

		
	@GetMapping("/getData")
	public ResponseEntity<List<StockMasterDto>> getAllStockonHandsbyCostCenterId(){
		
		List<StockMasterDto> lt = new ArrayList<StockMasterDto>();
		
		StockMasterDto st =new StockMasterDto("1", "Ajay", "2000");
		StockMasterDto st1 =new StockMasterDto("2", "Vijay", "2000");  
		StockMasterDto st2=new StockMasterDto("3", "Sanjay", "2000");
		
		lt.add(st);
		lt.add(st2);
		lt.add(st1);
	
		return ResponseEntity.ok().body(lt);
	}
	
	
	@GetMapping("/getDataForSecondService")
	public ResponseEntity<List<StockMasterDto>> addedSecondService(){
		
		List<StockMasterDto> lt = new ArrayList<StockMasterDto>();
		
		StockMasterDto st =new StockMasterDto("1", "Ajay", "2000");
		StockMasterDto st1 =new StockMasterDto("2", "Vijay", "2000");  
		StockMasterDto st2=new StockMasterDto("3", "Sanjay", "2000");
		
		lt.add(st);
		lt.add(st2);
		lt.add(st1);
	
		return ResponseEntity.ok().body(lt);
	}
	
	@GetMapping("/getDataForEmp")
	public ResponseEntity<List<Employee>> selectEmployee(){
		
		List<Employee> lt = new ArrayList<Employee>();
		
		Employee st =new Employee("1", "Ajay", "30");
		Employee st1 =new Employee("2", "Vijay", "30");  
		Employee st2=new Employee("3", "Sanjay", "30");
		Employee st3=new Employee("4", "Jaya Vansanthi", "25");
		lt.add(st);
		lt.add(st2);
		lt.add(st1);
		lt.add(st3);
	
		return ResponseEntity.ok().body(lt);
	}
	
}