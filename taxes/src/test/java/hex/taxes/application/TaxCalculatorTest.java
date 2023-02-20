package hex.taxes.application;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

class TaxCalculatorTest {

    @Test
    void shouldReturn5FromAmount50() {
        var taxRatesRepository = new TaxRatesRepositoryDouble();
        var taxCalculator = new TaxCalculator(taxRatesRepository);
        var taxAmount = taxCalculator.taxOn(new BigDecimal("50"));
        assertThat(taxAmount).isEqualByComparingTo(new BigDecimal("5"));
    }
}
