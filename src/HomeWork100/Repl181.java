package HomeWork100;

import java.util.ArrayList;

public class Repl181 {
	public static void main(String[] args) {
		String[] r1= {"1","2","3"};
		String[] r2= {"4","5"};
	
		ArrayList<String> list = new ArrayList<>();
		  for(int i=0; i<r1.length; i++){

			list.add(r1[i]);
		  }
		  for(int i=0; i<r2.length; i++){
		    list.add(r2[i]);
		  }

System.out.println(list);

String sentence="";
for(int i=0; i<list.size(); i++) {
	sentence=sentence+list.get(i);
}
System.out.println(sentence);
//181

	}
	
}

