import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// test class for Note
class TestNote {

	@Test
	void TestNotes() {
		Note note1 = new Note(1, 'W', 70);
		Note note2 = new Note(5, 'H', 72);
		Note note3 = new Note(7, 'Q', 74);
	}
	
	@Test
	void TestSubNotes() {
		Note wholeNote = new WholeNote(1, 'W', 69);
		System.out.println(wholeNote.getDuration());
		Note halfNote = new HalfNote(1, 'H', 67);
		System.out.println(halfNote.getDuration());
		Note quarterNote = new QuarterNote(1, 'Q', 73);
		System.out.println(quarterNote.getDuration());
	}

}
