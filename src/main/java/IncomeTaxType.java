import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    public BigDecimal amount;

    public IncomeTaxType() {
        this.amount = amount;
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        return amount.multiply(BigDecimal.valueOf(0.13));
    }
}
