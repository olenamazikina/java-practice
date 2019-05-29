package day51_Inheritancday4;
/*Exercise:
	public int perform(int minutes)
		"Doing general exercise"
			4 calories per minute
	-> Running
		"Running"
		10 cal/minute
	-> Swimming
		11 cal/minute
	-> Yoga
		5 cal/minute
	-> JuiJitsu
		12 cal/minute

	perform(int minutes)
		4 calories per minute

*/

public class Exercise {
	public int perform(int minutes) {
		System.out.println("Performing general Exersise");
		return minutes*4;
	}
}
/*Myltiple classes can btored in same file , 
 * but only one of them needs to be public , 
 * and file name must match the public class*/
