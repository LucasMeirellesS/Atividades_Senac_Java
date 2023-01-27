package atividade1q1;
import java.util.Scanner;
/*Com relação ao atendimento a eventos, o hotel necessita de uma 
funcionalidade que indique qual de seus dois auditórios é o mais 
adequado para um evento. O auditório Alfa conta com 150 lugares e 
espaço para até 70 cadeiras adicionais. O auditório Beta conta com 350 
lugares, sem espaço para mais cadeiras. Desenvolva um programa Java
que receba o número de convidados do evento e faça uma verificação 
sobre a quantidade: se for maior que 350 ou se for menor que zero, mostre 
a mensagem “Número de convidados inválido”. Se o valor informado for
válido, mostre na tela qual dos auditórios é o mais adequado. No caso do 
auditório Alfa, calcule ainda quantas cadeiras adicionais serão 
necessárias, observando o limite citado.
Exemplo:
[Entrada de dados]
190 convidados (número de convidados)
[Saída de dados]
Use o auditório Alfa
Inclua mais 40 cadeiras*/
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
