
public class Main {		
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			String x = " ";
			if(i%3==0)
				x += "fizz";
			if(i%5==0)
				x += "buzz";			
			System.out.println(i +"= "+ x);	
		}	
	}	
}
