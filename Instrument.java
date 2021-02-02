/**
 * 
 * Gets input from the instrument of choice and BPM.
 * TextPrintInstrument and MIDIInstrument both extend off of this class
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Instrument {
	
	private int instrumentId;
	private int bpm;
	HashMap<Integer, Note> beatMap = new HashMap<>();
	Map<Integer, Note> sortedMap = new TreeMap<>(beatMap);
	
	
	// this method load the Sheet data to be used in the subclasses 
	public void loadMusic(Sheet music) {
		getValues();
		sortedMap = music.sortedMap;
	}
		
	// abstract method
	public void play() { 
		
	}
	
	// returns value of instrumentId and BPM
	public void getValues() { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Instrument ID (0-144): ");
		setInstrumentId(scan.nextInt());
		System.out.print("Enter BPM (beats per min.): ");
		setBpm(scan.nextInt());
	}

	public int getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(int instrumentId) {
		this.instrumentId = instrumentId;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
	
}
