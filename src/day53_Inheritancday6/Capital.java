package day53_Inheritancday6;

public class Capital  extends City{
	private long population;
	public int count = 1;
	
	public long getPopulation() {
		return population;
	}
	public void displayCount() {
		System.out.println("City count:"+super.count);
		System.out.println("Capital count:"+count);
	}
@Override
public String toString() {
	return super.toString()+" population:"+population+ "countcap"+count;
}

	public void setPopulation(long population) {
		this.population = population;
	}


	public Capital (int id,String name,long population) {
		super(id,name);
		this.population =population;
	}


}
