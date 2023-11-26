import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor identifikasi kendaraan: ");
        String IdefNum = scanner.next();

        System.out.print("Masukkan kecepatan maksimum Kendaraan (km/h): ");
        double MaxSpeed = scanner.nextDouble();

        System.out.print("Masukkan kapasitas penumpang kendaraan: ");
        int PasCap = scanner.nextInt();

        System.out.print("Masukkan jarak perjalan: ");
        double distance = scanner.nextDouble();

        System.out.println("Pilih tipe kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Bus");
        System.out.print("Pilihan(1/2): ");

        int NUM = scanner.nextInt();

        double TravelTime;

        switch (NUM) {
            case 1:                
                System.out.print("Masukkan jumlah pintu mobil: ");
                int DoorNum = scanner.nextInt();

                Mobil Car = new Mobil(IdefNum, MaxSpeed, PasCap, DoorNum);

                System.out.println("Informasi Mobil:");
                TravelTime = Car.travel(distance);
                System.out.println(Car);
                break;

            case 2:
                System.out.print("Masukkan jumlah tempat duduk: ");
                int SeatNum = scanner.nextInt();

                Bus Bus = new Bus(IdefNum, MaxSpeed, PasCap, SeatNum);

                System.out.println("Informasi Bus:");
                TravelTime = Bus.travel(distance);
                System.out.println(Bus);
                break;
            
            default:
                System.out.println("Invalid vehicle type");
                scanner.close();
                return;
        }

        System.out.println("Waktu Perjalanan: " + TravelTime + " jam");

        scanner.close();
    }
}
