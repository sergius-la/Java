public class Main {
    public static void main(String[] args) {
        final Account myAcount = new Account("HMB7090", "John Doe");
        // How create instance of inner class
        final Account.Card myCard = myAcount.new Card("1234 5678 9101 1232");
    }
}