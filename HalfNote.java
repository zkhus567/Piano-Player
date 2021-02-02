public class HalfNote extends Note {
	
	HalfNote(int time, char noteType, int key) {
		super(time, noteType, key);
	}

	
	/**
	 * returns the duration of a half note. Half note = 8
	 */
	
	@Override
	int getDuration() { 
		return 8; 
	}
	
}
