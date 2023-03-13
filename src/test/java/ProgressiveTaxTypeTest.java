import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressiveTaxTypeTest {
    ProgressiveTaxType sut = new ProgressiveTaxType();

    @org.junit.jupiter.api.Test
    public void progressiveTaxTypeTest() {
        // given:
        BigDecimal amount = new BigDecimal(100000.00);
        BigDecimal expected = new BigDecimal("15000.00");

        // when:
        BigDecimal result = sut.calculateTaxFor(amount);
        // then:
        assertEquals(expected, result);
    }

}
