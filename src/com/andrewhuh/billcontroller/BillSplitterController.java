package com.andrewhuh.billcontroller;

import org.springframework.stereotype.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BillSplitterController {
	
	@RequestMapping(value="/billsplitter.html", method = RequestMethod.GET)  
	public ModelAndView getBillSplitterForm() {
		
		ModelAndView model = new ModelAndView("BillSplitter");
		
//		model.addObject("msg", "my name is cooler");
		
		return model;
	}
	@RequestMapping(value="/submitBillForm.html", method = RequestMethod.POST)
	public ModelAndView submitBillSplitter(
			@RequestParam("person1") String person1, @RequestParam("person2") String person2,
			@RequestParam("person3") String person3, @RequestParam("person4") String person4,
			@RequestParam("tax") String tax, @RequestParam("deliveryfee") String deliveryfee, 
			@RequestParam("tip") String tip
		){
//		Just printing all form data 
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(tax);
		System.out.println(deliveryfee);
		System.out.println(tip);
		Integer[] arrayofpeople = new Integer[4];
		arrayofpeople[1] = Integer.parseInt(person1);
		arrayofpeople[2] = Integer.parseInt(person2);
		arrayofpeople[3] = Integer.parseInt(person3);
		arrayofpeople[4] = Integer.parseInt(person4);
		
		int numberofpeople = 4;
		int totalvalueofbill = 0;
//		This for loop is used to get the number 
//		of people using the application and the 
//		total value of the bill excluding tip, tax, and delivery fee
		for (int i=0; i < 4; i++) {
			if (arrayofpeople[i] == null) {
				numberofpeople -= 1;
				totalvalueofbill += arrayofpeople[i];
			}
		}
		
		
		
		
		
		
		int total 
		
		ModelAndView model = new ModelAndView("BillResults");
		
		
		
		
		
		model.addObject("person1", "my name is cooler");
		model.addObject("person2", "my name is coolerrr");
		model.addObject("person3", "my name is coolerrrrr");
		model.addObject("person4", "my name is coolerrrrrrr");
		
		
		return model;
	}
	
}

