public class Calculate 
{
	public static int square(int x) 
	{
		int answer = (x*x);
		return answer;
	}
	
	public static int cube(int x) 
	{
		int answer = (x*x*x);
		return answer;
	}
	
	public static double average(double x, double y) 
	{
		double answer = ((x+x)/2);
		return answer;
	}
	
	public static double average(double x, double y, double z) 
	{
		double answer = ((x+y+z)/3);
		return answer;
	}
	
	public static double toDegrees(double x) 
	{
		double answer = (x*(180/3.14159));
		return answer;
	}
	
	public static double toRadians(double x) 
	{
		double answer = (x*(3.14159/180));
		return answer;
	}
	
   public static double discriminant(double a, double b, double c) 	
   {
		double answer = ((b*b) - (4*a*c));
		return answer;
	}
	
	public static String toImproperFrac(int wholeNumber, int numerator, int denominator) 
	{
		int ab = (wholeNumber*denominator + numerator);
	    String answer = ab + "/" + denominator;
		String answer2= answer.toString();
		return answer2;
	}

	public static String toMixedNum(int x, int y) 
	{
		int answer1 = x/y;
		int answer2 = (x % y);
		String answer3 = answer1 + "_" + answer2 + "/" + y;
		return answer3;
	}
	
	public static String foil(int a, int b, int c, int d, String x) 
	{
		int ac = (a*c);
		int ad = (a*d);
		int bc = (b*c);
		int bd = (b*d);
		String x1 = x + "^2";
		String answer1 = ac + x1 + " + " + (ad+bc) + x + " " + bd;
		String answer2= answer1.toString();
		return answer2;
	}

	
}