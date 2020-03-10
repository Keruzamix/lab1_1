package pl.com.bottega.ecommerce.sales.domain.offer;

public class Money {

    private int value;
    private String currency;

    public void setValue(int value) {
        this.value = value;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTotalCostCurrency() {
        return currency;
    }

    public int getValue() {
        return value;
    }



}
