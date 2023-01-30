package hex.taxes.application;

import hex.taxes.application.ports.out.ForGettingTaxRates;

import java.math.BigDecimal;

class InMemoryTaxRepository implements ForGettingTaxRates {
    public BigDecimal taxRateFor(BigDecimal amount) {
        return new BigDecimal("0.1");
    }
}
