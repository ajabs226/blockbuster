import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean cont = true;

		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new VHS("Dumb and Dumber", 123));
		movies.add(new VHS("Beetlejuice", 234));
		movies.add(new VHS("Tarzan", 492));
		movies.add(new DVD("Avatar", 56));
		movies.add(new DVD("Mighty Ducks", 324));
		movies.add(new DVD("Space Jam", 150));

		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("Driving Mary to the Airport");
		scenes.add("Riding crosscountry");
		scenes.add("Picking up hitchhikers");
		scenes.add("Running at an incredible speed");
		scenes.add("Returning Mary's suitcase");
		scenes.add("Making the most annoying sound in the world");
		movies.get(0).setScenes(scenes);
		
		ArrayList<String> scenes2 = new ArrayList<>();
		scenes2.add("That one dance scene");;
		scenes2.add("Bungee Jumping");
		scenes2.add("Scaring everyone");
		scenes2.add("I am running out of ideas");
		scenes2.add("Haunting the family");
		scenes2.add("Saying his name three times");
		movies.get(1).setScenes(scenes);
		
		ArrayList<String> scenes3 = new ArrayList<>();
		scenes3.add("WHen Tarzan met Jane");
		scenes3.add("Swinging through the vines");
		scenes3.add("Running around with the animals");
		scenes3.add("When Tarzan fell in love with Jane");
		scenes3.add("Tarzan crashes into a tree");
		scenes3.add("Making fire");
		movies.get(2).setScenes(scenes);
		
		ArrayList<String> scenes4 = new ArrayList<>();
		scenes4.add("The war scene");
		scenes4.add("Talking to the tree");
		scenes4.add("Hunting");
		scenes4.add("Riding on those lizard-dinoasaur things");
		scenes4.add("Fighitng the bad guys");
		scenes4.add("Harvesting");
		movies.get(3).setScenes(scenes);
		
		ArrayList<String> scenes5 = new ArrayList<>();
		scenes5.add("When that one guy scored that one goal");
		scenes5.add("Ice Skating");
		scenes5.add("Hanging out");
		scenes5.add("Hockey Fight");
		scenes5.add("Having ice cream");
		scenes5.add("Winning the game");
		movies.get(4).setScenes(scenes);

		
		ArrayList<String> scenes6 = new ArrayList<>();
		scenes6.add("When that one tall basketball guy scored a basket");
		scenes6.add("Playing basketball");
		scenes6.add("Practicing");
		scenes6.add("Penalty Shot");
		scenes6.add("Beating the aliens");
		scenes6.add("Napping");
		movies.get(5).setScenes(scenes);
		
		System.out.println("Pick a movie:");
		for (Movie movie : movies) {
			System.out.println((movies.indexOf(movie) + 1) + ". " + movie.getTitle());
		}

		int input = scan.nextInt();
		movies.get(input - 1).printInfo();
	
		System.out.println("Do you want to watch the movie? (y/n):");
		String watchMovie = scan.next();
		
		scan.nextLine();
		while (cont) {
			if (watchMovie.equalsIgnoreCase("y")) {
				movies.get(input - 1).play();
				
				System.out.println("Watch another scene?");
				watchMovie = scan.next();
				
			} else if (watchMovie.equalsIgnoreCase("n")) {
				cont = false;
				
			} else {
				System.out.println("That is not an option, try again.");
				watchMovie = scan.nextLine();
				
			}
		}

		System.out.println("Goodbye!");
		scan.close();

	}

}
