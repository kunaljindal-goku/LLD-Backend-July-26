public class AdapterFactory {

    public static BankApi getBankAdapter(String bankName) {
        if(bankName.equals("icici")) {
            return new IciciBankAdapter();
        }
        else if(bankName.equals("yes")) {
            return new YesBankAdapter();
        }

        return null;
    }
}
