import java.util.*;
public class BestOfTwo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		while(n>0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    
		    if(x>y){
		        System.out.println(x);
		    }
		    else{
		        System.out.println(y);
		    }
		    n--;
		}
        sc.close();
	}
}