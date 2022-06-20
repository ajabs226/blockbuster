import java.util.ArrayList;

public class VHS implements Play {
	private int currentTime;

	public VHS() {

	}

	public int getCurrentTime() {
		return currentTime;
	}

	@Override
	public void play(ArrayList<String> scenes) {
		for (String scene : scenes) {
			System.out.println("Scene " + scenes.indexOf(scene) + ": " + scene);

			if (currentTime > scenes.size()) {
				rewind();
			}
		}
	}

	public void rewind() {
		currentTime = 0;
	}

}
