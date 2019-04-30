package day13_ternary_strings_into;

public class Ternary {
	public static void main(String[] args) {
		String result;
			int score = 88;//78
	if(score>60) {
		result = "pass";
	}else {
		result = "fail";
	}
	result = score>60?"pass":"fail";
	System.out.println("Result is "+result);
	}
	}
	


