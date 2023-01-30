package hex.taxes.application.ports.in;

import java.math.BigDecimal;

public interface ForCalculatingTaxes {
    BigDecimal taxOn(BigDecimal amount);
}
