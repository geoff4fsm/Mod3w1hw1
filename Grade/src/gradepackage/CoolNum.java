package gradepackage;

public class CoolNum {

	public static void main(String[] args) {
		int num = 25;
		String numCool = null; 
		numCool = num % 2>0 ? "Cool" : num < 5 ? "Not Cool" : num<20 ? "Cool" : "Not Cool";
System.out.println(numCool);
	}

}
