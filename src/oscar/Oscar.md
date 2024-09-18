# Oscar Goes To?

A atividade está relacionada ao banco de dados MongoDB e se baseia em queries executadas no mongosh (Mongo Shell). A seguir, estão listadas as queries que resultam nas respostas dos exercícios, assumindo que a base de dados estará alimentada da mesma forma que a minha.


## Quantas vezes Natalie Portman foi indicada ao oscar?

db.registros.countDocuments( {
    nome_do_indicado: { $regex: "Natalie Portman", $options: "i"}
})

## Quantos Oscars Natalie Portman ganhou?
db.registros.countDocuments( { \
 nome_do_indicado: { $regex: "Natalie Portman", $options: "i" }, \
 vencedor: "true" \
})

## Amy Adams já ganhou algum Oscar?

Não

db.registros.countDocuments({ \
nome_do_indicado: { $regex: "Amy Adams", $options: "i" }, \
vencedor: "true" \
})

## A série de filmes Toy Story ganhou um Oscar em quais anos?

2011 e 2020

db.registros.find({ \
nome_do_filme: /Toy Story/, \
vencedor: "true" \
}, {ano_cerimonia: 1})

## A partir de que ano que a categoria "Actress" deixa de existir? 

1976

db.registros.find( \
{categoria: "ACTRESS"}, \
{ano_cerimonia: 1, _id: 0} 
).sort({ano_cerimonia: -1}).limit(1)

## O primeiro Oscar para melhor Atriz foi para quem? Em que ano?

Janet Gaynor, 1928

db.registros.find( \
{categoria: "ACTRESS", vencedor: "true"}, \
{nome_do_indicado: 1, ano_cerimonia: 1} 
).limit(1)

## Na campo "Vencedor", altere todos os valores com "Sim" para 1 e todos os valores "Não" para 0.


db.registros.updateMany(
{vencedor: "true"}, \
{$set: { vencedor: 1} } \
)