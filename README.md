# Atividades_Senac_Java

Atividades do curso técnico de desenvolvimento de sistemas do Senac. Módulo 2(Programação Orientada a Objetos em Java).
Os projetos enviados foram realizados na IDE Netbeans.

# Unidade Curricular 6:

Atividade 1: Uma série de desafios básicos feitos em Java. A descrição de cada desafio encontra-se comentada no arquivo da classe principal de cada projeto.

Atividade 2: Foi criado um programa para a realização de calculos entre pontos de uma lista de vetores, descrição:

  A aplicação Java deve conter o seguinte:

  1.	Uma classe Ponto2D. Um vetor é representado por dois números reais: um para coordenada X e outro para coordenada Y. A classe deve
    a.	ser capaz de calcular e retornar a distância do objeto (A) até outro ponto informado (B).  
    b.	ser capaz de calcular a multiplicação do ponto do objeto (A) por um valor double (k) informado.
    c.	ser capaz de mostrar na tela as coordenadas do ponto no formato “(x, y)”.
    d.	conter um construtor que receba as duas coordenadas.
    e.	manter privadas suas informações e públicas suas operações.

  2.	 Uma classe Trajetoria, que mantém uma lista finita de pontos. A classe deve:
    a.	mostrar na tela a rota do primeiro ponto até o último da lista, dizendo a distância entre eles. Por exemplo, suponha esta lista de pontos: { (1,2), (1,5), (3,5), (2,2) }
     (1, 2) a (1, 5) – distancia 3
     (1, 5) a (3, 5) – distancia 2
     (3, 5) a (4, 3.5) – distancia 1.8
    b.	ser capaz de calcular e retornar a distância total formada pelo caminho dos pontos armazenados em sua lista – a soma da distância do ponto 1 ao 2, do 2 ao 3, e assim por diante.
    c.	ser capaz de redimensionar os pontos, multiplicando todos os pontos da lista por um dado valor double.
    
  3.	Um código principal (main()) que
    b.	crie duas trajetórias.
    c.	leia um número N do usuário.
    d.	para cada trajetória, crie N pontos e leia as coordenadas x e y de cada ponto.
    e.	para cada trajetória, mostre na tela a distância total entre seu primeiro e último pontos e a rota do primeiro ao último ponto.
    f.	multiplique a menor das duas trajetórias por 2 e mostre a nova distância total e a rota do primeiro ao último ponto.

Atividade 3: Foi criado um sistema orientado a objetos que estão implementando funcionalidades no sistema relacionadas ao setor de RH e à folha de pagamento onde há dois tipos defuncionários: Horistas e Assalariados onde funcionários assalariados, que recebem por mês, e funcionários horistas, que recebem por horas trabalhadas.
Para todos os funcionários, são necessárias informações como nome, CPF, endereço, telefone e setor em que trabalham. Para os assalariados, é necessário ainda a informação do salário mensal do trabalhador (o total a receber será “salário”). Para os horistas, é necessária a informação de horas trabalhadas e valor da hora (o total a receber será “horas * valor da hora”).Todo funcionário precisa ser capaz de mostrar em tela seus dados; tanto assalariados quanto horistas precisam ser capazes de calcular e fornecer o valor de seu pagamento, de acordo com suas características. Também é necessário que ambos sejam capazes de aplicar aumento (informado em %) em seus rendimentos o programa em questão permite que o usuário informe dados para até 10 funcionários, questionando o tipo (assalariado/horista) e lendo os dados necessários. Mantenha-os em uma única lista independentemente se são assalariados ou horistas; mostra na tela os dados e o pagamento de cada um dos funcionários; aplica um aumento geral (informado pelo usuário) para todos os funcionários e mostre novamente os pagamentos de cada um deles.

Atividade 4: Aqui foi criado um sistema capaz de calcular impostos para venda de produtos. Os impostos em questão são o PIS, Cofins, ICMS e IPI, onde:

PIS (Programa de Integração Social): necessita do valor total de débito e do valor total de crédito da empresa. O cálculo do imposto é “debito - credito * 1,65%”. Por exemplo: Débito R$ 30000,00; Crédito R$ 16000,00; (30000 - 16000) * 1,65% = 14000 * 1,65% = R$ 235.

