package atividade1q4;
import java.util.Scanner;
/*Monte um algoritmo em que o usuário poderá cadastrar e pesquisar 
hóspedes. O algoritmo deve oferecer um menu com três opções ao 
usuário: 1- cadastrar; 2- pesquisar; 3- sair. A opção “cadastrar” deve 
permitir que o usuário informe um nome de hóspede, gravando-o em 
memória (máximo de 15 cadastros; caso atinja essa quantidade, o 
programa deve mostrar “Máximo de cadastros atingido”). A opção 
“pesquisar” deve permitir que o usuário informe um nome e, caso seja 
encontrado um nome exatamente igual, mostre a mensagem “Hóspede 
(nome) foi encontrado no índice (índice onde foi cadastrado)”. Se o nome 
não foi encontrado, o programa deve mostrar “Hóspede não encontrado”. 
O algoritmo deve permitir que o usuário realize essas operações repetidas 
vezes, até que use a opção “3”, que encerra o algoritmo.
Exemplo:
[Saída de dados]
Digite 1- cadastrar; 2- pesquisar; 3- sair
[Entrada de dados]
1 (opção)
Maria da Silva (nome do hóspede)
[Saída de dados]
Digite 1- cadastrar; 2- pesquisar; 3- sair
[Entrada de dados]
1 (opção)
José Freitas (nome do hóspede)
[Saída de dados]
Digite 1- cadastrar; 2- pesquisar; 3- sair
[Entrada de dados]
2 (opção)
José Freitas
[Saída de dados]
Hóspede José Freitas foi encontrado no índice 1
[Saída de dados]
Digite 1- cadastrar; 2- pesquisar; 3- sair
[Entrada de dados]
3*/
public class Atividade1Q4 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String hospede, pesq;
        String hospedes[] = new String[15];
        int contador = 0, opcao, index, conta, conta1 = 0;

        do{
            conta = 0;
            System.out.println("---------- Opções ----------");
            System.out.println("------- 1: Cadastrar -------");
            System.out.println("------- 2: Pesquisar -------");
            System.out.println("--------- 3: Sair ----------");
            System.out.println();
            System.out.println("Digite uma opção:");
            opcao = Integer.parseInt(t.nextLine());
            while(opcao != 1 && opcao != 2 && opcao !=3){
                System.out.println("Digite uma opção válida!");
                opcao = Integer.parseInt(t.nextLine());
                
            }


            if(opcao == 1){
                System.out.println("Digite o nome do hóspede:");
                hospede = t.nextLine();
                
                if(contador < 15){
                hospedes[contador] = hospede;
                contador++;
                conta1++;
            }
                else{
                    System.out.println("Máximo de cadastros atingidos!");
                }
                
            }
            if(opcao == 2){
                if(contador == 0){
                    System.out.println("Não há hospedes cadastrados!");
                }
                else{
                    System.out.println("Digite o nome que deseja pesquisar:");
                    pesq = t.nextLine();
                    for(int i = 0; i < contador; i++){
                        index = hospedes[i].indexOf(pesq);

                        if(index < 0 && (i == contador - 1) && conta == 0){
                            System.out.println("Hóspede não encontrado");
                        
                        }
                        
                        else if(index >= 0){
                            System.out.println("O trecho em questão foi encontrado índice "+i+" cujo hospede é "+hospedes[i]);
                            conta++;
                        }
                    }
                }
            }
        }while(opcao != 3);
    }
    
}
