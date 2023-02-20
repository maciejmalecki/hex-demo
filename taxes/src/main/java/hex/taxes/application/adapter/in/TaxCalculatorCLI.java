package hex.taxes.application.adapter.in;

import hex.taxes.application.TaxCalculator;
import hex.taxes.application.adapter.out.InMemoryTaxRatesRepository;

import java.math.BigDecimal;

public class TaxCalculatorCLI {

    private final TaxCalculator taxCalculator;

    public TaxCalculatorCLI() {
        taxCalculator = new TaxCalculator(
                new InMemoryTaxRatesRepository());
    }

    public void calculate(BigDecimal amount) {
        var taxAmount = taxCalculator.taxOn(amount);
        System.out.printf("Tax amount for %.2f is %.2f.", amount, taxAmount);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(1);
        }

        var amount = new BigDecimal(args[0]);
        var cli = new TaxCalculatorCLI();
        cli.calculate(amount);
    }
}
