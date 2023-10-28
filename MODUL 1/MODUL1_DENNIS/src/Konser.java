public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String Band;
    private String Date;
    private String Location;
    private Double Ticket_Price;

    public void InfoBand(String Band) {
        this.Band = Band;
    }
    public void InfoDate(String Date) {
        this.Date = Date;
    }
    public void InfoLocation(String Location) {
        this.Location = Location;
    }
    public void InfoTicket_Price(Double Ticket_Price) {
        this.Ticket_Price = Ticket_Price;
    }

    public String Gband() {
        return Band;
    }
    public String GDate() {
        return Date;
    }
    public String GLocation() {
        return Location;
    }
    public Double GTicker_Price() {
        return Ticket_Price;
    }
}