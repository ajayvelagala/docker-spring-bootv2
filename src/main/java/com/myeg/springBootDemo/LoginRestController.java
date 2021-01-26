package com.myeg.springBootDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myeg.springBootDemo.controller.StockMasterDto;

@RestController
public class LoginRestController {
	
	
	@GetMapping("/login")
	public ResponseEntity<List<StockMasterDto>> getAllStockonHandsbyCostCenterId(){
		
		List<StockMasterDto> lt = new ArrayList<StockMasterDto>();
		
		StockMasterDto st =new StockMasterDto("1", "Ajay", "2000");
		StockMasterDto st1 =new StockMasterDto("2", "Vijay", "2000");  
		StockMasterDto st2=new StockMasterDto("3", "Sanjay", "2000");
		StockMasterDto st3=new StockMasterDto("4", "Veeru", "2000");
		StockMasterDto st4=new StockMasterDto("5", "user2", "2000");
		StockMasterDto st5=new StockMasterDto("10", "user10", "2000");
		// added another user in branch
		StockMasterDto st9=new StockMasterDto("10", "user10", "2000");
		
		lt.add(st);
		lt.add(st2);
		lt.add(st1);
		lt.add(st3);
		lt.add(st4);
	
		System.out.println("StockMasterDto:"+lt.toString());
		
		return ResponseEntity.ok().body(lt);
	}

}
