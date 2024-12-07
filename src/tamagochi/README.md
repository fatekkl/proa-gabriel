# Projeto Tamagochi em Kotlin

## Descrição
Este é um projeto de um jogo de Tamagochi simples implementado em Kotlin, onde o jogador interage com um pet virtual realizando diferentes ações como alimentar, brincar, descansar e verificar o status.

## Estrutura do Projeto
O projeto é composto por dois arquivos principais:
- `Main.kt`: Contém a lógica principal do jogo e a interação com o usuário
- `Tamagochi.kt`: Define a classe `Tamagochi` com suas propriedades e métodos

### Arquivo Main.kt
#### Funcionalidades
- Solicita o nome do pet
- Apresenta um menu interativo com 5 opções:
    1. Alimentar o pet
    2. Brincar com o pet
    3. Verificar status do pet
    4. Colocar o pet para dormir
    5. Sair do jogo

#### Fluxo do Jogo
- O jogo roda em um loop infinito até que o pet morra ou o usuário escolha sair
- A cada ação, o método `pastTime()` é chamado para simular a passagem do tempo
- Se o pet não estiver mais vivo, o jogo é encerrado

### Classe Tamagochi
#### Atributos
- `name`: Nome do pet (String)
- `hunger`: Nível de fome (Int, padrão 30)
- `happiness`: Nível de felicidade (Int, padrão 50)
- `fatigue`: Nível de cansaço (Int, padrão 0)
- `age`: Idade do pet (Int, padrão 0)
- `alive`: Estado de vida do pet (Boolean, padrão true)

#### Métodos
1. `eat()`:
    - Reduz o nível de fome
    - Imprime mensagem de redução de fome

2. `joke()`:
    - Aumenta a felicidade
    - Aumenta o cansaço
    - Imprime mensagem de felicidade

3. `rest()`:
    - Reduz o nível de cansaço
    - Imprime mensagem de descanso

4. `status()`:
    - Imprime informações atuais do pet (nome, fome, felicidade, cansaço, idade)

5. `pastTime()`:
    - Simula a passagem do tempo
    - Aumenta fome
    - Reduz felicidade
    - Aumenta idade
    - Imprime mensagem sobre fome

6. `isAlive()`:
    - Verifica as condições de vida do pet
    - Ajusta níveis de fome, felicidade e cansaço
    - Atualiza status de vida

## Condições de Morte do Pet
O pet pode morrer nas seguintes situações:
- Fome atinge ou ultrapassa 100
- Felicidade chega a 0
- Cansaço atinge ou ultrapassa 100

## Requisitos
- Kotlin
- JDK 8 ou superior

## Como Executar
1. Certifique-se de ter o Kotlin e o JDK instalados
2. Compile o projeto
3. Execute o arquivo principal
4. Siga as instruções no console

## Próximos Passos/Melhorias
- Adicionar mais interações
- Implementar sistema de níveis
- Criar interface gráfica
- Adicionar persistência de dados

## Autor
[Matheus de Oliveira]

