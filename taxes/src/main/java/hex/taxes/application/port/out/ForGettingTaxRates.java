package hex.taxes.application.port.out;

import java.math.BigDecimal;

public interface ForGettingTaxRates {

    BigDecimal taxRateOn(BigDecimal amount);
}
