import java.util.ArrayList;

public class VHS extends Movie{
	private int currentTime;
	
	public VHS(String title, int runTime) {
		super.setTitle(title);
		super.setRunTime(runTime);
	}
	
	public int getCurrentTime() {
		return currentTime;
	}
	
	@Override
	public void play() {
		ArrayList<String> movieScenes = super.getScenes();
		System.out.println("Scene " + currentTime + ": " + movieScenes.get(currentTime));
		currentTime++;
		
		if (currentTime >= movieScenes.size()) {
			rewind();
		}
	}
	
	public void rewind() {
		currentTime = 0;
	}
}
