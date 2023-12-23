public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private static final int rows = 5;
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private static final int seats = 10;
    // TO DO: Create 2 dimensional array to store seat reservation status
    public static int[][] reservation = new int[rows][seats];
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        reservation [0][2] = 1;
        reservation [1][5] = 1;
        reservation [3][7] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Booking theater ticket");
        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < seats; b++) {
                System.out.println(reservation[a][b]);
            }
        }
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (reservation [row][seat] == 0) {
            reservation [row][seat] = 1;
            System.out.println("Seat" + (row + 1)+ "," + (seat + 1) + "has been ordered");
        } else {
            System.out.println("Error: " + (row + 1)+ "," + (seat + 1) + "has already been booked");
        }
    }
}