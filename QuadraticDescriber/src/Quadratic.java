import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {

//      Quadratic will be responsible for all the calculations.  
//		It must contain the following method whose header is provided below:
//		Feel free to copy and paste methods from your calculate class into your 
//		Quadratic class.  In some instances, you may need to alter them slightly 
//		(to handle doubles instead of ints, for example).
		   public static void quadrDescriber (double a, double, b, double c)
		   System.out.println("hi");
		   public static void quadrDescriber (double a, double, b, double c)
		   System.out.println(QuadraticClient);


		
	}
	
	public static String quadForm(double a, double b, double c) {
		
		double plus = ((-b) + (sqrt((square(b))-(4*a*c))));
		double minus = ((-b) - (sqrt((square(b))-(4*a*c))));
		
		String answer = "";
		
		if ( (discriminant( a, b, c)) > 0 ) {
			answer = ((round2(plus)) + " and " + (round2(minus)));
		} else if ( (discriminant( a, b, c)) == 0 ) {
			answer = (round2(plus)) + "";
		} else if ( (discriminant( a, b, c)) < 0 ) {
			answer = "no real roots";
		}
		return answer;
	}	
	
	public static double sqrt(double valuePassed) {
		
		// pre: valuePassed >= 0
		// post: returns number factorial (number!)
		if ( valuePassed < 0 ) {
			throw new IllegalArgumentException("negative number: " + valuePassed);
		} 
				
		double a = (valuePassed/2); // should be a guess
		a = 0.5 * ((valuePassed/a) + a);
		
		while (absValue(valuePassed - a*a) >= 0.005) { 
			a = 0.5 * ((valuePassed/a) + a);
		}	
		
		return round2(a);
	}
	
	public static double round2(double x) {	
		double x_hundred = x*100; 
		double hundredth = x_hundred % 1; 
		double rounded_hundred = (x_hundred - hundredth); 
			
		if (hundredth >= 0.5){               //rounds up if needed
			rounded_hundred += 1;
		} else if (hundredth <= -0.5) {
			rounded_hundred -= 1;
		}	
		
		double rounded = rounded_hundred/100;  // rounded to 2 decimal places
		return rounded;
	}
	
	public static double absValue(double a) {
		if (a > 0) {
			return a;
		} else {
			return (a*-1);
		}
	}
	
	public static String foil(double a, double b, double c, double d, String x) {
		double ac = (a*c);
		double ad = (a*d);
		double bc = (b*c);
		double bd = (b*d);
		String x1 = x + "^2";
		String answer1 = ac + x1 + " + " + (ad+bc) + x + " " + bd;
		String answer2= answer1.toString();
		return answer2;
	}
	
	public static double discriminant(double a, double b, double c) {
			double answer = ((b*b) - (4*a*c));
			return answer;
	}
	
	public static double square(double x) {
		double answer = (x*x);
		return answer;
	}

}
