package Chapter_09.Chapter_Classes;

public class Stock {

    // fields (attributes)
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // constructor
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /** Returns percentage change from previous closing price to current price */
    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / currentPrice;
    }
}
