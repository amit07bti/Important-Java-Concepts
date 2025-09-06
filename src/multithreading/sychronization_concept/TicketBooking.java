package multithreading.sychronization_concept;

public class TicketBooking {

    int total_seats=10;

 public synchronized void booking_seats(int seats){

     if (total_seats>=seats){
         System.out.println(seats+":   Ticket booking Successfully ");
         total_seats=total_seats-seats;
         System.out.println(total_seats+":  Left Seats");
     }else {
         System.out.println("Oops Sorry can not be ticket booking..");
         System.out.println("seats left  "+total_seats);
     }

 }

}

class Book extends  Thread{
    int seats;
   static TicketBooking b;

    public void run(){
        b.booking_seats(seats);


    }
    public static void main(String[] args) {
        b=new TicketBooking();

        Book amit= new Book();
        amit.seats=7;
        amit.start();

        Book manoj= new Book();
        manoj.seats=6;
        manoj.start();





    }
}
