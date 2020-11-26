package com.gabrielalmeida.appgabrielformativa.util;

public abstract class CalculosUtil {

    public static boolean verificaNumeroPrimo(Integer prNumero){
        for (int i = 2; i < prNumero; i++){
            if (i%prNumero == 0)
                return false;
        }
        return true;
    }

    public static Double calculaAreaCirculo(double prRaio){
        final Double myPi = 3.14;
        Double ac = (myPi * (prRaio * prRaio));
        return ac;
    }

}
