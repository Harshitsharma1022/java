abstract class Payment{
    abstract void pay(int a);
    void print(){
        System.out.println("payment done");
    }
}

class UpiPayment extends Payment{
    void pay(int a){
        System.out.println("Payment done via Upi" + a);
    }
}

class CardPayemnt extends Payment{
    void pay(int a){
        System.out.println("Payment done via Card" + a);
    }
}

class abs1{
    public static void main (String[] args){
        Payment obj = new UpiPayment();
        obj.pay(5000);
        obj.print();
        Payment obj1 = new CardPayemnt();
        obj1.pay(7000);
        obj1.print();

    }
}

