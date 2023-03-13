import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxTypeTest {
    IncomeTaxType sut= new IncomeTaxType();


    @org.junit.jupiter.api.Test
    public void incomeTaxTypeTest()
    {
        // given:
        BigDecimal amount = new BigDecimal (1000);
        BigDecimal expected = new BigDecimal("130.00");

        // when:
        BigDecimal result = sut.calculateTaxFor(amount);
        // then:
        assertEquals(expected, result);
    }
}
