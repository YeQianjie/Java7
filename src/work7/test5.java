package work7;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        QuadraticEquation x=new  QuadraticEquation(a,b,c);
        if(1==x.getDiscriminant())
        { 
        System.out.println("The equation has two roots "+ x.getRoot1()+" and "+x.getRoot2());
       
        }
        else if(0==x.getDiscriminant())
        {
            System.out.println("The equation has one root "+ x.getRoot1());
        }
        else
            System.out.println("The equation has no real roots");
            
    
	}

}
