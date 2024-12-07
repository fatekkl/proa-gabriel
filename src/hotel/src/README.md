# Documentação do Projeto Hotel em Kotlin

## Visão Geral
Este é um sistema de gerenciamento de hotel desenvolvido em Kotlin, com funcionalidades para cadastro de hóspedes, reserva de quartos, verificação de postos de combustível e reserva de auditórios.

## Estrutura do Projeto
O projeto está organizado em pacotes e classes:

### Pacotes Principais
- `hotel.src`: Contém as classes principais do sistema
- `hotel.src.models`: Contém as classes de modelo

### Classes Principais

#### Hotel.kt
Classe principal que gerencia as operações do hotel:
- Nome do hotel: "Therabithia"
- Possui 20 quartos
- Funções principais:
    1. Inicialização do sistema
    2. Menu principal
    3. Registro de hóspedes
    4. Reserva de quartos
    5. Verificação de postos de combustível
    6. Reserva de auditórios

#### Funcionalidades Detalhadas

1. **Autenticação**
    - Senha fixa: "2678"
    - Solicita nome do usuário ao iniciar

2. **Registro de Hóspedes**
    - Limite de 15 hóspedes
    - Calcula gratuidades para:
        * Crianças menores de 6 anos
        * Idosos acima de 60 anos
    - Valor da diária: R$ 150,00
    - Meia entrada para idosos: R$ 75,00

3. **Reserva de Quartos**
    - 20 quartos disponíveis
    - Limite máximo de 30 dias de hospedagem
    - Verifica ocupação dos quartos

4. **Reserva de Auditórios**
    - Dois auditórios:
        * Laranja: 150 cadeiras + 70 adicionais
        * Colorado (Roxo): 350 cadeiras
    - Cálculo de:
        * Número de garçons
        * Buffet (café, água, salgados)
        * Custos do evento

5. **Verificação de Postos**
    - Compara preços de álcool e gasolina em dois postos
    - Recomenda o posto mais econômico

## Modelos

### Guest.kt
Representa um hóspede com:
- Nome
- Idade

### Room.kt
Representa um quarto com:
- Número
- Status de ocupação
- Lista de hóspedes

### HotelEvent.kt
Representa um evento com detalhes como:
- Nome
- Data
- Hora
- Duração
- Número de garçons
- Custos

### Auditórios (Orange.kt, Purple.kt)
Classes que herdam de Auditorium com métodos para:
- Reserva
- Agendamento
- Cálculo de buffet
- Confirmação de evento

## Funções Utilitárias

### Functions.kt
- `verifyPass()`: Verifica senha de acesso
- `getCheap()`: Identifica o menor valor
- `mistake()`: Tratamento de erro genérico

## Pontos de Atenção
- Senhas e valores são fixos
- Algumas validações são básicas
- Não há persistência de dados (reinicia a cada execução)

## Possíveis Melhorias
1. Implementar persistência de dados
2. Adicionar mais validações
3. Criar interface gráfica
4. Implementar sistema de pagamento mais robusto
5. Adicionar mais opções de gerenciamento