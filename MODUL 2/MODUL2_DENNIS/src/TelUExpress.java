public class TelUExpress extends Ekspedisi {
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected boolean antarInter;

    // TO DO: Create Constructor of TelUExpress
    public TelUExpress(int jumlahCabang, String pusat, float tarif, boolean antarInter) {
        super(jumlahCabang, pusat, tarif);
        this.antarInter = antarInter;
    }
    // TO DO: Create 'informasi' Method to show Information
    public void informasi() {
        System.out.println("Ekspedisi TELUExpress dengan jumlah cabang " +jumlahCabang+ " dan berpusat di " +pusat+ " mempunyai tarif sebesar " +tarif+ "perkilogram" +"\n");
        if (antarInter == true){
            System.out.println("Selain itu, ekspedisi ini melayani pengantaran Intenational");
        }
    }
    // TO DO: Create 'ambil' Method to pick up a package
    public void ambil(String tempat) {
        System.out.println("TELUExpress berhasil mengambil paket ke " +tempat);
    }
    // TO DO: Create 'antar' Method to send a package
    public void antar(int resi) {
        System.out.println("TELUExpress berhasil mengantar paket dengan no resi" +resi);
    }
    // TO DO: Create 'antar' Method to send two packages
    public void antar2(int resi_1, int resi_2) {
        System.out.println("TELUExpress berhasil mengantar paket dengan no resi " +resi_1+ " dan " +resi_2);
    }
}
