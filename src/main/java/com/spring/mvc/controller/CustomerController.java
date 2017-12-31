package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Customer;
import com.spring.mvc.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/getCustomerList")
	public ModelAndView getUserLIst() {

		List<Customer> customerList = customerService.getCustomerList();
		return new ModelAndView("customerList", "customerList", customerList);
	}

	@RequestMapping("/edit")
	public ModelAndView editUser(@RequestParam String id,
			@ModelAttribute Customer customer) {

		customer = customerService.getCustomerById(id);

		List<String> genderList = new ArrayList<String>();
		genderList.add("Male");
		genderList.add("Female");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("genderList", genderList);
		map.put("customer", customer);

		return new ModelAndView("edit", "map", map);

	}

	@RequestMapping("/register")
	public ModelAndView addCustomer(@ModelAttribute Customer customer) {

		List<String> genderList = new ArrayList<String>();
		genderList.add("Male");
		genderList.add("Female");

		Map<String, List> map = new HashMap<String, List>();
		map.put("genderList", genderList);
		return new ModelAndView("register", "map", map);
	}

	@RequestMapping("/insert")
	public String inserData(@ModelAttribute Customer customer) {
		if (customer != null)
			customerService.addCustomer(customer);
		return "redirect:/getCustomerList";
	}

	@RequestMapping("/update")
	public String updateUser(@ModelAttribute Customer customer) {
		customerService.updateCustomerDetails(customer);
		return "redirect:/getCustomerList";

	}

	@RequestMapping("/delete")
	public String deleteUser(@RequestParam String id) {
		customerService.deleteCustomer(id);
		return "redirect:/getCustomerList";
	}
}
