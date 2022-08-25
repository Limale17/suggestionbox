package com.codeinfini.suggestionbox.controller;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.codeinfini.suggestionbox.model.Etudiant;
import com.codeinfini.suggestionbox.service.CalculService;

@Controller
public class HelloController {
	
	@Autowired
	CalculService calculService;

	@GetMapping("/")
	String hello(Model model) {
		model.addAttribute("senegal", "Les senegal est le pays de la teranga");
		return "hello";
	}
	
	@GetMapping("/message")
	public ModelAndView getMessage() 
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message");
		modelAndView.addObject("message1", "Java est un langage de programmation orientée objet");
		modelAndView.addObject("message2", "Spring est un framework de dev web en Java");
		modelAndView.addObject("message3", "Spring Boot est extension de Spring");
		return modelAndView;
	}
	
	
	@GetMapping("/form")
	String showForm() 
	{
		
		return "form";
	}
	
	@PostMapping("/form-result")
	public String formResult(@RequestParam("prenom") String prenom, 
			@RequestParam("nom") String nom, @RequestParam("adresse") String adresse,
			@RequestParam("telephone") String telephone,@RequestParam("sexe") String sexe,
			@RequestParam("email") String email, @RequestParam("dateNaissance")
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateNaissance,
			@RequestParam("lieuNaissance") String lieuNaissance, @RequestParam("filiere") String filiere,
			@RequestParam("niveau") String niveau, @RequestParam("nationalite") String nationalite, Model model)
	{
		model.addAttribute("prenom", prenom);
		model.addAttribute("nom", nom);
		model.addAttribute("dateNaissance", dateNaissance);
		model.addAttribute("lieuNaissance", lieuNaissance);
		model.addAttribute("sexe", sexe);
		model.addAttribute("telephone", telephone);
		model.addAttribute("email", email);
		model.addAttribute("adresse", adresse);
		model.addAttribute("filiere", filiere);
		model.addAttribute("niveau", niveau);
		model.addAttribute("nationalite", nationalite);
		return "formResult";
		
	}
	
	@GetMapping("/form-etudiant")
	String showFormEtudiant() 
	{
		
		return "formEtudiant";
	}
	
	@PostMapping("/form-result-etudiant")
	public String formResult(@ModelAttribute Etudiant etudiant, Model model)
	{
		model.addAttribute("etudiant", etudiant);
		return "form-result-etudiant";
	}
	
	@GetMapping("/table-multiplication/{table}")
	public String showTable(@PathVariable("table") Integer table, Model model)
	{
		model.addAttribute("table", calculService.tableMultiplication(table));
		return "table-multiplication";
	}
}
