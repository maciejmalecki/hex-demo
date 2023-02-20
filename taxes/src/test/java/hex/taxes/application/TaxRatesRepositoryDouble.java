package hex.taxes.application;

import hex.taxes.application.port.out.ForGettingTaxRates;

import java.math.BigDecimal;

public class TaxRatesRepositoryDouble implements ForGettingTaxRates {
    @Override
    public BigDecimal taxRateOn(BigDecimal amount) {
        return new BigDecimal("0.1");
    }
}
