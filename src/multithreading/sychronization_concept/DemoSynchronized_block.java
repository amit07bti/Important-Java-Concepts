package multithreading.sychronization_concept;

public class DemoSynchronized_block {


        int total_seats=10;

        public  void booking_seats(int seats){
            System.out.println("Hi  : "+Thread.currentThread().getName());
            System.out.println("Hi  : "+Thread.currentThread().getName());
            System.out.println("Hi  : "+Thread.currentThread().getName());
           synchronized (this){
               if (total_seats>=seats){
                   System.out.println(seats+":   Ticket booking Successfully ");
                   total_seats=total_seats-seats;
                   System.out.println(total_seats+":  Left Seats");
               }else {
                   System.out.println("Oops Sorry can not be ticket booking..");
                   System.out.println("seats left  "+total_seats);
               }
           }

            System.out.println("Hi  : "+Thread.currentThread().getName());
            System.out.println("Hi  : "+Thread.currentThread().getName());
            System.out.println("Hi  : "+Thread.currentThread().getName());
            System.out.println("Hi  : "+Thread.currentThread().getName());

        }


    }

    class Book_block extends  Thread{
        int seats;
        static DemoSynchronized_block b;

        public void run(){
            b.booking_seats(seats);


        }
        public static void main(String[] args) {
            b=new DemoSynchronized_block();

           Book_block amit= new Book_block();
            amit.seats=7;
            amit.start();

            Book_block manoj= new Book_block();
            manoj.seats=6;
            manoj.start();





        }
    }


