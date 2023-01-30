package hex.taxes.application;

import hex.taxes.application.ports.in.ForCalculatingTaxes;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Test void shouldReturnTenPercent() {
        ForCalculatingTaxes testedObject = new TaxCalculator(new InMemoryTaxRepository());
        assertEquals(new BigDecimal("10.0"), testedObject.taxOn(new BigDecimal("100")));
    }
}
