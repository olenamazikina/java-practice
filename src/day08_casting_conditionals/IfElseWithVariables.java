package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temperature = 45;//65 change
		if(temperature >= 65) {
			System.out.println("It is a nice day! Lets code java");
		}else {
			System.out.println("Stay home and code java");
			//condition true
		}
		//2 int variables, teamAscore, team BScore
		//put a condition. check if teamA won. 
		//"Team A won"
		//Go to Team A!
		//else "team b won or it was a draw"
		int teamAScore = 1, teamBScore = 4;
		
		if(teamAScore > teamBScore) {
			System.out.println("Team A Won!");
			System.out.println("Go Team A!");
		}else{
			System.out.println("Team B won or it was a draw");
			System.out.println("Go Teams!");
		}
		
		
	}

}
