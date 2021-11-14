package work7;

public class QuadraticEquation {
	private double a;
    private double b;
    private double c;
   public QuadraticEquation (double a2,double b2,double c2){
     this.a=a2;
     this.b=b2;
     this.c=c2;
    }
   public double getA(){
       return a;
   }
   public double getB(){
       return b;
   }
   public double getC(){
       return c;
   }
   public double getDiscriminant(){
       if(b*b-4*a*c>0)
       return 1;
       else if(b*b-4*a*c==0)
       return 0;
       else 
       return -1;
       
   }
   public double getRoot1(){
       return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
   }
   public double getRoot2(){
      return (-b-Math.sqrt(b*b-4*a*c))/(2*a); 
   }
}
