# Atividades_Senac_Java

Atividades do curso técnico de desenvolvimento de sistemas do Senac. Módulo 2(Programação Orientada a Objetos em Java).
Os projetos enviados foram realizados na IDE Netbeans.

Unidade Curricular 6:

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
  2.	Um código principal (main()) que
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
