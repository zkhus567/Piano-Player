
// Reads data from the input file and tjen loads it into data structures

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Sheet {

	List<Note> sheet = new ArrayList<Note>();
	HashMap<Integer, Note> beatMap = new HashMap<>();
	Map<Integer, Note> sortedMap = new TreeMap<>(beatMap);
	
	// constructor to read file and load data into data structures
	Sheet(String fileName) { 
		sheet = readFile(fileName);
		for (Note n : sheet) {
			addNote(n.getTime(), n);
		}
		sortedMap.putAll(beatMap);
	}
	

	// this part reads and processes data
	List<Note> readFile(String fileName) { 
		// arraylist 
		List<Note> noteList = new ArrayList<Note>(); 
		int time = 0, key = 0;
		char noteType = ' ';
		Note note = new Note(key, noteType, key);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName)); 
			String line;
			try {
				while ((line = reader.readLine()) != null) { 
					String[] splitted = line.split(" "); 
					try { 
						// making time into an int
						time = Integer.parseInt(splitted[0]); 
					}
					catch (NumberFormatException ex) {
						System.out.println("Invalid time input.");
					}
					noteType = splitted[1].charAt(0); 
					try {
						key = Integer.parseInt(splitted[2]);
					}
					catch (NumberFormatException ex) {
						System.out.println("Invalid key input.");	
					}
					if (noteType == 'W') {
						note = new WholeNote(time, noteType, key);
					}
					if (noteType == 'H') {
						note = new HalfNote(time, noteType, key);
					}
					if (noteType == 'Q') {
						note = new QuarterNote(time, noteType, key);
					}
					// adding object to List
					noteList.add(note); 
				}
			}
			// two catches
			// first is for handling file reading data exception
			catch (IOException ex) { 
				System.out.println("Error reading the files data.");
			}
		}
		// second is for handling file not found exception
		catch (FileNotFoundException ex) { 
			System.out.println("The file does not exist or is corrupted.");
		}
		return noteList;
	}
	
	
	// adds a note to the beatMap
	void addNote(int time, Note note) { 
		if (note.getNoteType() == 'W') {
			beatMap.put(time, note);
		}
		else if (note.getNoteType() == 'H') {
			beatMap.put(time, note);
		}
		else if (note.getNoteType() == 'Q') {
			beatMap.put(time, note);
		}
	}
	
	
	// gets last note played by Instrument and return last time value
	int lastTime() { 
		return sortedMap.get(sortedMap.size() - 1).getTime(); 
	}
	
	
	// checks if sortedMap has notes registered at a given time
	// retruns true if found at specific time or false if not found at a time
	boolean hasNotesAt(int time) { 
		Iterator<Entry<Integer, Note>> it = sortedMap.entrySet().iterator();
		while (it.hasNext()) {
			if (sortedMap.containsKey(time)) {
				return true; 
			}else {
				return false; 
			}
		}
		return false;
	}
	
	
	// gets all notes from sheet at specified time and returns them
	ArrayList<Note> getNotesAt(int time) { 
		ArrayList<Note> notesAtBeat = new ArrayList<Note>();
		for (Note n : sheet) {
			if (n.getTime() == time) {
				notesAtBeat.add(n);
			}
		}
		return notesAtBeat;
	}
	
}