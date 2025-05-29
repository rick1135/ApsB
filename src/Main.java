import strategy.RegraA;
import strategy.RegraB;
import strategy.RegraC;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dataIn = LocalDateTime.parse("2025-05-29T07:00:00");
        LocalDateTime dataOut = LocalDateTime.parse("2025-05-29T11:00:00");

        if(dataIn.getHour()>=8 && dataIn.getHour()<12) {
            RegraA regraA = new RegraA(dataIn, dataOut);
            System.out.println(regraA.calcular(dataIn, dataOut));
            return;
        }
        if(dataIn.getHour()>=12 && dataIn.getHour()<18) {
            RegraB regraB = new RegraB(dataIn, dataOut);
            System.out.println(regraB.calcular(dataIn, dataOut));
            return;
        }
        if(dataIn.getHour()>=18 && dataIn.getHour()<24) {
            RegraC regraC = new RegraC(dataIn, dataOut);
            System.out.println(regraC.calcular(dataIn, dataOut));
            return;
        }
        System.out.println("Horário inválido");
    }
}