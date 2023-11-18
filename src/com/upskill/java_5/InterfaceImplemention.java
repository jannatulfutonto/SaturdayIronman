package com.upskill.java_5;

public class InterfaceImplemention implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 doors");
		
	}

	@Override
	public String iEngine() {
		System.out.println("Dual engine");
		return "Dual Motor";
	}

	@Override
	public void iColor() {
		System.out.println("My car is black");
		
	}

	@Override
	public int iWheel() {
        System.out.println("My car has 4 wheels");
        return 4;
	}

}

