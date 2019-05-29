package HomePractice;
import java.util.*;
public class TV{
	public static void main(String[] args) {
		
		
		    
		  }
	 private int channel=1;
	 private  int volumeLevel=1;
	 private boolean on=false;
	 private String brand= "undefined";  
	   
	   public TV(){
	     System.out.println("Creating TV object using no Args- constructor");
	   }
	  public TV(String brand){
	    this.brand=brand;
	    System.out.println("Creating TV  object using 1 arg-constructor");
	  }
	  public int getVolumeLevel(){
	    return volumeLevel;
	  }
	  public void setVolumeLevel(int volumeLevel){
	    if((volumeLevel<=1 || volumeLevel>7)||(on==false)){
	      System.out.println("ERROR: TV is either OFF or invalid Volume level");
	    }else{
	    this.volumeLevel=volumeLevel;
	    }
	  }
	  public int getChannel(){
	    return channel;
	  }
	  public void setChannel(int channel){
	   
	   //this.channel=channel;
	   if((channel<=0 || channel>120)||(on==false)){
	     System.out.println("ERROR: TV is either OFF or invalid Channel");
	   }else{
	     this.channel=channel;
	   }
	  }
	  public String getBrand(){
	    return brand;
	  }
	  public void setBrand(String brand){
	    this.brand=brand;
	  }
	public void channelUp(){
	  setChannel(channel+1);
	}
	public void channelDown(){
	  setChannel(channel-1);
	  
	}
	public void volumeUp(){
	  setVolumeLevel(volumeLevel+1);
	}
	public void volumeDown(){
	setVolumeLevel(volumeLevel-1);
	}
	public boolean isOn(){
	 return this.on;
	}
	public void turnOn(){
	  if(on==true){
	    System.out.println("TV is already ON");
	  }else{
	    this.on=true;
	  }
	}
	public void turnOff(){
	   if(on==false){
	    System.out.println("TV is already OFF");
	}else{
	  this.on=false;
	}
	}
		
}





