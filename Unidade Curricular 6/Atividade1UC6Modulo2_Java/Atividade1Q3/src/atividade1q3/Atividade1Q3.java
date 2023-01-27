package atividade1q3;
import java.util.Scanner;

/*Escreva um programa Java que receba o valor padrão de uma diária e,
em seguida, receba vários nomes de hóspedes e suas idades. Caso o 
hóspede tenha idade menor que 4 anos, ele não paga hospedagem 
(nesse caso, o programa deve mostrar na tela “(Nome do hóspede) possui 
gratuidade”); mas, se o hóspede tiver mais de 80 anos, ele paga metade 
(o programa deve mostrar na tela “(Nome do hóspede) paga meia”). O 
usuário informará hóspedes até digitar a palavra “PARE”, que interrompe 
a entrada de dados. Ao fim, o programa deve mostrar a quantidade de 
gratuidades, a quantidade de meias hospedagens e o valor total, 
considerando todos os hóspedes informados.
Exemplo:
[Entrada de dados]
100 (R$ valor padrão da diária)
[Entrada de dados]
Adolfo (nome do hóspede)
50 (idade)
Murilo (nome do hóspede)
1 (idade)
[Saída de dados]
Murilo possui gratuidade
[Entrada de dados]
Joaquim (nome do hóspede)
85 (idade)
[Saída de dados]
Joaquim paga meia
[Entrada de dados]
PARE (nome do hóspede)
[Saída de dados]
Total de hospedagens: R$150; 1 gratuidade(s); 1 
meia(s)*/

public class Atividade1Q3 {

    
    public static void main(String[] args) {
        String hospede, parada = "PARE";
        Boolean compara;
        int idade, gratuidade = 0, meia = 0;
        double total_hospedagem = 0, valor_diaria;
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o valor padrão da diária:");
        valor_diaria = Integer.parseInt(t.nextLine());
        do{
            System.out.println("Digite o Nome do hóspede: ");
            hospede = t.nextLine();
            compara = hospede.equals(parada);
            if(compara == false){
                System.out.println("Digite a idade do hóspede: ");
                idade= Integer.parseInt(t.nextLine());
                while(idade < 0){
                    System.out.println("Digite uma idade válida: ");
                    idade= Integer.parseInt(t.nextLine());
                }
                if(idade < 4){
                    gratuidade++;
                    System.out.println(hospede+" tem gratuidade");
                }
                else if(idade > 80){
                    meia++;
                    total_hospedagem += (valor_diaria/2);
                    System.out.println(hospede+" paga meia.");
                }

                else{
                    total_hospedagem += valor_diaria;
                }
            }
            
        }while(compara == false);

        System.out.println("Total de hospedagens: R$"+total_hospedagem+"; "+gratuidade+" gratuidade(s); "+meia+" meia(s);");
    }
    
}
