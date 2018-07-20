
public class Main {		
	public static void main(String[] args) {
		
		//loop statement to check numbers 1-100
		for(int i=1; i<=100; i++) {			
			
			//creates empty string to put fizz or buzz into
			String x = " ";			
			
			//checks if "i" is divisible by 3
			if(i%3==0)
				x += "fizz";
			
			//checks if "i" is divisible by 5
			if(i%5==0)
				x += "buzz";
			
			//print whatever "i" has been tagged as
			System.out.println(i +"= "+ x);	
		}	
	}	
}
