package atividade1q1;
import java.util.Scanner;
/**
 *
 * @author LUCAS MEIRELLES
 */
public class Atividade1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int alfa, convidados, cadeiras;
        
        System.out.println("Digite o número de convidados:");
        convidados = t.nextInt();
        alfa = 150;
        

        if(convidados < 150 || (convidados > 150 && convidados <= 220)){
                if(convidados > 150 && convidados <= 220){
                    cadeiras = convidados - alfa;
                    System.out.println("Use o auditório Alfa! \nAcrescente mais "+cadeiras+".");
                    
                }

                else{
                    System.out.println("Use o auditório Alfa!");
                }

        }
        
        else if(convidados > 350){
            System.out.println("Número de convidados inválidos!");
        }

        else{
            System.out.println("Escolha o auditório Beta");
        }
    }
    
}
