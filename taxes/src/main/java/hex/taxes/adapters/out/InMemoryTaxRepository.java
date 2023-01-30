package hex.taxes.adapters.out;

import hex.taxes.application.ports.out.ForGettingTaxRates;

import java.math.BigDecimal;

public class InMemoryTaxRepository implements ForGettingTaxRates {
    public BigDecimal taxRateFor(BigDecimal amount) {
        return new BigDecimal("0.1");
    }
}
