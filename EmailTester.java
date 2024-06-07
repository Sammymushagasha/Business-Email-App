package BusinessEmail;

public class EmailTester {
    public static void main(String[] args) {
        Email email = new Email();
        Email email2 = new Email("Danny", "Smith");

        System.out.println(email.toString());
        System.out.println(email2.toString());

    }
}
