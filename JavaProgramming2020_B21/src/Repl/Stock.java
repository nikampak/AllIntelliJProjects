package Repl;

public class Stock {
    public String tickerSymbol, companyName;
    public int price, totalShares;
    public double percentChange;
    public long marketCap;


    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol = tickerSymbol;
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;

        marketCap = totalShares * price;
    }

    public void adjustPrice (int price) {
        marketCap = totalShares * price;
    }

    public String toString(){
        return
                "Ticker Symbol: " + tickerSymbol + "\n" +
                        "Company: " + companyName + "\n" +
                        "Current Price: " + price + percentChange + "\n" +
                        "Market Cap: " + marketCap;
    }
}
