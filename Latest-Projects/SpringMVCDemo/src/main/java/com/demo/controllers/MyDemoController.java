package com.demo.controllers;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.demo.model.Account;


@Controller
public class MyDemoController {

	
	  private String[] quotes= {"quote 1","quote 2","quote 3"};
	  
	  @RequestMapping(value="/getQuote")	
	  public String getRandomQuote(ModelMap model) {
			
		  	int rand = new Random().nextInt(quotes.length);
		  	
		  	String randomQuote = quotes[rand];
		  	
			model.addAttribute("randomQuote", randomQuote);
			
			//model.addAllAttributes("randomQuote","Test 123");
			
			return "quote";  //Its view name
		}
 
	  	
	    /*
		@RequestMapping(value="/createAccount")
	  	public String createAccount(@ModelAttribute ("aNewAccount")Account account, BindingResult result ) {
	  		
	  		if(result.hasErrors()) {
	  			System.out.println("Form has errors");
	  			return "createAccount";
	  		}
	  		System.out.println("First name="+account.getFirstName() +"  Last name="+account.getLastName());
	  		
	  		return "createAccount";
	  	}
	  	*/
		
	  	@RequestMapping(value="/accountCreated",method=RequestMethod.POST)	
		 public String performCreate(Account account) {
	  		 
	  		System.out.println("First name="+account.getFirstName() +"  Last name="+account.getLastName());
	  		System.out.println("Address="+account.getAddress() +"  Age="+account.getAge());
	  		
	  		return "accountCreated";
	  	 }
	  
	  	@RequestMapping(value="/myForm")
	  	public String myForm() {
	  	
	  			return "myForm";
	  	}
	  	
	  	@RequestMapping(value="/handleForm")
	  	public String handleForm(@RequestParam("myFile") MultipartFile file){
	  		
	  		try {
	  			System.out.println("Save the file here");
	  		}catch(Exception e) {
	  			System.out.println(e);
	  		}
	  		return "operationComplete";
	  	}
	  	
	  	/* From here code is added */
	  	
	  	@RequestMapping(value="/createAccount")
	  	public String createAccount(@ModelAttribute ("aNewAccount")Account account ) {
	  		
	  		 
	  		System.out.println("First name="+account.getFirstName() +"  Last name="+account.getLastName());
	  		System.out.println("Address="+account.getAddress() +"  mail="+account.getEmail());
	  		
	  		
	  		return "createAccount";
	  	}
	  	
	  	@RequestMapping(value="/doCreate")
	  	public String doCreate(@ModelAttribute ("aNewAccount")Account account ) {
	  		
	  		System.out.println("Do create First name="+account.getFirstName() +"  Last name="+account.getLastName());
	  		System.out.println("Do create Address="+account.getAddress() +"  mail="+account.getEmail());
	  		
	  		return "redirect:accConfirm";
	  	}
	  	
	  	@RequestMapping(value="/accConfirm")
	  	public String accountConfirmation(@ModelAttribute ("aNewAccount")Account account ) {
	  		
	  		System.out.println("account confirmed First name="+account.getFirstName() +"  Last name="+account.getLastName());
	  		System.out.println("account confirmed Address="+account.getAddress() +"  mail="+account.getEmail());
	  		
	  		return "accountConfirmed";
	  	}
	  
}