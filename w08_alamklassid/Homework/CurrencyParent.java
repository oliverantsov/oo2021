public abstract class CurrencyParent {
    public String currencyName;
    public String cryptoName;
    public double regularMoney;
    public double cryptoMoney;

    public CurrencyParent(String currencyName, String cryptoName, double regularMoney){
        this.currencyName = currencyName;
        this.cryptoName = cryptoName;
        this.regularMoney = regularMoney;
    }

    public void regularCurrency(){
        System.out.println("Preferred currency to convert (EUR, USD, GBP):");
    }

    public void cryptoCurrency(){
        System.out.println("Preferred cryptocurrency to get conversion to (BTC, ETH, XRP):");
    }

    public void regularSumOfMoney(){
        System.out.println("Money that is being converted to cryptocurrency:");
    }

    public void showCalculation(double cryptoMoney){
        if(currencyName == "EUR"){
            if(cryptoName == "BTC"){
                cryptoMoney = regularMoney * 0.000019;
            }
            else if(cryptoName == "ETH"){
                cryptoMoney = regularMoney * 0.00048;
            }
            else if(cryptoName == "XRP"){
                cryptoMoney = regularMoney * 0.6417;
            }
        }
        else if(currencyName == "USD"){
            if(cryptoName == "BTC"){
                cryptoMoney = regularMoney * 0.000016;
            }
            else if(cryptoName == "ETH"){
                cryptoMoney = regularMoney * 0.0004;
            }
            else if(cryptoName == "XRP"){
                cryptoMoney = regularMoney * 0.551446;
            }
        }
        else if(currencyName == "GBP"){
            if(cryptoName == "BTC"){
                cryptoMoney = regularMoney * 0.000021;
            }
            else if(cryptoName == "ETH"){
                cryptoMoney = regularMoney * 0.000524;
            }
            else if(cryptoName == "XRP"){
                cryptoMoney = regularMoney * 0.721551;
            }
        }
        System.out.println("Your sum in that crypto currency is: " + cryptoMoney);
    }
}
