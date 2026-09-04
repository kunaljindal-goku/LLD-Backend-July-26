import externalBankApis.IciciBankApi;

import java.util.UUID;

public class IciciBankAdapter implements BankApi{

    private IciciBankApi iciciBankApi;

    public IciciBankAdapter() {
        this.iciciBankApi = new IciciBankApi();
    }

    @Override
    public void send(String accountNo, int amount) {
        String token = generateToken();
        iciciBankApi.transfer(accountNo,amount,token);
    }

    private String generateToken() {
        return String.valueOf(UUID.randomUUID());
    }

    @Override
    public int fetchBalance(String accountNo) {
        return 0;
    }
}
