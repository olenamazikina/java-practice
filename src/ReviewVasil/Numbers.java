package ReviewVasil;

public class Numbers {
	public static void main(String[] args) {
		int [] numbers=  {421, 235, 435, 64, 547 , 63, 54, 845, 4};
		double[] doubleNumbers= {42.1, 23.5, 435.0, 64.56, 547.3 , 63.3, 5.4, 84.5, 4.0};
		int m = finMin(numbers);
		///this for double
		double m2=finMin(doubleNumbers);
		System.out.println(m);
		System.out.println(m2);
				
	}
public static int finMin(int[]arr) {
	int min = arr[0];
	for(int i:arr) {
		if(i<min) {
			min=i;
		}
	}
	return min;
}

public static double finMin(double[]arr) {
	double min = arr[0];
	for(double i:arr) {
		if(i<min) {
			min=i;
			min=i;
		}
	}
	return min;
}
}