package day46_Static;

	public class CalcTests {
		public static void main(String[] args) {
			double result =  Culculator.plus(55, 7);//static way
			System.out.println("Result:"+result);
			result = Culculator.minus(44, 23);
			System.out.println("Result:"+result);
			
			Culculator c = new Culculator();
			System.out.println(c.multiply(2, 4));
			int i = Integer.parseInt("33");
			System.out.println(Character.isDigit('4'));
		}

	}


