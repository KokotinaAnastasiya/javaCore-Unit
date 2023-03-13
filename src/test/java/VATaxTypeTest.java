import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VATaxTypeTest {

    VATaxType sut = new VATaxType();


    @org.junit.jupiter.api.Test
    public void vATaxTypeTestTest() {
        // given:
        BigDecimal amount = new BigDecimal(20000);
        BigDecimal expected = new BigDecimal("3600.00");

        // when:
        BigDecimal result = sut.calculateTaxFor(amount);
        // then:
        assertEquals(expected, result);
    }
}
