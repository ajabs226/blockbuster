import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean cont = true;

		ArrayList<Movie> movies = new ArrayList<>();

		ArrayList<String> DumbAndDumberScenes = new ArrayList<String>(Arrays.asList("Driving Mary to the Airport",
				"Driving crosscountry", "Picking up hitchhikers", "Running at an incredible speed",
				"Returning Mary's suitcase", "Making the most annoying sound in the world"));
		movies.add(new Movie("Dumb and Dumber", 123, DumbAndDumberScenes, new VHS()));
		movies.get(0).setScenes(DumbAndDumberScenes);

		ArrayList<String> BeetlejuiceScenes = new ArrayList<>(Arrays.asList("That one dance scene", "Bungee Jumping",
				"Scaring everyone", "I am running out of ideas", "Haunting the family", "Saying his name three times"));
		movies.add(new Movie("Beetlejuice", 234, BeetlejuiceScenes, new VHS()));
		movies.get(1).setScenes(BeetlejuiceScenes);

		ArrayList<String> TarzanScenes = new ArrayList<>(
				Arrays.asList("When Tarzan met Jane", "Swinging through the vines", "Running around with the animals",
						"When Tarzan fell in love with Jane", "Tarzan crashes into a tree", "Making fire"));
		movies.add(new Movie("Tarzan", 492, TarzanScenes, new VHS()));
		movies.get(2).setScenes(TarzanScenes);

		ArrayList<String> AvatarScenes = new ArrayList<>(Arrays.asList("The war scene", "Talking to the tree",
				"Hunting", "Riding on those lizard-dinoasaur things", "Fighitng the bad guys", "Harvesting"));
		movies.add(new Movie("Avatar", 56, AvatarScenes, new DVD()));
		movies.get(3).setScenes(AvatarScenes);

		ArrayList<String> MightyDucksScenes = new ArrayList<>(Arrays.asList("When that one guy scored that one goal",
				"Ice Skating", "Hanging out", "Hockey Fight", "Having ice cream", "Winning the game"));
		movies.add(new Movie("Mighty Ducks", 324, MightyDucksScenes, new DVD()));
		movies.get(4).setScenes(MightyDucksScenes);

		ArrayList<String> SpaceJamScenes = new ArrayList<>(
				Arrays.asList("When that one tall basketball guy scored a basket", "Playing basketball", "Practicing",
						"Penalty Shot", "Beating the aliens", "Napping"));
		movies.add(new Movie("Space Jam", 150, SpaceJamScenes, new DVD()));
		movies.get(5).setScenes(SpaceJamScenes);

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
