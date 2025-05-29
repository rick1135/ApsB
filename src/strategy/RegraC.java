package strategy;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RegraC implements IStrategy {
    public LocalDateTime dataIn;
    public LocalDateTime dataOut;
    public final int taxa = 20;

    public RegraC(LocalDateTime dataIn, LocalDateTime dataOut) {
        this.dataIn = dataIn;
        this.dataOut = dataOut;
    }

    public LocalDateTime getDataIn() {
        return dataIn;
    }

    public void setDataIn(LocalDateTime dataIn) {
        this.dataIn = dataIn;
    }

    public LocalDateTime getDataOut() {
        return dataOut;
    }

    public void setDataOut(LocalDateTime dataOut) {
        this.dataOut = dataOut;
    }

    @Override
    public long calcular(LocalDateTime dataIn, LocalDateTime dataOut) {
        long tempo = ChronoUnit.HOURS.between(dataIn, dataOut);
        return tempo>1 ? taxa+((taxa/2)*(tempo-1)) : taxa;
    }
}
