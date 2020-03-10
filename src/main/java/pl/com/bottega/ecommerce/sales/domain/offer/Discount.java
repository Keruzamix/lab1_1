package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {

    private BigDecimal discount;

    private Money value;

    private String discountCause;

    public Discount(BigDecimal discount, Money value, String discountCause) {
        this.discount = discount;
        this.value = value;
        this.discountCause = discountCause;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public Money getValue() {
        return value;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void setValue(Money value) {
        this.value = value;
    }

    public void setDiscountCause(String discountCause) {
        this.discountCause = discountCause;
    }
}
