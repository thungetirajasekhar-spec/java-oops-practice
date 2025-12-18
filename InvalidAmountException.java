class InvalidAmountException extends RuntimeException {
    InvalidAmountException(String msg) {
        super(msg);
    }
}
class Bank {
    public static void main(String[] args) {
        int amount = -100;
        if (amount < 0) {
            throw new InvalidAmountException("Amount cannot be negative");
        }
    }
}