Cofins (Contribuição para o Financiamento da Seguridade Social): necessita do valor total de débito e do valor total de crédito da empresa. O cálculo do imposto é “debito - credito * 7,6%”. Por exemplo: Débito R$ 30000,00; Crédito R$ 16000,00; (30000 - 16000) * 7,6% = 14000 * 7,6% = R$ 1064.

ICMS (Imposto sobre Circulação de Mercadorias e Serviços): necessita do valor da mercadoria tributada e da alíquota (que varia). O cálculo é “precoMercadoria x alíquota”. Exemplo: um produto de R$ 500 com alíquota de 15% tem ICMS de R$ 75.

IPI (Imposto sobre Produtos Industrializados): necessita do valor da alíquota e valor do produto, frete, seguro, outras despesas. A soma desses quatro últimos valores formará a base de cálculo. O cálculo então será “IPI = base de cálculo * alíquota”. Exemplo: valor R$ 90, frete R$ 10, seguro R$ 5, outras despesas R$ 5; alíquota = 5%; IPI = (90 + 10 + 5 + 5) * 5% = R$ 5,5.

O sistema calcula o valor do imposto e mostra na tela sua descrição (“ICMS”, por exemplo). Não há uma informação em comum entre os impostos, já que as bases de cálculo variam e as alíquotas podem ser fixas ou não.

O sistema permite que o usuário cadastre em uma lista até dez impostos de qualquer um dos quatro tipos expostos no contexto e, independentemente do tipo, mostra o cálculo para cada um dos impostos cadastrados e também mostrar a descrição deles.

Atividade 5: Foi criado um sistema de uma pizzaria, onde pode ser cadastrados sabores de pizza e bebidas em um cardápio, criar pedido e mostra-lo na tela, cadastrar o pedido para cozinha e extrair próximo pedido a ser preparado e levado ao cliente.





# Unidade Curricular 7:

Atividade 3:

Contexto

A empresa na qual você atua recebeu uma demanda para criação de um sistema para uma academia de musculação/crossfit que apresente indicações de exercícios que podem ser divididos em várias categorias.

Utilize como base as categorias de corrida e musculação que possam ser divididas em exercícios de resistência ou velocidade.

Sabendo que os diferentes exercícios são representados por objetos, avalie qual das opções de padrão de projeto pode ser aplicada para esse código. Considere como opções: observer, abstract factory e state.

Atividade

Escolha entre os três padrões de projetos apresentados o que melhor se aplica neste projeto e justifique sua escolha.

Implemente um código no NetBeans (Java Ant) com a solução do desafio proposto.


Atividade 4:

Contexto

Uma empresa de software está em uma concorrência para oferecer seu sistema a uma grande rede de atuação nacional para supermercados. Para isso, não basta simplesmente que o sistema esteja testado e funcionando, ele precisa atender aos princípios do SOLID (princípio da responsabilidade única; princípio do aberto/fechado; princípio da substituição de Liskov; princípio da segregação de interface; princípio da inversão de dependência), seguir propostas de lean code (código enxuto) e evitar code smells (cheiros de código). Você deverá analisar e refatorar o código desenvolvido por outros membros da sua equipe, com base nos princípios requisitados.

Atividade
Baseado no princípio de responsabilidade única (S) do SOLID, refatore em sua máquina a classe ProdutoController do Projeto Supermercado, disponível em Conteúdo > Material complementar.

Mesmo que o código esteja compilando, identifique e corrija

os métodos que estão “fedorentos”.
os princípios do “S” do SOLID que foram violados.
Proponha melhorias no código do projeto no NetBeans.


# Unidade Curricular 9:
Atividade 1:

Contexto

A empresa de desenvolvimento onde você trabalha está montando um MVP (produto viável mínimo, em inglês minimum viable product) para uma loja. Em um projeto que servirá de protótipo e prova de conceito, você ficou encarregado de montar telas simples em Java.

