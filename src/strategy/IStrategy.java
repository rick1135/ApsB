package strategy;

import java.time.LocalDateTime;

public interface IStrategy {
    long calcular(LocalDateTime dataIn, LocalDateTime dataOut);
}
