package com.myeg.springBootDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class StockMasterRestController {
	
	//adding controller
	@GetMapping("/addSm")
	public ResponseEntity<List<StockMasterDto>> addsm(){
		
		List<StockMasterDto> lt = new ArrayList<StockMasterDto>();
		
		StockMasterDto st =new StockMasterDto("1", "Ajay", "2000");
		StockMasterDto st1 =new StockMasterDto("2", "Vijay", "2000");  
		StockMasterDto st2=new StockMasterDto("3", "Sanjay", "2000");
		
		lt.add(st);
		lt.add(st2);
		lt.add(st1);
	
		return ResponseEntity.ok().body(lt);
	}
	

}
