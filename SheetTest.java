import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

// test class for sheet
class TestSheet {

	@Test
	void TestStoreAndRetrieveSheet() {
		Sheet sheet = new Sheet("test.music");
		sheet.sortedMap.entrySet().forEach(entry->{
		    System.out.println(entry.toString());  
		 });
	}

	@Test
	void TestHasNotesAt() {
		Sheet sheet = new Sheet("test.music");
		sheet.sortedMap.entrySet().forEach(entry->{
		    System.out.println(entry.toString());  
		 });
		System.out.println(sheet.hasNotesAt(1));
		System.out.println(sheet.hasNotesAt(2));
	}

	
	@Test
	void TestGetNotesAt() {
		Sheet sheet = new Sheet("test.music");
		sheet.sortedMap.entrySet().forEach(entry->{
		    System.out.println(entry.toString());  
		 });
		System.out.println(sheet.getNotesAt(1).toString());
	}
	
}
