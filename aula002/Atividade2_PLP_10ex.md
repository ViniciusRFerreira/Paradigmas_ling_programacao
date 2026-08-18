 - Baseando-se no capítulo 2 do sebesta, resolva 10 exercícios da lista.
 - Devem ser 5 entre os 10 primeiros e 5 entre os 10 últimos.
 - Você deve colocar um .md no github da diciplina na pasta aula002.

## 1. A genealogia das linguagens não é uma escada de progresso.

**Explique essa afirmação e apresente dois fatores históricos que fazem uma linguagem influenciar outra sem necessariamente substituí-la.**

**Objetivos:** obj01, obj05 · **Referência:** Sebesta, cap. 2, páginas PDF 50, 51.

**R:** A afirmação significa que a evolução das linguagens de programação não acontece de forma linear, como se cada nova linguagem fosse necessariamente melhor e substituísse a anterior. Uma linguagem pode influenciar outra ao apresentar novos conceitos e recursos, mas continuar sendo utilizada por atender a necessidades diferentes.

Dois fatores históricos que explicam isso são as diferentes necessidades e objetivos para os quais as linguagens são desenvolvidas e a compatibilidade e adoção histórica.

Por exemplo, Fortran foi criada com foco em aplicações científicas, enquanto Lisp teve forte relação com inteligência artificial e programação simbólica. Além disso, linguagens que já possuem muitos programas, bibliotecas e usuários dificilmente são totalmente substituídas.

Assim, uma nova linguagem pode incorporar características de outra e influenciá-la sem necessariamente fazer com que a linguagem anterior deixe de existir.


## 2. Plankalkül não foi implementada em sua época.

**Ainda assim, por que ela é relevante para a história das linguagens? Cite três recursos antecipados por seu projeto e explique o valor de um deles.**

**Objetivos:** obj01, obj02 · **Referência:** Sebesta, cap. 2, páginas PDF 52, 53.

**R:** Plankalkül é relevante para a história das linguagens de programação porque, mesmo não tendo sido implementada em sua época, seu projeto antecipou diversos conceitos que posteriormente se tornaram importantes em outras linguagens.

Três recursos antecipados foram o uso de estruturas de dados, o conceito de atribuição de valores e a possibilidade de trabalhar com tipos de dados e operações estruturadas.

Um exemplo de sua importância é o operador de atribuição, que utilizava a forma `expressão => variável` e influenciou posteriormente o ALGOL 58.

Isso mostra que uma linguagem pode contribuir para a evolução da programação mesmo sem ter sido efetivamente implementada ou utilizada em larga escala.


## 5. Lisp surgiu em um contexto diferente de Fortran.

**Compare os domínios, a representação de dados e o estilo de computação favorecido pelas duas linguagens.**

**Objetivos:** obj02, obj03 · **Referência:** Sebesta, cap. 2, páginas PDF 61, 65.

**R:** Lisp e Fortran surgiram para atender a domínios diferentes. Fortran foi desenvolvida principalmente para aplicações científicas e cálculos numéricos, trabalhando com dados como números e vetores.

Já Lisp foi voltada principalmente para inteligência artificial e manipulação de dados simbólicos.

Na representação dos dados, Fortran favorecia estruturas numéricas, enquanto Lisp utilizava principalmente listas e símbolos, permitindo representar informações de maneira mais flexível.

Quanto ao estilo de computação, Fortran favorecia uma abordagem mais procedural e voltada à execução de cálculos, enquanto Lisp favorecia a computação simbólica e o processamento de listas, características importantes para aplicações de inteligência artificial.


## 7. COBOL foi desenhada para processamento comercial.

**Mostre como domínio e público influenciaram sua legibilidade, seus registros e sua relação com FLOW-MATIC.**

**Objetivos:** obj01, obj02, obj04 · **Referência:** Sebesta, cap. 2, páginas PDF 72, 76.

