package day33_methods02;

public class CalcTest {
	public static void main(String[] args) {
		
		
		System.out.println( MethodCulculator.add(3,1));
		System.out.println( MethodCulculator.multiply(5, 6));
		System.out.println( MethodCulculator.minus(45,35));
		System.out.println( MethodCulculator.divide(100, 2));
		
		//fix method add chengh place
		int addResult = MethodCulculator.add(21,87);
		double mResult= MethodCulculator.multiply(50,40);
		double miResult= MethodCulculator.minus(34,20);
		double dResult= MethodCulculator.divide(500,40);
		
		
		System.out.println("mResult:"+mResult);
		System.out.println("miResult:"+miResult);
		System.out.println("dResult:"+dResult);
		
		double a = 10.0,b = 5.0;
		double myResult= MethodCulculator.minus(a,b);
		System.out.println("myresalt"+myResult);
		
		
		double[]dNums = {2.0,4.0};
		double result2= MethodCulculator.multiply(dNums[0], dNums[1]);
		
		if (MethodCulculator.add(10,16)==26) {
			System.out.println("Add Unit test Passed");
		}else {
			System.out.println("Add Unit test failed");
		}
		String str = "java";
		if(str.length() ==4) {
			System.out.println("It is 4 characters");
		}else {
			System.out.println("It is  not 4 characters");
		}
	}

}
