package operator;

import javax.swing.*;

public class Percabangan {
    public static void main (String[] args){
        double totalBelanja = 53000;
        double uangDidompet = 25000;

        if (uangDidompet<totalBelanja) {
            System.out.println("uang kurang , kurang jajan anda");
        }else{
            System.out.println("Uang cukup , selamat menikmati");
            }
    }
}
