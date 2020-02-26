package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

	import com.model.Userdata;

@Controller
public class DiscountController {
	public List<Userdata> userList=new ArrayList<Userdata>();
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(@ModelAttribute("currentUser") Userdata ud) {
		return "index";
	}

	@RequestMapping(value = "/SignUp", method = RequestMethod.GET)
	public String signUp(@ModelAttribute("currentUser") Userdata ud) {
		return "signup";
	}
	
	
	
	
	
	
	@ModelAttribute("userList")
	public Map<String, String> buildState() {
		Map<String, String> map = new HashMap<>();
		map.put("techie", "techie");
		map.put("mentor", "mentor");
		map.put("pitcher", "pitcher");
		return map;
	}
	/*
	 * @RequestMapping(value = "/result", method = RequestMethod.GET) public String
	 * result(@Valid @ModelAttribute("discount") DiscountBean db,BindingResult
	 * result,ModelMap m) { if(result.hasErrors()) { return
	 * "discountPriceCalculation"; } DiscountBean d = new DiscountBean(); double ans
	 * = d.calculateFinal(db); m.addAttribute("ans",ans); return "thankyou"; }
	 */

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(@ModelAttribute("currentUser") Userdata ud,BindingResult result,ModelMap m) {
		
		
		userList.add(ud);
		return "index";
	}
	
	@RequestMapping(value = "/loginprocess", method = RequestMethod.GET)
	public String login(@ModelAttribute("currentUser") Userdata ud,BindingResult result,ModelMap m) {
		
		String user=ud.getUsername();
		String pass=ud.getPassword();
		String loginAs=ud.getLoginAs();
		for(Userdata us:userList) {
			if(user.equals(us.getUsername())){
				if(pass.equals(us.getPassword())) {
					
					
					
					m.addAttribute("loginAs", loginAs);
					m.addAttribute("username",user);
					if(loginAs.equals("techie")) {
						
						return "techie";
					}else if(loginAs.equals("mentor")) {
						return "mentor";
					}
					else {
						return "pitcher";
					}
					
					
				}
			}
		}
		return "thankyou";
	}
	
	
}
