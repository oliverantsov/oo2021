public class Main {
    public static void main(String[] args) {
        CurrencyChild conversion1 = new CurrencyChild("EUR", "BTC", 180);
        CurrencyChild conversion2 = new CurrencyChild("EUR", "ETH", 534);
        CurrencyChild conversion3 = new CurrencyChild("USD", "XRP", 1893);
        CurrencyChild conversion4 = new CurrencyChild("GBP", "ETH", 5555);

        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("        REGULAR CURRENCY -> CRYPTO CURRENCY CONVERTER");
        System.out.println("     (hard-coded, but changeable to Scanners in the future)");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");

        // CONVERSION 1
        conversion1.showCryptoName();
        System.out.println("---------------------------------------------------------------");
        conversion1.showCryptoCurrency();
        System.out.println("---------------------------------------------------------------");
        conversion1.showRegularMoney();
        System.out.println("---------------------------------------------------------------");
        conversion1.showCalculation(180);
        System.out.println("---------------------------------------------------------------");

        // CONVERSION 2
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        conversion2.showCryptoName();
        System.out.println("---------------------------------------------------------------");
        conversion2.showCryptoCurrency();
        System.out.println("---------------------------------------------------------------");
        conversion2.showRegularMoney();
        System.out.println("---------------------------------------------------------------");
        conversion2.showCalculation(534);
        System.out.println("---------------------------------------------------------------");

        // CONVERSION 3
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        conversion3.showCryptoName();
        System.out.println("---------------------------------------------------------------");
        conversion3.showCryptoCurrency();
        System.out.println("---------------------------------------------------------------");
        conversion3.showRegularMoney();
        System.out.println("---------------------------------------------------------------");
        conversion3.showCalculation(1893);
        System.out.println("---------------------------------------------------------------");

        // CONVERSION 4
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        conversion4.showCryptoName();
        System.out.println("---------------------------------------------------------------");
        conversion4.showCryptoCurrency();
        System.out.println("---------------------------------------------------------------");
        conversion4.showRegularMoney();
        System.out.println("---------------------------------------------------------------");
        conversion4.showCalculation(5555);
        System.out.println("---------------------------------------------------------------");
    }
}