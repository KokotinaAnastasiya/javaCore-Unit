import java.math.BigDecimal;

public class VATaxType extends TaxType {
    public BigDecimal amount;

    public VATaxType() {
        this.amount = amount;
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        return amount.multiply(BigDecimal.valueOf(0.18));
    }
}
