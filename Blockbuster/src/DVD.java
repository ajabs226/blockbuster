import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie {

	Scanner scan = new Scanner(System.in);

	public DVD(String title, int runTime) {
		super.setTitle(title);
		super.setRunTime(runTime);
	}

	@Override
	public void play() {
		ArrayList<String> movieScenes = super.getScenes();
		
		System.out.println("What scene would you like to watch? (0-4)");
		super.printScenes();
		int userInput = scan.nextInt();

		System.out.println("Scene " + (userInput) + ": " + movieScenes.get(userInput));
	}
}
