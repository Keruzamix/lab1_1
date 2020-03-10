package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {

    private BigDecimal discount;

    private Money value;

    public Discount(BigDecimal discount, Money value) {
        this.discount = discount;
        this.value = value;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public Money getPrice() {
        return value;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void setPrice(Money value) {
        this.value = value;
    }
}
