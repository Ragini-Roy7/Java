//package src.Static_Non_Static.Interface;

interface Pay {
   void pay();
}
static class UPI implements Pay{
    public void pay(){
        System.out.println("pay using gpay");
    }
}
static class Card implements Pay{
    public void pay(){
        System.out.println("payment using card");
    }
}

public static void main(String[] args) {
    Pay p;
    // do not use instantiation of objects while using interface
    //can give reference to interface and assign it within a var
    p= new UPI();
    p.pay();
    p= new Card();
    p.pay();

}