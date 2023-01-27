package atividade2uc6;
import java.util.Locale;
import java.util.Scanner;

public class Atividade2UC6 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Trajetoria trajeto = new Trajetoria();
        t.useLocale(Locale.ENGLISH);
        System.out.println("Digite o numero de pontos:");
        int n = t.nextInt();
        
        trajeto.trajetos(n);
        
        trajeto.calculaTrajeto();
        
    }
    
}
