package u4;

public class BankAccount2 {

    int id = 10;
    String name = "Petr";
    double ballance = 100;

    void popolnenie (double summup) {
        System.out.println ("Баланс до пополнения: " +ballance);
        System.out.println ("Баланс пополняется на: " + summup);
        ballance += summup;
        System.out.println ("Балланс после пополнения: "+ ballance);
        System.out.println ();
    }

    void snyatie (double summdn) {
        System.out.println ("Баланс до снятия: " +ballance);
        System.out.println ("Баланс уменьшился на: " + summdn);
        ballance -= summdn;
        System.out.println ("Балланс после снятия: "+ ballance);
        System.out.println ();
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount2 bA = new BankAccount2();
        bA.popolnenie(60);
        bA.snyatie(42.6);
    }
}