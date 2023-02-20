package hex.taxes.application.adapter.out;

import hex.taxes.application.port.out.ForGettingTaxRates;

import java.math.BigDecimal;

public class InMemoryTaxRatesRepository implements ForGettingTaxRates {
    @Override
    public BigDecimal taxRateOn(BigDecimal amount) {
        return new BigDecimal("0.1");
    }
}
