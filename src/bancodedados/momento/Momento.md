# Momento 

Contém a base de indicados da empresa Momento para treinar consultas complexas no MongoDB.

Vamos fazer algumas perguntas para brincar de análise exploratória de dados com MongoDB.

* Quantos funcionarios da empresa Momento trabalham no departamento de vendas?

10

```js
db.funcionarios.countDocuments({departamento: ObjectId("85992103f9b3e0b3b3c1fe71")})
```

* Inclua suas próprias informações no departamento de Tecnologia da empresa.

```js
db.funcionarios.insertOne(
{
    _id: ObjectId("5f8b3f3f9b3e0b3b3c1e3e93"),
    nome: "Matheus de Oliveira Almeida Costa",
    telefone: "11987539647",
    email: "mathtml.1105@gmail.com",
    dataAdmissao: "2024-05-11",
    cargo: "Desenvolvedor Mobile",
    salario: 71000,
    departamento: ObjectId("5f8b3f3f9b3e0b3b3c1e3e3e"),
})
```
* Agora diga, quantos funcionários temos ao total na empresa?

24

```js
db.funcionarios.countDocuments()
```
* E quanto ao Departamento de Tecnologia?

5

db.funcionarios.countDocuments({departamento: ObjectId("85992103f9b3e0b3b3c1fe74")})

* Qual a média salarial do departamento de tecnologia?

4560

```js
db.funcionarios.aggregate([{
$match: {
	departamento: ObjectId("85992103f9b3e0b3b3c1fe74")
}
}
  ,{
    $group: {
      _id: null,
      totalSalarios: { $sum: "$salario" },
      totalFuncionarios: { $sum: 1 }
    }
  },
  {
    $project: {
      _id: 0,
      mediaSalarios: { $divide: ["$totalSalarios", "$totalFuncionarios"] }
    }
  }
])
```


* Quanto o departamento de Vendas gasta em salários?

95100

```js
db.funcionarios.aggregate([
  {
    $match: {
      departamento: ObjectId("85992103f9b3e0b3b3c1fe71")
    }
  },
  {
    $group: {
      _id: null,
      totalSalarios: { $sum: "$salario" }
    }
  }
])
```


* Um novo departamento foi criado. O departamento de Inovações. 
Ele será locado no Brasil. Por favor, adicione-o no banco de dados da empresa colocando quaisquer informações que você achar relevantes.

```js
db.funcionarios.aggregate([{
$match: {
	departamento: ObjectId("85992103f9b3e0b3b3c1fe74")
}
}
  ,{
    $group: {
      _id: null,
      totalSalarios: { $sum: "$salario" },
      totalFuncionarios: { $sum: 1 }
    }
  },
  {
    $project: {
      _id: 0,
      mediaSalarios: { $divide: ["$totalSalarios", "$totalFuncionarios"] }
    }
  }
])
```


* O departamento de Inovações está sem funcionários. Inclua alguns colegas de turma nesse departamento.  

```js
db.funcionarios.insertMany([
{
nome: "Victor de Curtis",
telefone: "11111111111",
email: "decurtis@moedas.com",
dataAdmissao: "1996-02-17",
cargo: "Desenvolvedor FullStack",
salario: 1000,
departamento: ObjectId("66f4292601b9c2ddced97dc3")
},{
nome: "Hudson Souza",
telefone: "11222222222",
email: "hudson@dev.com",
dataAdmissao: "1996-02-17",
cargo: "Desenvolvedor Frontend",
salario: 11000,
departamento: ObjectId("66f4292601b9c2ddced97dc3")
},{
nome: "Murilo Oliveira",
telefone: "11333333333",
email: "113333333",
dataAdmissao: "1996-02-17",
cargo: "Desenvolvedor FullStack",
salario: 10000,
departamento: ObjectId("66f4292601b9c2ddced97dc3")
}
])
```

*Quantos funcionarios a empresa Momento tem agora?

27

```js
db.funcionarios.countDocuments()
```

* Quantos funcionários da empresa Momento possuem conjuges?

7

```js
db.funcionarios.countDocuments({ "dependentes.conjuge": { $exists: true }})
```

* Qual a média salarial dos funcionários da empresa Momento, excluindo-se o CEO?

```js
db.funcionarios.aggregate([{
$match: {
		cargo: {$ne: "CEO"}
}
}
  ,{
    $group: {
      _id: null,
      totalSalarios: { $sum: "$salario" },
      totalFuncionarios: { $sum: 1 }
    }
  },
  {
    $project: {
      _id: 0,
      mediaSalarios: { $divide: ["$totalSalarios", "$totalFuncionarios"] }
    }
  }
])
```

* Qual o departamento com a maior média salarial?

* Qual o departamento com o menor número de funcionários?

* Pensando na relação quantidade e valor unitario, qual o produto mais valioso da empresa?

* Qual o produto mais vendido da empresa?

* Qual o produto menos vendido da empresa?