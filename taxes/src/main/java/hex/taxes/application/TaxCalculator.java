package hex.taxes.application;

import hex.taxes.application.ports.in.ForCalculatingTaxes;

import java.math.BigDecimal;

public class TaxCalculator implements ForCalculatingTaxes {

    public BigDecimal taxOn(BigDecimal amount) {
        return BigDecimal.ZERO;
    }
}
