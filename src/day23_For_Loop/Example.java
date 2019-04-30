package day23_For_Loop;
import java.util.*;
public class Example {
	public static void main(String[] args) {
		for(int i = 0; i <= 50; i++) {
			if(i % 20 == 0) {
				continue;
			}
			if(i % 5 == 0) {//21
				break;
		
			}
			System.out.print(i + ", ");
		}
	}

}



/*for(int i = 0; i <= 50; i++) {
	if(i % 5 == 0) &&(i% 20 !=0)){
		continue;
	}
	if(i % 20 == 0) {//21
		break;
	}
	System.out.print(i + ", ");
}
}
*/

