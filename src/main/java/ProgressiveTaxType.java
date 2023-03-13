import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    public BigDecimal amount;

    public ProgressiveTaxType() {
        this.amount = amount;
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal y = new BigDecimal("100000.00");
        if ((amount.compareTo(y)) == -1) {
            return amount.multiply(BigDecimal.valueOf(0.10));
        } else {
            return amount.multiply(BigDecimal.valueOf(0.15));
        }
    }
}
