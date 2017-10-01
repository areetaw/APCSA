import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) throws FileNotFoundException{

		File f = new File("gradebook.txt");
		boolean doesExist = f.exists();
		
		Scanner input_file = new Scanner(f);
		
		String name = input_file.nextLine();
		
		String hw = input_file.nextLine();
		String amountOfHW = input_file.nextLine();
		
		// HW GRADES
		double yourHWScore = 0;
		for (int i = 0; i < Integer.parseInt(amountOfHW); i++)
		{
			String hwScore = input_file.nextLine();
			String hwTotal = input_file.nextLine();
		
			yourHWScore += Double.parseDouble(hwScore) / Double.parseDouble(hwTotal);
		}
		yourHWScore = yourHWScore / Integer.parseInt(amountOfHW);
		
		// MIDTERM SCORE
		String midtermScoress = input_file.nextLine();
		String midtermScore = input_file.nextLine();
		String midtermTotal = input_file.nextLine();
		
		double yourMidtermScore = (Double.parseDouble(midtermScore) / Double.parseDouble(midtermTotal));
		
		// FINAL SCORE
		String finalsScoress = input_file.nextLine();
		String finalScore = input_file.nextLine();
		String finalTotal = input_file.nextLine();
		
		double yourFinalScore = (Double.parseDouble(finalScore) / Double.parseDouble(finalTotal));

		// GRADE
		
		double grade = ((.5 * yourHWScore) + (.2 * yourMidtermScore) + (.3 * yourFinalScore)) * 100;
		
		if (grade >= 90.0) {
			System.out.println(name + ": " + grade + "% A");
		} else if (grade >= 80.0) {
			System.out.println(name + ": " + grade + "% B");
		} else if (grade >= 70.0) {
			System.out.println(name + ": " + grade + "% C");
		} else if (grade >= 60.0) {
			System.out.println(name + ": " + grade + "% D");
		} else {
			System.out.println(name + ": " + grade + "% F");
		}
		
		System.out.println("\t HW %: " + (yourHWScore*100));
		System.out.println("\t Midterm %: " + (yourMidtermScore*100) );
		System.out.println("\t Final %: " + (yourFinalScore* 100));
		
		input_file.close();
		
	}
}
