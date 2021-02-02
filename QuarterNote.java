
public class QuarterNote extends Note {

	QuarterNote(int time, char noteType, int key) {
		super(time, noteType, key);
	}

	
	/**
	 * returns the duration of a quarter note. Half note = 4
	 */
	
	@Override
	int getDuration() { 
		return 4; 
	}
	
}