Usando apenas código, faça o seguinte:
Crie uma janela e inclua nela um campo de entrada de texto e um botão. O usuário informará o valor de uma venda nesse campo.
Crie uma janela de diálogo que deve aparecer se, ao clicar no botão, o valor for maior que 500. Essa janela de diálogo deve aparecer com um campo para o usuário informar um percentual de desconto. O usuário informará apenas números.
Por fim, faça com que o valor total seja calculado (com desconto, caso tenha havido algum) e mostrado por meio de outra caixa de diálogo.
Atividade

Crie um projeto no NetBeans e implemente a aplicação sem ferramentas visuais, conforme as especificações presentes no contexto. Realize testes e, sempre que possível, inclua verificações para validar o valor informado pelo usuário.

Atividade 2:

Contexto
O Sindicato dos Nutricionistas pretende fazer uma ação diferente com seus associados. Ele distribuirá aos nutricionistas softwares desktop para realizar rapidamente cálculos muito comuns na rotina desses profissionais.

O software precisa realizar:

Cálculo de IMC (índice de massa corporal)
Calculo de gasto calórico basal, que é quanto uma pessoa gasta de caloria para simplesmente sobreviver
Cálculo de gasto calórico total, que considera a quantidade de atividades físicas que a pessoa realiza
Recomendação de quantidade de carboidrato, proteína e gordura que a pessoa deve ingerir

Atividade

Crie um projeto Java no NetBeans e implemente as seguintes funcionalidade e telas usando a ferramenta visual do IDE (ambiente de desenvolvimento integrado, em inglês integrated development environment).

Atividade 3:

Contexto
Com o sucesso do projeto anterior, agora o Sindicato de Nutricionistas se interessa em um projeto de software para os consultórios dos nutricionistas associados. O software, a princípio, será desktop. Neste momento, serão feitas provas de conceito sem o uso de banco de dados. Com a aprovação do cliente, esse recurso poderá ser adicionado no futuro.
O software deve permitir a inclusão e exclusão de registros de consulta. Para cada consulta, informam-se o nome do paciente, o CPF, o telefone, a idade e a data da consulta. Por fim, há uma marcação indicando se essa pessoa já é paciente ou não.
Ao registrar a consulta, esta aparecerá para o usuário listada em uma tabela na tela. Para excluir uma consulta, o usuário deve selecionar a linha na tabela e clicar no botão Excluir. Para o usuário atualizar uma consulta, ele deve selecionar uma linha na tabela e marcar que a consulta já foi realizada. Além disso, pode informar, em texto, o que foi receitado ao paciente.
Todas as operações acontecerão sob listas em memória.

Atividade 4:

Contexto

Os trabalhos com o Sindicato de Nutricionistas ganharam expressão e, com isso, alguns colegas cardiologistas mostraram-se interessados em também disponibilizar software a seus pacientes.
A ideia deles é disponibilizar um programa em que os pacientes que têm aparelho de aferimento de pressão possam registrar os dados de cada medição realizada. O software gravará esses dados em um arquivo que, no dia da consulta, poderá ser levado pelo paciente ao médico, para que este possa observar o histórico das medições.
O software precisa ter apenas uma tela, na qual o usuário informa: data, hora, pressão sistólica e pressão diastólica (estes dois últimos campos numéricos inteiros). O usuário também deve ser capaz de indicar se está em uma situação de estresse no momento da medição.
Como o software é voltado especialmente para pessoas idosas, é importante que use caracteres maiores e que implemente os seguintes aspectos de usabilidade e acessibilidade:
Descrições acessíveis e tooltips nos componentes presentes na tela
Associação de rótulos (JLabel) aos componentes correspondentes
Ordem sequencial de foco nos componentes de tela
Atalhos por teclado
 
Atividade

Para esta proposta, crie um projeto Java no NetBeans com uma tela contendo labels, caixas de texto para os dados requisitados e checkbox para o usuário marcar se está em situação de estresse. Também é necessário existir um botão Salvar, para que haja a gravação desses dados em arquivo (texto ou CSV).
Esses dados devem ser mostrados na própria tela em uma tabela (JTable) ou um campo de texto livre (JTextArea). Esse componente deverá ser preenchido ao abrir o programa e atualizado quando o usuário salvar nova medição.
O programa deverá emitir mensagens amigáveis em casos de falhas, por exemplo, quando um valor inadequado é informado.
