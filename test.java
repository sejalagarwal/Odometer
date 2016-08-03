public class Test {

	public static void main (String[] args) throws java.lang.Exception
	{
	//Odometer obj=new Odometer();
	if(6789==Odometer.getPrevious(1234))
		System.out.println("Previous number is correct");
	
	if(1235==Odometer.getNext(1234))
		System.out.println("Next number is correct");
	
	if(Odometer.isAscending(1234))
		System.out.println("Valid Reading");
	else
		System.out.println("Invalid Reading");
	
	if(Odometer.getNthNext(2345, 3)==2348)
		System.out.println("NthNext is Correct");
	else
		System.out.println("NthNext is incorrect");
		
	}
}
