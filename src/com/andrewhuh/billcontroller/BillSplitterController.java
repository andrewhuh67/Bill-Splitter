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
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@RequestParam("studentName") String name, @RequestParam("studentHobby") String hobby){
		
		ModelAndView model = new ModelAndView("BillResults");
		model.addObject("msg", "Details subitted by you:: Name: " + name + ", Hobby: " + hobby);
		
		return model;
	}
	
}

