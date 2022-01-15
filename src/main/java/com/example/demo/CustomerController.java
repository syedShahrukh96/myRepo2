package com.example.demo;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.CandidateRepo;
import com.example.demo.model.Candidate1;

@Controller
public class CustomerController {
		@Autowired
		CandidateRepo repo;
		
		@RequestMapping("/")
	public String home() {
		
			return "home.jsp" 	;
	}
		@RequestMapping("/addCandidate1")
		public String addCandidate1( Candidate1 candidate1)
		{
				repo.save(candidate1);
			return "home.jsp";
		}
		
		@RequestMapping("/getCandidate1")
		public ModelAndView getCandidate1(@RequestParam int	 cid)
		{
				ModelAndView mv= new ModelAndView("showCandidate1.jsp");
				Candidate1 candidate1 = repo.findById(cid).orElse(new Candidate1());
				
				System.out.println(repo.findByCtech("java"));
				System.out.println(repo.findByCidGreaterThan(2));
				
				mv.addObject(candidate1);
				return mv;
			
		}
}
