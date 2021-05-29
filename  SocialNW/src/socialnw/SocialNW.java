package socialnw;
//i'm broken , i wish i could go back and say i'm sorry
import java.util.Scanner;

public class SocialNW {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);   
        System.out.println("Welcome sir :");  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
        checkPrime(n);
    }
   static void checkPrime(int n){  
  int i,m,flag=0;      
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
    }
    
}
