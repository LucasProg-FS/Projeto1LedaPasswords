# Análise de Algoritmos de Ordenação

Este projeto tem como objetivo analisar a execução de algoritmos de ordenação a partir de uma base de dados com mais de 600 mil linhas, onde cada linha representa informações sobre as senhas mais utilizadas no mundo. Além da análise, o projeto realiza algumas formatações na base de dados, como a adição de uma nova coluna de classificação de senhas, além de formatar a data para o formato dd/mm/aaaa.

## Conteúdo

- [Detalhes do Projeto](#detalhes-do-projeto)
- [Informações Adicionais](#informações-adicionais)
- [Como Executar](#como-executar)
- [Pré-requisitos](#pré-requisitos)
- [Instruções de Execução](#instruções-de-execução)
- [Saída Esperada](#saida-esperada)

## Detalhes do Projeto

O projeto inclui:

- Análise da execução de algoritmos de ordenação
- Formatação da base de dados
- Criação de arquivos .csv para melhor, pior e caso médio de cada algoritmo de ordenação

## Informações Adicionais

O intuito desse projeto é fazer as ordenações e análises a partir do arquivo "passwords_formated_data.csv" que será criado, no entanto, levaria muito tempo para que ao executar você tivesse algum resultado breve, portanto,
construi um novo arquivo intitulado "passwords_test.csv" que contém partes aleatórias do arquivo principal, dessa forma, o retorno da execução desse código levará poucos minutos.

Caso queira utilizar o arquivo principal, siga os passos abaixo:
- Navegue até src
- Abra o arquivo GetVariables.java
- Localize o método readDataToArray
- Altere os campos que possuem uma string representando o "filename" para "dataset/passwords_formated_data.csv"

## Como Executar

Siga as instruções abaixo para executar o projeto na sua máquina, seja utilizando MacOs ou Windows.

### Pré-requisitos

- JDK (Java Development Kit) instalado na sua máquina
- IntelliJ IDEA ou qualquer IDE Java de sua preferência

### Instruções de Execução

1. Clone este repositório:

```bash
git clone https://github.com/LucasProg-FS/Projeto1LedaPasswords.git
````

2. Abra o projeto na sua IDE Java (IntelliJ IDEA, Eclipse, etc.).
3. Execute a classe Main.

## Saída Esperada

Após a execução da classe Main, será criado alguns arquivos formatados do "passwords.csv", em seguida, será mostrado todos os arquivos .csv para cada algoritmo, bem como para cada caso desse algoritmo, o qual foram criados logo após a ordenação, além disso o console mostrará o tempo que levou para cada execução.