**R:** COBOL foi projetada principalmente para o processamento comercial, portanto seu domínio e seu público influenciaram diretamente o projeto da linguagem.

Como era destinada a aplicações de negócios e precisava ser utilizada por um público mais amplo, a linguagem buscou ser simples e legível, utilizando palavras em inglês para que até mesmo gerentes pudessem compreender os programas.

Além disso, COBOL separou as descrições dos dados das operações executáveis, facilitando a organização dos programas.

Seus registros foram importantes porque aplicações comerciais trabalham principalmente com grandes quantidades de dados estruturados, como informações de clientes, funcionários e transações.

COBOL teve forte relação com FLOW-MATIC, desenvolvida por Grace Hopper, que já defendia a ideia de que programas de processamento de dados deveriam ser escritos utilizando sentenças em inglês.

FLOW-MATIC foi a principal precursora de COBOL e influenciou diretamente sua preocupação com legibilidade e processamento de dados.


## 10. Defina ortogonalidade no projeto de linguagens e use ALGOL 68 para discutir a diferença entre regularidade e simplicidade.

**Uma linguagem muito ortogonal é automaticamente fácil de usar?**

**Objetivos:** obj02, obj04 · **Referência:** Sebesta, cap. 2, páginas PDF 87, 91.

**R:** Ortogonalidade é uma característica do projeto de uma linguagem que permite combinar seus recursos de maneira uniforme, com poucas restrições ou exceções.

Quanto maior a ortogonalidade, menor tende a ser o número de regras especiais da linguagem, aumentando sua regularidade.

ALGOL 68 é um exemplo extremo de ortogonalidade, pois praticamente todas as construções possuem tipos e podem ser combinadas livremente.

Isso aumenta a regularidade da linguagem, mas também pode prejudicar sua simplicidade, pois a grande quantidade de combinações possíveis gera construções muito complexas.

Portanto, uma linguagem muito ortogonal não é automaticamente fácil de usar. A ortogonalidade pode facilitar o aprendizado quando reduz exceções, mas, quando levada ao extremo, pode produzir uma explosão de combinações e aumentar a complexidade.


## 12. Modele em linguagem natural uma pequena base Prolog com dois fatos, uma regra e uma consulta.

**Explique por que isso representa programação lógica, não apenas armazenamento de dados.**

**Objetivos:** obj02, obj03 · **Referência:** Sebesta, cap. 2, páginas PDF 93, 94.

**R:** Uma pequena base Prolog pode representar, por exemplo, que João é pai de Maria e que Maria é mãe de Pedro como dois fatos.

Podemos acrescentar uma regra dizendo que, se uma pessoa é pai ou mãe de outra, então ela é progenitora dessa pessoa.

Uma consulta poderia perguntar se João é progenitor de Maria.

Em linguagem natural, teríamos os fatos “João é pai de Maria” e “Maria é mãe de Pedro”, a regra “se uma pessoa é pai ou mãe de outra pessoa, então ela é progenitora dessa pessoa” e a consulta “João é progenitor de Maria?”.

Isso representa programação lógica porque o programa não apenas armazena informações: ele possui fatos, regras e consultas, permitindo que o sistema realize inferências para determinar se uma conclusão pode ser obtida a partir da base de conhecimento.

Prolog utiliza mecanismos como unificação e resolução para realizar esse processo.


## 13. Ada resultou de requisitos e projeto em grande escala.

**Analise como confiabilidade, tipos, pacotes e concorrência se relacionam ao domínio de sistemas críticos.**

**Objetivos:** obj02, obj04 · **Referência:** Sebesta, cap. 2, páginas PDF 94, 98.

**R:** Ada foi projetada para aplicações em que a confiabilidade era especialmente importante, principalmente sistemas de grande porte e sistemas críticos.

Por isso, a linguagem possui recursos que ajudam a detectar e controlar erros, além de mecanismos de tipos que aumentam a segurança dos programas.

Os pacotes permitem encapsular dados, tipos e procedimentos, favorecendo a abstração de dados e a organização de sistemas complexos.

