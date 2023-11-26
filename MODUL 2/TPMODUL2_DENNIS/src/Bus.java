public class Bus extends Kendaraan{

    private int SeatNum;

    public Bus(String IdefNum, double MaxSpeed, int PasCap, int SeatNum) {
        super(IdefNum, MaxSpeed, PasCap);
        this.SeatNum = SeatNum;
    }

    @Override public String toString() {
        return "Info Bus"+ "\n" + super.toString() + "\n" + "Jumlah Pintu:" + SeatNum;
    }

}
