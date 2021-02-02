
// WholeNote - represents the 'W' wholenote keys and returns its duration.

public class WholeNote extends Note {

	WholeNote(int time, char noteType, int key) {
		super(time, noteType, key);
	}
	
	
	/**
	 * returns the duration of a whole note. Half note = 16
	 */

	@Override
	public int getDuration() {
		return 16; 
	}
	
}
