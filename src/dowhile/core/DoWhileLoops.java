package dowhile.core;

public class DoWhileLoops {

	public static void main(String[] args) throws InterruptedException{
		
		int i = 0;
		
		do{
		
			System.out.println("This Has Been Done: " + i + " Times");
	
			i++;
	
			Thread.sleep(1000);
			
		}while(i <= 100);
		
	}
}
