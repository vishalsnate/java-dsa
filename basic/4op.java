import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc= new Scanner(System.in);
		char op=sc.next().charAt(0);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum;
		
		if(op == '+'){
		    sum = a+b;
		    System.out.println(sum);
		}
		else if(op == '-'){
		    sum = a-b;
		    System.out.println(sum);
		}
		else if(op == '*'){
		    sum = a*b;
		    System.out.println(sum);
		}
		else if(op == '/'){
		    sum = a+b;
		    System.out.println(sum);
		}
		else{
		    System.out.println("error");
		}
	}
}
