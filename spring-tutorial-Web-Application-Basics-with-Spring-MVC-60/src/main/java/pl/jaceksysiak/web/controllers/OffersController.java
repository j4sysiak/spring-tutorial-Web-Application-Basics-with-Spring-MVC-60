package pl.jaceksysiak.web.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {

	//  1. sposob
//	@RequestMapping("/")
//	public ModelAndView showHome(){
//		
//		ModelAndView mv = new ModelAndView("home");
//		
//		Map<String, Object> model = mv.getModel();
//		
//		model.put("name", "<b>Eric</b>");
//		
//		return mv;
//	}
	
	
	// 2. sposob
	@RequestMapping("/")
	public String showHome(Model model){
		
		model.addAttribute("name", "Karol");
		
		return "home";
	}

}



































