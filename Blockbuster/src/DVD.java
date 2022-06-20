import java.util.ArrayList;
import java.util.Scanner;

public class DVD implements Play {

	Scanner scan = new Scanner(System.in);

	public DVD() {
		
	}
	
	public DVD(String title, int runTime) {

	}

	@Override
	public void play(ArrayList<String> scenes) {
		
		System.out.println("What scene would you like to watch? (Enter a number)");
		printScenes(scenes);
		int userInput = scan.nextInt();

		System.out.println("Scene " + (userInput) + ": " + scenes.get(userInput));
	}
	
	public void printScenes(ArrayList<String> scenes) {
		for(int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene " + (i) + ": " + scenes.get(i));
		}
	}
}
