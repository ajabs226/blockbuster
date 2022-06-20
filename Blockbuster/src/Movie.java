import java.util.ArrayList;

public class Movie {

	// fields
	private String title;
	private int runTime;
	private ArrayList<String> scenes;
	private Play play;

	// getters & setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	public void printInfo() {
		System.out.println(title);
		System.out.println("Runtime: " + runTime + " minutes");
	}

	public void printScenes() {
		for(String scene : scenes) {
			System.out.println("Scene " + scenes.indexOf(scene) + ": " + scene);
		}
	}
	
	//default constructor
	public Movie() {

	}

	//overloaded constructor
	public Movie(String title, int runTime, ArrayList<String> scenes, Play play) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
		this.play = play;
	}
	
	public void play() {
		play.play(scenes);
	}

}