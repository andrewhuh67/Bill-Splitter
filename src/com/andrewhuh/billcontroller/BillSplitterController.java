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
		Float[] arrayofpeople = new Float[4];
		arrayofpeople[0] = Float.valueOf(person1);
		arrayofpeople[1] = Float.valueOf(person2);
		arrayofpeople[2] = Float.valueOf(person3);
		arrayofpeople[3] = Float.valueOf(person4);
		int taxvalue = Integer.parseInt(tax);
		int deliveryfeevalue = Integer.parseInt(deliveryfee);
		int tipvalue = Integer.parseInt(tip);
		
		int numberofpeople = 4;
		float totalvalueofbill = 0;
		Float[] percentforpeople = new Float[4];
		Float[] finalamountforeachperson = new Float[4];
//		This for loop is used to get the number 
//		of people using the application and the 
//		total value of the bill excluding tip, tax, and delivery fee
//		Also adds the what each person owes
		System.out.println(finalamountforeachperson);
		System.out.println(arrayofpeople);
		for (int i=0; i < 4; i++) {
			if (arrayofpeople[i] == 0) {
				numberofpeople -= 1;
			} else {
				totalvalueofbill += arrayofpeople[i];
				finalamountforeachperson[i] = (float) 0;
				finalamountforeachperson[i] += arrayofpeople[i];
			}
		}
//		got the percent of the bill that each person owes
		for (int i=0; i < 4; i++) {
			float percentforone = arrayofpeople[i] / totalvalueofbill;
			percentforpeople[i] = percentforone;
		}
		System.out.println("here");
//		deals with tax, delivery fee, tip
		for (int i=0; i < 4; i++) {
			finalamountforeachperson[i] += taxvalue * percentforpeople[i];
			finalamountforeachperson[i] += tipvalue * percentforpeople[i];
			finalamountforeachperson[i] += deliveryfeevalue * percentforpeople[i];
		}
		
		System.out.println("here2");
		ModelAndView model = new ModelAndView("BillResults");
//		just for a label
		String[] labelarray = new String[4];
		labelarray[0] = "person1";
		labelarray[1] = "person2";
		labelarray[2] = "person3";
		labelarray[3] = "person4";
		
		for (int i=0; i < 4; i++) {
			model.addObject(labelarray[i], finalamountforeachperson[i]);
			System.out.println(finalamountforeachperson[i]);
		}
		
		return model;
	}
	
}

