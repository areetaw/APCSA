public class WarmUp_8_24 
{
	public static void main(String[] args) 
	{
		String lion = "Fluffy";
		boolean hasEaten = false;
		int amAntelope = 2;
		double pmAntelope = 3.5;
		String newsReport = "";
		double totalAntelope = 0;
		
		newsReport = "In the morning " + lion + " ate ";
		newsReport = newsReport + (amAntelope + pmAntelope);
		hasEaten = (amAntelope > 0);
		totalAntelope = amAntelope + pmAntelope;
		boolean full = hasEaten && (totalAntelope > 5);
		newsReport = newsReport + ". " + lion + " is full.";
		System.out.println(newsReport);
	}
}