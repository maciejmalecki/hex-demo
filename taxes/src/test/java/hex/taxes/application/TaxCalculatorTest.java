package hex.taxes.application;

import hex.taxes.application.ports.in.ForCalculatingTaxes;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Test void shouldTaxOnReturnZero() {
        ForCalculatingTaxes calculator = new TaxCalculator();
        assertEquals(BigDecimal.ZERO, calculator.taxOn(BigDecimal.ZERO));
    }
}
