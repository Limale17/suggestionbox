package com.codeinfini.suggestionbox.service.imple;

import org.springframework.stereotype.Service;
import com.codeinfini.suggestionbox.service.OperationService;

@Service
public class OperationServiceImpl implements OperationService {

	@Override
	public float addition(int nombre1, int nombre2) {
		
		return (nombre1 + nombre2);
	}

	@Override
	public float soustraction(int nombre1, int nombre2) {
		
		return (nombre1 - nombre2);
	}

	@Override
	public float multiplication(int nombre1, int nombre2) {
		
		return (nombre1 * nombre2);
	}

	@Override
	public float division(int nombre1, int nombre2) {
		
		return (nombre1 / nombre2);
	}

	@Override
	public float modulo(int nombre1, int nombre2) {
		
		return (nombre1 % nombre2);
	}

	
}
