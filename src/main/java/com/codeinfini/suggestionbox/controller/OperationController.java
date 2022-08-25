package com.codeinfini.suggestionbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codeinfini.suggestionbox.model.Operation;
import com.codeinfini.suggestionbox.service.OperationService;
		


@Controller
public class OperationController
{
	@Autowired
	OperationService operationService;
	
	String solution = "";
	
	@GetMapping("/operation")
	
	public String showOperation()
	{
		return "operation";
	}

	@PostMapping("/operation-result")
	public String formResult(@ModelAttribute Operation operation, @RequestParam("operationType") 
								String operationType,  Model model)
	{
		switch (operationType) {
		case "Addition":
			solution = operation.getNombre1() + " + " + operation.getNombre2() +
			" = " + operationService.addition(operation.getNombre1(), operation.getNombre2());
			break;
		case "Soustraction":
			solution = operation.getNombre1() + " - " + operation.getNombre2() +
			" = " + operationService.soustraction(operation.getNombre1(), operation.getNombre2());
			break;
		case "Division":
			solution = operation.getNombre1() + " / " + operation.getNombre2() +
			" = " + operationService.division(operation.getNombre1(), operation.getNombre2());
			break;
		case "Multiplication":
			solution = operation.getNombre1() + " * " + operation.getNombre2() + 
			" = " + operationService.multiplication(operation.getNombre1(), operation.getNombre2());
			break;
		case "Modulo":
			solution = operation.getNombre1() + " % " + operation.getNombre2() + 
			" = " + operationService.modulo(operation.getNombre1(), operation.getNombre2());
			break;
		default: solution = "choix invalide";
			break;
		}
		
		
		model.addAttribute("solution", solution);
		model.addAttribute("nombre1", operation);
		return "operation-result";
	}
	
}
