import java.util.ArrayList;

public abstract class Movie {

	// fields
	private String title;
	private int runTime;
	private ArrayList<String> scenes;

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
	
	//Constructors 
	/*
	 * public Movie(String title, int runTime) { setTitle(title);
	 * setRunTime(runTime); }
	 */

	public void printInfo() {
		System.out.println(title);
		System.out.println("Runtime: " + runTime + " minutes");
	}

	public void printScenes() {
		for(String scene : scenes) {
			System.out.println("Scene " + scenes.indexOf(scene) + ": " + scene);
		}
	}

	public abstract void play();

}