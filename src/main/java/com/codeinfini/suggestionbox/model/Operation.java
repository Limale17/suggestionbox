package com.codeinfini.suggestionbox.model;

public class Operation {
	private int nombre1;
	private int nombre2;
	private String operationType;
	
	public Operation() {}

	public int getNombre1() {
		return nombre1;
	}

	public void setNombre1(int nombre1) {
		
		this.nombre1 = nombre1;
	}

	public int getNombre2() {
		return nombre2;
	}

	public void setNombre2(int nombre2) {
		this.nombre2 = nombre2;
	}
 
	public String getOperation() {
		return operationType;
	}

	public void setOperation(String operation) {
		this.operationType = operation;
	}

	@Override
	public String toString() {
		return "Operation [nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", operation=" + operationType + "]";
	}
	
	
}
