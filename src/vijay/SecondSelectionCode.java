package vijay;

public class SecondSelectionCode {
	
	public static void main(String[] args){
		
		int q1 = 3;
		int q2 = 4; 
		int q3 = q1+q2;
		int q4 = 7, q5 = 6;
		System.out.println(q3);
		
		q3++;
		System.out.println(q3);
		
		int Q7 = ++q3;
		System.out.println(Q7);
		
		if(q4%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
			
			
		if(q4%2==0){
			System.out.println("Even");
		}else if(q4%2!=0){
			System.out.println("Odd");
			
		}
		
		
		int n = 0;
		
		if(n==0)
			{
				System.out.println("nothing");
				System.out.println("Add more");
			}
		else if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		
		
		int w2 = 3,w5 = 6,w8;
		w8 = w2>w5?1:2;
		System.out.println(w8);
		
		
		int w9 = 22;
		
		switch (w9) {
		case 1:
			System.out.println("One");
			break;
			
		case 3:
			System.out.println("three");
			break;	

		default:
			System.out.println("No Number");
			break;
		}
		//switch doesn't support double, although, we can use string in switch above 1.6 version
			
			
	}

}
