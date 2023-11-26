public class Kendaraan {

    private String IdefNum;
    private double MaxSpeed;
    private int PasCap;

    public Kendaraan(String IdefNum, double MaxSpeed, int PasCap) {
        this.IdefNum = IdefNum;
        this.MaxSpeed = MaxSpeed;
        this.PasCap = PasCap;
    }
    
    public String getIdefNum() {
        return IdefNum;
    }

    public double getMaxSpeed() {
        return MaxSpeed;
    }

    public int getPasCap() {
        return PasCap;
    }

    public String toString() {
        return "Nomor Identifikasi: " + IdefNum + "\n" + "Kecepatan Maksimum: " + MaxSpeed + " km/h" + "\n" +"Kapasitas Penumpang: " + PasCap + " orang";
    }
    public double hitungwaktutempuh(double distance) {
        return (distance / this.MaxSpeed);
    }
}