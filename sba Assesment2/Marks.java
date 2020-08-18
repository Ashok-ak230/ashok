class MarksNotFoundException extends Exception{
	
	public MarksNotFoundException() {
		super(" Invalid marks entered ");
		}
		}

class Marks
{
	static int max=100;
  void MarksCheck(int a)throws MarksNotFoundException
{
if(a >=0 && a<=max)
	System.out.println("Valid marks " + a);


else

	throw new MarksNotFoundException();

}




}