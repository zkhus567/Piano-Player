
public class Note {

	private int time, key;
	private char noteType;
	// These 3 variabels are collected from the input file
	
	// constructor to set time, noteType, and key values
	Note(int time, char noteType, int key) {
		this.setTime(time);
		this.setNoteType(noteType);
		this.setKey(key);
	}
	
	// abstract method
	int getDuration() { 
		return 0; 
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public char getNoteType() {
		return noteType;
	}

	public void setNoteType(char noteType) {
		this.noteType = noteType;
	}
	
	public String toString() {
		return noteType + " " + key;
	}
	
}
