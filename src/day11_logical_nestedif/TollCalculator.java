package day11_logical_nestedif;
import java.util.*;
public class TollCalculator {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in) ;
	System.out.println("Enter Vehicle Type:1 or 2"); //1 and 2
	int carType = keyboard.nextInt();
	System.out.println("It is rush hour: yes | no");
			String answer = keyboard.next();//yes or no
			//check if rushHour string is "yes=> assign true to isRushHour;
			//if it is no assign false to isRushHour
			
			boolean isRushHour;
			if(answer.equalsIgnoreCase("yes")) {
			isRushHour = true;
			}else {
				isRushHour = false;
			}
				//System.out.println(isRushHour);
				double price = 0.0;
				if (carType==1) {
					if(isRushHour) {
						price = 30.0;//a
					}else {
						price = 5.0;//b
					}
				}else if(carType == 2) {
				   if(isRushHour) {
					price = 55.30;//c
				}else {
					price = 15.99;//d
				}
				}
					System.out.println("Toll cost: " +price);
				}
				
				}


						
				
						

				
			

