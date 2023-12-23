public class User {
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   private String nama;
   private String phoneNumber;
   // TO DO: Create Constructor of User
   
   public void setName(String nama) {
         this.nama = nama;
      }

   public void setNoHandPhone(String phoneNumber) {
         this.phoneNumber = phoneNumber;
      }
   // TO DO: Create register Method to show information about name and phone number
   public void register(){
        System.out.println("Name:" + nama);
        System.out.println("Phone Number:" + phoneNumber);
    }
   // TO DO: Create method to return name and phone number
   
   public String getName() {
     return nama;
  }

   public String getnoHandPhone() {
     return phoneNumber;
  }
}






  