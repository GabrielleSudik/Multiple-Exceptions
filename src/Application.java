import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

//throwing and handling multiple exceptions

public class Application {

	public static void main(String[] args) throws IOException, ParseException {
		//the throws statements were added after you created the methods in Test
		//and then added them here using the error menu
		
		Test test1 = new Test();
		
		test1.run();
		//you'll have to manage the error with the menu
		//use the add throws selection. it will
		//add the exceptions you put into the Test class
		
		//another option: add try-catch blocks
		//you can't do both try-catch and throws at the same time
		//but it will create one try and two catches
		//(one catch for each exception method)
		
		//finally, you could try multicatch block
		//it will put all of your exception methods into one catch statement
		
		//java reads catch blocks in order (like if statements)
		//so you want to order your catch blocks in order of most specific/accurate error
		//otherwise you'll get error messages that aren't as useful as they could be
		//actually, teacher is talking about putting child exceptions before parent exceptions
		//but I think the rationale is the same -- the vaguer exception is in the parent
	}
	
}
