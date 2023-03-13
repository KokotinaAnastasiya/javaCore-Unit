import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[4];
        payments[0] = new Bill(new BigDecimal(1000), new IncomeTaxType(), new TaxService());
        payments[1] = new Bill(new BigDecimal(20000), new VATaxType(), new TaxService());
        payments[2] = new Bill(new BigDecimal(30000), new ProgressiveTaxType(), new TaxService());
        payments[3] = new Bill(new BigDecimal(110000), new ProgressiveTaxType(), new TaxService());


        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
