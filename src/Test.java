import java.io.IOException;
import java.text.ParseException;

public class Test {

	public void run() throws IOException, ParseException{
		//you can throw only one exception at a time
		//BUT you can put multiple items in that line
		//to let the program know you could throw one or the other
		//you have to comment out one or the other below, tho.
		
		//throw new IOException();
		//use the red error button to add an import statement
		//and the throws statement
		
		throw new ParseException("Error in whatever you want to write here.", 2);
		//that will give an error if you also have the
		//IOEx line active above
		//or you could comment out this one and activate IOEx
		
	}
}
