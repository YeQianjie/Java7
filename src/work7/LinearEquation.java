package work7;

public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	LinearEquation(double a,double b,double c,double d,double e,double f){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	boolean isSolvable() {
		if((a*d-b*c)==0)
			return false;
		else
			return true;
	}
	double getX() {
		double x;
		x=(e*d-b*f)/(a*d-b*c);
		return x;
	}
	double getY() {
		double y;
		y=(a*f-e*c)/(a*d-b*c);
		return y;
	}

}
