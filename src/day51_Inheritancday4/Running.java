package day51_Inheritancday4;

public class Running extends Exercise{
	@Override//hat
public int perform (int minutes) {
	System.out.println("Running");
	return minutes*10;

}
}