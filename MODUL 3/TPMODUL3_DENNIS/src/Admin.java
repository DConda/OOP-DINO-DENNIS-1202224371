public class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageSystem(String course) {
        System.out.println("Managing system: " + course);
    }

    @Override
    public String getUserDetail() {
        return super.getUserDetail();
    }
}