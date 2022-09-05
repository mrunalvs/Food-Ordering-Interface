/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.
FOOD ORDERING SYSTEM
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
		boolean entr=true;
		String name="Mani",come="";
		long contactNo=100;
		while(true){
		    if(entr){
		        System.out.println("\n--------------------->WELCOME TO 5 STAR HOTEL<-------------------------\n");
		        System.out.println("Please let us know your good name ");
		        name=sc.next();
		        System.out.println("Please let us know your no. ");
		        contactNo=sc.nextLong();
		        System.out.println("Are you new here ");
		        come=sc.next();
		        come=come.toUpperCase();
		        if(come.equals("NO")){
		            System.out.println("Dear Customer Please SignUp using emailID ");
		        }
		        entr=false;
		    }
		    System.out.println("**********************************************\nEnter 1 for adding element \nEnter 2 for removing element \nEnter 3 if you are done\n**********************************************\n");
		    int value=sc.nextInt();
		    String element;
		    boolean entry=true;
		    switch (value)
		    {
		        case 1:
		            System.out.println("Enter the element you want to add ");
		            element=sc.next();
		            element=String.valueOf(element);
		            element=element.toUpperCase();
		            a.add(element);
		            System.out.println("Your cart Contains: "+a);
		            break;
		        case 2:
		            System.out.println("Enter the element you want to remove ");
		            element=sc.next();
		            element=String.valueOf(element);
		            element=element.toUpperCase();
		            if(a.contains(element)==false){
		                System.out.println("No such item you have ever added ");
		            }else{
		                a.remove(element);
		            }
		            System.out.println("Your cart Contains: "+a);
		            break;
		        case 3:
		            System.out.println("----------YOUR BILL IS READY------------\nName : "+name+"\nContact No. : "+contactNo+"\nDear Customer Your cart contains "+a);
		            System.out.println("Thank You For Your Visit! Have A Great Day \n\n\n\n\n\n ");
		            entr=true;
		            break;
		    }
		}
	}
}


