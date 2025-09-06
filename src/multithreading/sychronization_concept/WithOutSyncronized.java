package multithreading.sychronization_concept;

public class WithOutSyncronized {

    int total_seats = 10;

    public void bookSheet(int seats) {
        if (total_seats >= seats) {

            System.out.println(seats + "     sheet booking successfully");

            total_seats = total_seats - seats;

            System.out.println("left sheet" + total_seats);
        } else {
            System.out.println("OOPs  sorry sheet can not booked.......!");
            System.out.println("sheet left:  " + total_seats);
        }
    }

    static class MoviesBook extends  Thread{

         static WithOutSyncronized b;
         int seats;

        public void run(){
            b.bookSheet(seats);

        }

        public static void main(String[] args) {
            b= new WithOutSyncronized();

            MoviesBook jafer= new MoviesBook();
            jafer.seats=2;
            jafer.start();

            MoviesBook amit =new MoviesBook();
            amit.seats=7;
            amit.start();


        }

    }
}
