package hex.taxes.application;

import hex.taxes.application.ports.in.ForCalculatingTaxes;
import hex.taxes.application.ports.out.ForGettingTaxRates;

import java.math.BigDecimal;

public class TaxCalculator implements ForCalculatingTaxes {

    private final ForGettingTaxRates taxRateRepository;

    public TaxCalculator(ForGettingTaxRates forGettingTaxRates) {
        this.taxRateRepository = forGettingTaxRates;
    }

    public BigDecimal taxOn(BigDecimal amount) {
        return taxRateRepository.taxRateFor(amount).multiply(amount);
    }
}
