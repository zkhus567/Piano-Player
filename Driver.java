/**
 * 
 * This class takes the filename and player time from the user and launchs 
 * the program by created Instrument instances and passing Sheet objects.
 *
 */

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter filename: ");
		String fileName = kbd.next();
		Sheet music = new Sheet(fileName);
		System.out.print("Enter player type: 1 for Text, 2 for MIDI, 3 for Both: ");
		int playerType = kbd.nextInt();
		//scan.close();
		switch (playerType) {
		case 1:
			Instrument text = new TextPrintInstrument();
			text.loadMusic(music);
			text.play();
			break;
		case 2:
			Instrument midi = new MIDIInstrument();
			midi.loadMusic(music);
			midi.play();
			break;
		case 3:
			Instrument text2 = new TextPrintInstrument();
			text2.loadMusic(music);
			text2.play();
			Instrument midi2 = new MIDIInstrument();
			midi2.loadMusic(music);
			midi2.play();
			break;
		default:
			System.out.print("Invalid player type.");
		}
	
	}
	
}
