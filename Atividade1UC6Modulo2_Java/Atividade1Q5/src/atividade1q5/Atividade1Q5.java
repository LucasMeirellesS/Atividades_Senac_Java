
package atividade1q5;
import java.util.Scanner;
/*Monte um programa Java que mostre na tela em formato de tabela os 
quartos ocupados e os desocupados. Considere que o hotel tem quatro
andares e três quartos por andar. Primeiro, o usuário registrará os quartos 
ocupados, informando para cada ocupação o número do apartamento 
(andares de 1 a 4 e números de quarto de 1 a 3). O programa deverá 
questionar “Deseja informar outra ocupação? (S/N)” e o usuário poderá 
informar quantos quartos quiser, até que responda “N” a essa pergunta.
Em seguida, o programa mostrará uma tabela, em que o primeiro andar é 
o inferior e o último é o superior, marcando com X o quarto ocupado.
Exemplo:
[Saída de dados]
Informe Andar e Quarto
[Entrada de dados]
1 (andar)
1 (quarto)
[Saída de dados]
Deseja informar outra ocupação? (S/N)
[Entrada de dados]
S
[Saída de dados]
Informe Andar e Quarto
[Entrada de dados]
2 (andar)
3 (quarto)
[Saída de dados]
Deseja informar outra ocupação? (S/N)
S
[Saída de dados]
Informe Andar e Quarto
[Entrada de dados]
4(andar)
1(quarto)
[Saída de dados]
Deseja informar outra ocupação? (S/N)
[Entrada de dados]
N
[Saída de dados]
Ocupação do hotel:
4º andar [X][ ][ ]
3º andar [ ][ ][ ]
2º andar [ ][ ][X]
1º andar [X][ ][ ] */

public class Atividade1Q5 {

    public static void main(String[] args) {
        String quartos[][] = new String[4][3];
        int andar, quarto;
        char opcao;
        Scanner t = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                quartos[i][j] = "[]";
            }
        }
        
        

        do{
            System.out.println("Digite numero do andar do quarto em questão:");
            andar = t.nextInt();
            if(andar > 4 || andar < 1){
                System.out.println("Digite um número de 1 a 4:");
                andar = t.nextInt();
            }
            System.out.println("Digite numero do quarto em questão:");
            quarto = t.nextInt();
            if(quarto > 3 || quarto < 1){
                System.out.println("Digite um número de 1 a 3:");
                quarto = t.nextInt();
            }

            quartos[andar - 1][quarto - 1] = "[X]";
            System.out.println("Deseja informar outra ocupação? (S/N)");
            opcao = t.next().charAt(0);
            
            while(opcao != 'S' && opcao != 'N'){
                System.out.println("Digite uma opção válida!");
                opcao = t.next().charAt(0);
                }
        
        }while(opcao != 'N');

        for(int i = 3; i >= 0 ; i--){
            System.out.print(i+1+"º andar ");
            for(int j = 0; j < 3; j++){  
                System.out.print(quartos[i][j]+" ");
                if(j == 2){
                    System.out.println();
                }
            }
        }
    }
    
}
