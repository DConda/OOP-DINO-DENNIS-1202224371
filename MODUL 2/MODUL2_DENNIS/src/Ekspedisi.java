public class Ekspedisi 
{
    // TO DO: Create Protected Attributes of Ekspedisi (jumlahCabang, pusat, tarif)
    protected int jumlahCabang;
    protected String pusat;
    protected float tarif;
    // TO DO: Create Constructor of Ekspedisi
    public Ekspedisi(int jumlahCabang, String pusat, float tarif) {
        this.jumlahCabang = jumlahCabang;
        this.pusat = pusat;
        this.tarif = tarif;
    }

    public int getjumlahcabang() {
        return jumlahCabang;
    }

    public String getPusat() {
        return pusat;
    }

    public float getTarif() {
        return tarif;
    }
    // TO DO: Create 'informasi' Method to show Information
    public void informasi() {
        System.out.println("Ekspedisi tidak diketahui dengan jumlah cabang " +jumlahCabang+ " dan berpusat di " +pusat+ " mempunyai tarif sebesar " +tarif+ "perkilogram");
    }
}
