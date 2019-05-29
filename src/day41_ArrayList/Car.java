package day41_ArrayList;
import java.util.*;
public class Car {
	//public static void main(String[] args) {
		String  make;
		String model;
		int  currentSpeed;
		String color;
				
	
public  void printCarInfo() {
	//System.out.println("Car make"+"["+make+"]"+"model"+"["+model"]"+"color"+"["+color+"]");

			String info = "Car make ["+ make+ "] model, ["+ model+"], color ["+color+"], "
			             + "currentSpeed[" + currentSpeed+"]";
			     System.out.println(info);
}
public void showCurrentSpeed(int speedLimit) {
	if(currentSpeed <= speedLimit) {
		System.out.println(make+" is driving at "+currentSpeed+
				" mph, following the speed limit -" + speedLimit);
	}else {
		System.out.println(make+" is driving at "+currentSpeed+
				" mph, over the speed limit -" + speedLimit);
	}
	
	}
public void drive() {
	System.out.println(make + " " + model + " is driving ...");
}


public void accellerate(int mph) {
	currentSpeed=currentSpeed+mph;//currentSpeed+=mph
	
}
}
