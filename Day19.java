interface Payment {

    void pay();
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Payment through UPI");
    }
}

public class Day19 {

    public static void main(String[] args) {

        Payment p = new UPI();

        p.pay();
    }
}