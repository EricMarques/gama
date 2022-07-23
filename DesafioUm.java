/*
 Proposta: 1. Escreva um programa que, com base em uma temperatura em graus celsius,
 a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
 F = C * 1.8 + 32;
 K = C + 273.15;
 Re = C * 0.8;
 Ra = C * 1.8 + 32 + 459.67
*/

public class DesafioUm {
    public static void main(String[] args) {
        float c = (float) 2.43;
        float f = (float) (c * 1.8 + 32);
        float k = (float) (c + 273.15);
        float re = (float) (c * 0.8);
        float ra = (float) (f + 459.67);

       System.out.printf("Kelvin (K): %.2f\nRéaumur (Re): %.2f\nRankine (Ra): " + 
                            "%.2f\nFahrenheit (F): %.2f", k, re, ra, f);
    }
}
