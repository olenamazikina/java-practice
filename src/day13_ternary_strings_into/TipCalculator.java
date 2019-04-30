package day13_ternary_strings_into;
import java.util.*;
public class TipCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        double tipPercent, check;
        boolean split;
        int people;
        String split1, quality;
        tipPercent = 0.0;
        
        System.out.println("Split:");
        split1 = in.next();
        split = split1.equalsIgnoreCase("yes");
        
    
        
        System.out.println("Number of people:");
        people = in.nextInt();
        if (people > 10) {
            System.out.println("thats too many people!\n10 people is the maximum number of people that our reciept mathematicians can calculate to, they only get 8.50/hour\nNumber of people has been set to 10");
            people = 10;
        } else if (people<=0) {
            System.out.println("You entered " +people+"\nI will assume you meant 1.");
            people=1;
        }
     
        System.out.println("Check amount:");
        check = in.nextDouble();
        
        System.out.println("Service Quality:");
        quality = in.next();
        
       
        if (quality.equalsIgnoreCase("poor")) {
            tipPercent = 0.05;
        } else if (quality.equalsIgnoreCase("fair")) {
            tipPercent = 0.10;
        } else if (quality.equalsIgnoreCase("good")) {
            tipPercent = 0.15;
        } else if (quality.equalsIgnoreCase("great")) {
            tipPercent = 0.20;
        } else if (quality.equalsIgnoreCase("excellent")) {
            tipPercent = 0.25;
        } else {
            System.out.println("Please enter: poor, fair, good, great, or excellent");
            return;
        }
        in.close();
        
        switch (people) {
        case 1:
            System.out.println("Number of people entered: &");
            break;
        case 2:
            System.out.println("Number of people entered: &&");
            break;
        case 3:
            System.out.println("Number of people entered: &&&");
            break;
        case 4:
            System.out.println("Number of people entered: &&&&");
            break;
        case 5:
            System.out.println("Number of people entered: &&&&&");
            break;
        case 6:
            System.out.println("Number of people entered: &&&&&&");
            break;
        case 7:
            System.out.println("Number of people entered: &&&&&&&");
            break;
        case 8:
            System.out.println("Number of people entered: &&&&&&&&");
            break;
        case 9:
            System.out.println("Number of people entered: &&&&&&&&&");
            break;
        case 10:
            System.out.println("Number of people entered: &&&&&&&&&&");
            break;
    }
        
        System.out.println("Total to pay: " + (check + (check * tipPercent)));
        System.out.println("Total tip: " + (check * tipPercent));
        if (split == true) {
        System.out.println("Total per person: " + ((check + (check * tipPercent)) / people));
        System.out.println("Tip per person: " + ((check * tipPercent) / people));
        }
    }
}

	