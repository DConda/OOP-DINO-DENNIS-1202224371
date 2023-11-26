public class Mobil extends Kendaraan{

    private int DoorNum;


    public Mobil(String IdefNum, double MaxSpeed, int PasCap, int DoorNum) {
        super(IdefNum, MaxSpeed, PasCap);
        this.DoorNum = DoorNum;
    }

    @Override public String toString() {
        return "Info Mobil" + "\n" + super.toString() + "\n" + "Jumlah Pintu:" + DoorNum;
    }

}