Ada também possui suporte à concorrência por meio de tarefas e do mecanismo de rendezvous, que permite sincronização e comunicação entre tarefas.

Esses recursos estão relacionados ao domínio de sistemas críticos porque ajudam a organizar programas grandes, reduzir erros e controlar a execução concorrente, aspectos fundamentais quando uma falha pode causar consequências graves.


## 14. Compare o papel dos objetos em Smalltalk, C++ e Java.

**Inclua na resposta o compromisso de C++ com C e a estratégia de portabilidade de Java.**

**Objetivos:** obj02, obj03 · **Referência:** Sebesta, cap. 2, páginas PDF 98, 103.

**R:** Smalltalk é uma linguagem orientada a objetos pura, na qual praticamente tudo é objeto e toda computação ocorre por passagem de mensagens.

A verificação de tipos e a vinculação das mensagens aos métodos são dinâmicas, proporcionando grande flexibilidade.

C++ adotou conceitos de orientação a objetos, como abstração de dados, herança e vinculação dinâmica, mas manteve os recursos tradicionais de C.

Esse compromisso com C fez com que C++ preservasse recursos poderosos, porém também herdasse algumas inseguranças e aumentasse sua complexidade.

Java foi baseada em C++, mas seus projetistas removeram ou modificaram diversos recursos para obter uma linguagem menor, mais simples e mais segura.

Além disso, Java utiliza uma estratégia de portabilidade baseada na Máquina Virtual Java: o programa pode ser executado em diferentes plataformas que possuam uma JVM compatível, em vez de depender diretamente do código de máquina de uma plataforma específica.


## 15. A primeira aplicação de Java não foi a Web, mas a Web impulsionou sua adoção.

**Explique como mudanças de contexto podem reposicionar uma linguagem.**

**Objetivos:** obj01, obj02, obj04 · **Referência:** Sebesta, cap. 2, páginas PDF 103, 107.

**R:** A primeira aplicação de Java não foi a Web. A linguagem foi inicialmente projetada para dispositivos eletrônicos de consumo, buscando uma alternativa mais simples, segura e confiável que C e C++.

Entretanto, os produtos em que Java foi inicialmente utilizada não chegaram a ser comercializados.

Com a popularização da World Wide Web e o surgimento de navegadores gráficos, percebeu-se que Java poderia ser utilizada para criar programas pequenos, chamados applets, que eram executados nos navegadores e podiam produzir conteúdo dentro das páginas Web.

Dessa forma, a mudança do contexto tecnológico fez com que Java encontrasse uma nova aplicação e se tornasse muito popular.

Isso mostra que uma linguagem pode ser reposicionada quando surge um novo ambiente ou necessidade que aproveite melhor suas características.


## 18. Diferencie XSLT e JSP quanto a entrada, processamento e saída.

**Por que ambas podem ser chamadas de linguagens híbridas de marcação e programação?**

**Objetivos:** obj02, obj03 · **Referência:** Sebesta, cap. 2, páginas PDF 116, 118.

**R:** XSLT e JSP são linguagens híbridas de marcação-programação porque combinam elementos de marcação com recursos capazes de realizar operações de programação.

No caso da XSLT, a entrada é formada por um documento XML de dados e um documento XSLT que descreve as transformações.

O processador aplica templates e outras operações aos dados XML e produz como saída outro documento, que pode ser XML, HTML ou texto.

Já JSP é normalmente um documento que mistura HTML e código Java. Quando uma página JSP é solicitada por um navegador, o processador JSP converte o documento em um servlet, incorporando o código Java, e o servidor executa esse servlet para gerar a resposta, normalmente em HTML.

Portanto, enquanto XSLT tem como principal objetivo transformar documentos XML, JSP é voltada à geração de documentos Web dinâmicos no servidor.

Ambas são híbridas porque utilizam marcação para estruturar documentos e elementos de programação para realizar processamento.
