
/**
 * 
 * This class is used to access the MIDISequencePlayer to play the input
 * notes by going through the TreeMap.
 * 
 */

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class MIDIInstrument extends Instrument {

	@Override
	public void play() { 
		try {
			MIDISequencePlayer MIDI = new MIDISequencePlayer(getInstrumentId(), getBpm());
			sortedMap.entrySet().forEach(entry->{
			    
				try {
					MIDI.addNote(entry.getValue().getKey(), 100, entry.getKey(), entry.getValue().getDuration());
				} catch (InvalidMidiDataException e) {
					System.out.println("MIDI Data Error.");
				}
			 }
			
			);
			MIDI.play();
		}
		catch (InvalidMidiDataException | MidiUnavailableException em) {
			System.out.println("MIDI Data Error.");
		}
	}
	
}
