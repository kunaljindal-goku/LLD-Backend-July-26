package externalBankApis;

public class YesBankApi {

    public void makeTransaction(String accountNo, int amount) {
        System.out.println("Sending money from Yes bank: " + accountNo + " amount = " + amount);
    }

    public int getBalance(String accountNo) {
        System.out.println("Balance from YES bank = 5000");
        return 5000;
    }

}
