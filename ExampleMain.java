

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class ExampleMain {

	public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException {

		MIDISequencePlayer player = new MIDISequencePlayer(5, 200);

		player.addNote(99, 42, 21, 22);
//		player.addNote(69, 100, 5, 5);
//		player.addNote(71, 100, 15, 5);
//		player.addNote(74, 100, 10, 15);
//		player.addNote(45, 100, 15, 10);
//		player.addNote(82, 100, 5, 25);
//		player.addNote(76, 100, 10, 15);

		player.play();

	}

}
