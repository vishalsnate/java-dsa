import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int num;
		
		if(a>b){
		    System.out.println(a);
		}
		else if(b>a){
		    System.out.println(b);
		}
		else{
		    System.out.println("error");
		}
	}
}
