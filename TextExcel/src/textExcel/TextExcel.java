package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel {

	public static void main(String[] args) {
	    // Add your command loop here
		
		Scanner input = new Scanner(System.in);
		Spreadsheet newOne = new Spreadsheet();
		System.out.println(newOne.getGridText());

		
		boolean run = true;
		while (run) {
    		
//			Do not use!
//			TestsALL.Helper th = new TestsALL.Helper();
//	        System.out.println(th.getText());

    		System.out.println("What is your command?");
    		String command = input.nextLine();
    		
    		if (command.equals("quit")) {
    			run = false;
    		} else {
    			System.out.println(newOne.processCommand(command));
    		}		
		}
		
	input.close();
	
	}
}