class TicketNotFoundException extends Exception{

public TicketNotFoundException() {
super("Out of Stock");
}
}

class BookMyShow
{
void bookTicket(int NoOfTickets)throws TicketNotFoundException
{
if(NoOfTickets > 10)
throw new TicketNotFoundException();

else
System.out.println(NoOfTickets +" tickets Booked enjoy the show");
}

}

public class MyException {
	int x=10;

	public static void main(String[] args) {
		BookMyShow b=new BookMyShow();

		try{
		b.bookTicket(3);
		}
		
		catch (Exception e) {
		System.out.println(e);
		}
		finally {
		System.out.println("end of main");
	}

}
}
