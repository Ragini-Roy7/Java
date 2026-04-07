package OOP;

public class Access_Modifiers {
    public static void main(String[] args) {

        BankAccount myacc = new BankAccount("Ragini", 12345, "secret123");
        myacc.check_balance();
        myacc.setPassword("secret123");
        System.out.println(myacc.getPassword());
    }

    static class BankAccount {
        public String user_name;
        int account_num;
        private String password;
      String getPassword(){
          //using getters
          //used for getting value setters are used for setting values
          return this.password;
      }
        BankAccount(String user_name, int account_num, String password) {
            this.user_name = user_name;
            this.account_num = account_num;
            this.password = password;
        }
      public void setPassword(String pass){
            this.password= pass;
      }
        void check_balance() {
            System.out.println("User: " + user_name);
            System.out.println("Account Number: " + account_num);
        }
    }
}