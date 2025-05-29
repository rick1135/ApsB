import strategy.IStrategy;
import strategy.RegraA;
import strategy.RegraB;
import strategy.RegraC;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime dataIn = LocalDateTime.parse("2025-05-29T09:00:00");
        LocalDateTime dataOut = LocalDateTime.parse("2025-05-29T11:00:00");

        System.out.println("Entrada: " + dataIn.format(formatador));
        System.out.println("Saida: " + dataOut.format(formatador));

        if(dataIn.getHour()>=8 && dataIn.getHour()<12) {
            IStrategy regraA = new RegraA(dataIn, dataOut);
            System.out.println("Valor a pagar: " + regraA.calcular(dataIn, dataOut) + " Reais");
            return;
        }
        if(dataIn.getHour()>=12 && dataIn.getHour()<18) {
            IStrategy regraB = new RegraB(dataIn, dataOut);
            System.out.println("Valor a pagar: " + regraB.calcular(dataIn, dataOut) + " Reais");
            return;
        }
        if(dataIn.getHour()>=18 && dataIn.getHour()<24) {
            IStrategy regraC = new RegraC(dataIn, dataOut);
            System.out.println("Valor a pagar: " + regraC.calcular(dataIn, dataOut) + " Reais");
            return;
        }
        System.out.println("Horário inválido");
    }
}