public class Phonepe {

    void sendMoney(int x) {
        try {
            validateMoney(x);
        } catch (InvalidAmountExceptiom e) {
            System.out.println("Please enter a vliad amount");
        }
    }

    public void validateMoney(int x) throws InvalidAmountExceptiom {
        if(x < 0) {
            throw new InvalidAmountExceptiom();
        }
    }
}
