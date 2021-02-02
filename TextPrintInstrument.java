
public class TextPrintInstrument extends Instrument {

	// abstract method
	public void getValues() {

	}
	
	
	@Override
	public void play() {
		 sortedMap.entrySet().forEach(entry->{
			 System.out.println(entry.toString());  
			 }
		 );
	}
	
}
