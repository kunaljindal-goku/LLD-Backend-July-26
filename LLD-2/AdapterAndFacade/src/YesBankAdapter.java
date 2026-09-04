import externalBankApis.YesBankApi;

public class YesBankAdapter implements BankApi{

    private YesBankApi yesBankApi;

    public YesBankAdapter() {
        this.yesBankApi = new YesBankApi();
    }

    @Override
    public void send(String accountNo, int amount) {
        yesBankApi.makeTransaction(accountNo,amount);
    }

    @Override
    public int fetchBalance(String accountNo) {
        return yesBankApi.getBalance(accountNo);
    }
}
