package com.controller;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.model.HelperBean;

import com.service.HelperService;

//use appropriate annotation to configure HelpController as Controller

@Controller

public class HelpController {

	@Autowired

	private HelperService helpService;

	@RequestMapping(value = "/showPage", method = RequestMethod.GET)

	public String showPage(@ModelAttribute("helper") HelperBean helper) {

		String page = "showpage";

		return page;

	}

	

}