package hex.taxes.adapters.out;

import hex.taxes.application.ports.out.ForGettingTaxRates;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class FileTaxRepository implements ForGettingTaxRates {

    private final Map<BigDecimal, BigDecimal> taxRates = new TreeMap<>(Comparator.reverseOrder());

    public FileTaxRepository() {
        try {
            var lines = Files.readAllLines(Paths.get(getClass().getResource("/tax-data.txt").toURI()));
            for(var i = 0; i < lines.size(); i+=2) {
                var step = new BigDecimal(lines.get(i));
                var rate = new BigDecimal(lines.get(i+1));
                taxRates.put(step, rate);
            }
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public BigDecimal taxRateFor(BigDecimal amount) {
        for(var entry: taxRates.entrySet()) {
            if (amount.compareTo(entry.getKey()) >= 0) {
                return entry.getValue();
            }
        }
        return BigDecimal.ZERO;
    }
}
