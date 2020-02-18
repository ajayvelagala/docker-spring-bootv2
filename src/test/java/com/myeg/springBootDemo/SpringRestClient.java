package com.myeg.springBootDemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
///import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.myeg.springBootDemo.controller.StockMasterDto;

public class SpringRestClient {
  
    public static final String REST_SERVICE_URI = "http://172.17.100.200:32087/getData";
     

    private static HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        return headers;
    }
     
    
    /*
     * Send a GET request to get a specific user.
     */
    private static void getUser(){
       // Assert.notNull(tokenInfo, "Authenticate first please......");
        System.out.println("\nTesting getUser API----------");
        RestTemplate restTemplate = new RestTemplate();
       // HttpEntity<String> request = new HttpEntity<String>();
        HttpEntity<String> request = new HttpEntity<String>(getHeaders());
     //   ResponseEntity<List<StockMasterDto>> response = (<List<StockMasterDto>>)restTemplate.exchange(REST_SERVICE_URI, HttpMethod.GET,request,StockMasterDto.class);
        ResponseEntity<List<StockMasterDto>> restEntity = restTemplate.exchange(
        		REST_SERVICE_URI, HttpMethod.GET,request ,new ParameterizedTypeReference<List<StockMasterDto>>() {
				});
		List<StockMasterDto> inventoryVarianceBeforeClosing = restEntity.getBody();
        System.out.println(inventoryVarianceBeforeClosing);
    }
      
    /*
     * Send a POST request to create a new user.
     */
  
    /*
     * Send a DELETE request to delete a specific user.
     */
  
  
    public static void main(String args[]){
       
         for (int i=0;i<=10000;i++)
         {
        getUser();
         }
       
    }
}