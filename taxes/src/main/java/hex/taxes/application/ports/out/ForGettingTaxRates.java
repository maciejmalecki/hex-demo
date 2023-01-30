package hex.taxes.application.ports.out;

import java.math.BigDecimal;

public interface ForGettingTaxRates {
    BigDecimal taxRateFor(BigDecimal amount);
}
