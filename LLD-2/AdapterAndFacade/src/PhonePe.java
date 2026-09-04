public class PhonePe {


    private BankApi bankApi;

    public PhonePe(String banName) {
        this.bankApi = AdapterFactory.getBankAdapter(banName);
    }

    public void moneyTransfer(String accountNo, int amount) {
        bankApi.send(accountNo,amount);
    }
}
