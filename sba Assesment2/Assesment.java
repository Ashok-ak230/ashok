public class Assesment {

	public static void main(String[] args) {
		Marks a= new Marks();
		try{
			
			a.MarksCheck(80);
			a.MarksCheck(40);
			a.MarksCheck(30);
			a.MarksCheck(90);
			a.MarksCheck(110);
			
			}
			catch (Exception e) {
		
			System.out.println(e);
			}


	}

}