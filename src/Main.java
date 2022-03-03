public class Main {
    private static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh"
    , ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        Account account = new Account();
        for (String a:validAccount
             ) {
            boolean isValid = account.validate(a);
            System.out.println("Account is " + a +" is valid: "+ isValid);
        }
    }
}
