public class Cashier extends Bioskop {
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        boolean isBooked = false;

        for (int i = 0; i < super.reservation.length; i++) {
            for (int j = 0; j < super.reservation[i].length; j++) {
                if (!((i == 0 && j ==2) || (i == 1 && j ==5) || (i == 3 && j ==7))){
                    if (super.reservation[i][j] == 1) {
                        isBooked = true;
                        System.out.println("Printing ticket...");
                        System.out.println("====================");
                        System.out.println("name" + user.getName());
                        System.out.println("Phone Number" + user.getnoHandPhone());
                        System.out.println("Seat" + (i+1)+","+(j+1));
                        System.out.println("======================");
                        System.out.println("Enjoy the Movie");
                    }
                }
            }
        }
        if (!isBooked) {
            System.out.println("Anda Belom pesan Kursi!");
        }
    }
}

