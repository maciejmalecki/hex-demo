package hex.taxes.application;

import hex.taxes.application.port.in.ForCalculatingTaxes;
import hex.taxes.application.port.out.ForGettingTaxRates;

import java.math.BigDecimal;

public class TaxCalculator implements ForCalculatingTaxes {

    private final ForGettingTaxRates taxRatesRepository;

    public TaxCalculator(ForGettingTaxRates taxRatesRepository) {
        this.taxRatesRepository = taxRatesRepository;
    }

    @Override
    public BigDecimal taxOn(BigDecimal amount) {
        return taxRatesRepository.taxRateOn(amount).multiply(amount);
    }
}
