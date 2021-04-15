public class CurrencyChild extends CurrencyParent {

    public CurrencyChild(String currencyName, String cryptoName, double regularMoney) {
        super(currencyName, cryptoName, regularMoney);
    }

    public void showCryptoName() {
        regularCurrency();
        System.out.println("SELECTED CURRENCY: " + currencyName);
    }

    public void showCryptoCurrency() {
        cryptoCurrency();
        System.out.println("SELECTED CRYPTOCURRENCY: " + cryptoName);
    }

    public void showRegularMoney() {
        regularSumOfMoney();
        System.out.println("CONVERTED: " + regularMoney);
    }

}
