package br.com.dio;
import java.math.BigDecimal;
//Código Correto retornando valor arredondado
import java.math.RoundingMode;


public class MyAppBigDecimal {

    /**
     * @author Stefan
     * @Reference DevMedia
     */
    public static void main(String[] args) {
        BigDecimal big1 = new BigDecimal("0.1");
        BigDecimal big2 = new BigDecimal("0.2");
        BigDecimal bigResult = big1.add(big2);
        System.out.println(bigResult.toString());

        System.out.println("");
        System.out.println("Soma");
        System.out.println(new BigDecimal("2.00").add(new BigDecimal("1.2")));

        System.out.println("");
        System.out.println("Compara");
        System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("1.3")));

        System.out.println("");
        System.out.println("Divide");
        System.out.println(new BigDecimal("2.00").divide(new BigDecimal("2.00")));

        System.out.println("");
        System.out.println("Máximo");
        System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

        System.out.println("");
        System.out.println("Mínimo");
        System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

        System.out.println("");
        System.out.println("Potência");
        System.out.println(new BigDecimal("2.00").pow(2));

        System.out.println("");
        System.out.println("Multiplica");
        System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.8")));

        System.out.println("");
        System.out.println("Arredonda");
        System.out.println(new BigDecimal("1.00").divide
                (new BigDecimal("1.3"),3,RoundingMode.UP));

    }

}
