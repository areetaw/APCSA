public class DoMath {

	public static void main(String[] args) 
	{
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5,10));
		System.out.println(Calculate.average(10,10,10));
		System.out.println(Calculate.toDegrees(10));
		System.out.println(Calculate.toRadians(10));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n" ));
	}

}