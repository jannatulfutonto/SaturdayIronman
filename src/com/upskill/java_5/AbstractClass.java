package com.upskill.java_5;

public abstract class AbstractClass {
		
    //Abstract class has both abstract method and regular method
	
	public abstract void iDoor();
	
	public abstract String iEngine();
	
	public abstract void iColor();
	
	public abstract int iWheel();
	
	public void car() {
		System.out.println("My car is Audi");
	}

}

/*
(Parent)				   (Keyword) 			(Child)				 (Keyword) 				(GrandChild)
						
Class						extends				 Class		 
Abstract Class (+2)  		extends				 Class (-2=0)
Interface (+2)			  implements			 Class (-2=0)
Interface (+2)				 extends			 Interface (+2+2=+4)    implements			 Class(-4=0)

*/
