package hex.taxes.adapters.in;

import hex.taxes.adapters.out.FileTaxRepository;
import hex.taxes.application.TaxCalculator;
import hex.taxes.application.ports.in.ForCalculatingTaxes;

import java.math.BigDecimal;

public class TaxCalculatorCLI {

    private final ForCalculatingTaxes forCalculatingTaxes;

    TaxCalculatorCLI(ForCalculatingTaxes forCalculatingTaxes) {
        this.forCalculatingTaxes = forCalculatingTaxes;
    }

    void calculate(BigDecimal amount) {
        var amountAfterTax = forCalculatingTaxes.taxOn(amount);
        System.out.printf("Amount after tax for %.2f is %.2f.", amount, amountAfterTax);
    }

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java -jar taxes.jar <amount>");
            System.exit(1);
        }

        var amount = new BigDecimal(args[0]);
        new TaxCalculatorCLI(new TaxCalculator(new FileTaxRepository())).calculate(amount);
    }
}
