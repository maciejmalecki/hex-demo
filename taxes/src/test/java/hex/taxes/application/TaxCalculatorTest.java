package hex.taxes.application;

import hex.taxes.application.ports.in.ForCalculatingTaxes;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Test void shouldReturnTenPercent() {
        ForCalculatingTaxes testedObject = new TaxCalculator();
        assertEquals(BigDecimal.valueOf(10), testedObject.taxOn(BigDecimal.valueOf(100)));
    }
}
