package hex.taxes.application.port.in;

import java.math.BigDecimal;

public interface ForCalculatingTaxes {

    BigDecimal taxOn(BigDecimal amount);
}
