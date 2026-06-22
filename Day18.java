abstract class Account {

    abstract void accountType();
}

class SavingsAccount extends Account {

    void accountType() {
        System.out.println("Savings Account");
    }
}

public class Day18 {

    public static void main(String[] args) {

        SavingsAccount acc =
                new SavingsAccount();

        acc.accountType();
    }
}
