import java.util.Scanner;
public class timeEnglish {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What time is it in hours?");
		int hours=in.nextInt();
		System.out.println("How many minutes?");
		int minutes= in.nextInt();
		if(hours >=1 && hours <=12 && minutes>=0 && minutes<=60)System.out.println(getTimeName(hours,minutes));
		else System.out.println("Invalid");
	}


public static String getTimeName(int hours, int minutes){
	String word= "";
	String english="";

	if (hours==1)english= "one";
	else if (hours==2)english="two";
	else if (hours==3) english="three";
	else if (hours==4) english="four";
	else if (hours==5) english="five";
	else if (hours==6)english="six";
	else if (hours==7)english="seven";
	else if (hours==8)english="eight";
	else if (hours==9)english="nine";
	else if (hours==10)english="ten";
	else if (hours==11)english="eleven";
	else english="twelve";
				

	if (minutes==0) word= hours+" o'clock";
	else if (minutes==15 )word = "Quarter after " + english;
	else if (minutes==30 )word = "Half past " + english;
	else if( minutes==45 )word = "Quarter til " + english;
	else word= minutes +" minutes past " + english;
	return word;
	
}
	
}
