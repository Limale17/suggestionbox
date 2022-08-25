package com.codeinfini.suggestionbox.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codeinfini.suggestionbox.service.CalculService;

@Service
public class CalculServiceImpl implements CalculService {

	@Override
	public List<String> tableMultiplication(Integer tableMultiplication) {
		List<String> ligneTableMultiplication = new ArrayList<>();
		int table = tableMultiplication;
		String ligne;
		for(int i=1; i<=12; i++) 
		{
			ligne = table + " * " + i + " = " + (table * i);
			ligneTableMultiplication.add(ligne);
			ligne = "";
		}
		return ligneTableMultiplication;
	}

}
