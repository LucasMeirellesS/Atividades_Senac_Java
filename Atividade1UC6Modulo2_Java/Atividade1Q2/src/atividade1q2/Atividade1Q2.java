/*Escreva um programa Java que faça a troca de quartos entre dois 
hóspedes. O programa deve receber o nome de um cliente e a idade dele 
(este cliente, a princípio, será hospedado no quarto A), depois receber o 
nome de outro cliente e a idade (este, se for mais jovem, ficará no quarto 
B, mas, se for mais velho que o primeiro cliente, ficará no quarto A e o 
primeiro cliente ficará no quarto B). Além disso, se a pessoa mais velha 
for idosa (tem 60 anos ou mais), ela terá desconto de 40%. O programa 
deve mostrar, ao final, qual cliente ficou no quarto A e o desconto, se 
houver, e qual ficou no quarto B.
Exemplo:
[Entrada de dados]
Maria (nome cliente)
20 (idade cliente)
Joao (nome cliente)
60 (idade cliente)
[Saída de dados]
Quarto A: Joao com desconto de 40%; Quarto B: 
Maria
*/


package atividade1q2;
import java.util.Scanner;

public class Atividade1Q2 {

    public static void main(String[] args) {
       String cliente1, cliente2,quartoA, quartoB;
        int idade_cliente1, idade_cliente2, idadeA, idadeB;
        
        
        Scanner t  = new Scanner(System.in);

        System.out.println("Digite o nome e a idade do primeiro cliente:");
        System.out.println("Nome do primeiro cliente: ");
        cliente1 = t.nextLine();
        System.out.println("Idade do primeiro cliente: ");
        idade_cliente1 = Integer.parseInt(t.nextLine());
        System.out.println("Digite o nome e a idade do segundo cliente:");
        System.out.println("Nome do segundo cliente: ");
        cliente2 = t.nextLine();
        System.out.println("Idade do segundo cliente: ");
        idade_cliente2 = Integer.parseInt(t.nextLine());
        quartoA = cliente1;
        quartoB = cliente2;
        idadeA = idade_cliente1;
        idadeB = idade_cliente2;

        if(idade_cliente1 < idade_cliente2){
            quartoA = cliente2;
            quartoB = cliente1;
            idadeA = idade_cliente2;
            idadeB = idade_cliente1;
        }

        if (idadeA >=  60){
            System.out.print("Quarto A: "+quartoA+ " com desconto de 40%; ");
        }

        else if(idadeA < 60){
            System.out.print("Quarto A: "+quartoA+"; ");
        }

        if(idadeB >= 60){
            System.out.print("Quarto B: "+quartoB+ " com desconto de 40%; ");
        }

        else{
            System.out.print("Quarto B: "+quartoB+"; ");
        }
    }
    
}
