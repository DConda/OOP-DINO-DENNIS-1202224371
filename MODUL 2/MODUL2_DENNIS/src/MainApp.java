public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi sendstuff1 = new Ekspedisi(99, "Mataram", 10000);
        sendstuff1.informasi();
        System.out.println("");
        // TO DO: Create teluexpress Object from TelUExpress Class

        TelUExpress sendstuff2 = new TelUExpress(5, "Bandung", 10000, true)
        TelUExpress.ambil("Jakarta")
        TelUExpress.antar(129310923)
        TelUExpress.antar2(2187481247, 281946182946)
        sendstuff2.informasi();

        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress sendstuff3 = new FRIExpress(10, "Jaksel", 6000, false)
        FRIExpress.terima(19)
        FRIExpress.kirim("Jak")
        FRIExpress.kirim2("Mat");
        sendstuff3.informasi();


    }
}
