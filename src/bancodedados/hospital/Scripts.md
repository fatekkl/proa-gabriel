# Scripts

Abaixo estão todos os scripts usados para popular o banco de dados:

## Pacientes
```js
db.pacientes.insertMany([ {
    "_id": ObjectId("671939c25a37072279c0b591"),
    "nome": "Thiago Nascimento",
    "data_nascimento": ISODate("1988-06-17T03:00:00.000Z"),
    "altura": 1.89,
    "peso": 90,
    "endereco": {
      "logradouro": "Rua dos Trabalhadores",
      "numero": "75",
      "bairro": "Campo Belo",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04618000"
    },
    "documentos": {
      "CPF": "22334455678",
      "CRM": "19032098786"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325297")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b592"),
    "nome": "Maria Silva",
    "data_nascimento": ISODate("1992-03-25T03:00:00.000Z"),
    "altura": 1.65,
    "peso": 62,
    "endereco": {
      "logradouro": "Avenida Paulista",
      "numero": "1500",
      "bairro": "Bela Vista",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "01310000"
    },
    "documentos": {
      "CPF": "33445566789",
      "CRM": "19032098787"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325297")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b593"),
    "nome": "João Santos",
    "data_nascimento": ISODate("1975-11-12T02:00:00.000Z"),
    "altura": 1.78,
    "peso": 80,
    "endereco": {
      "logradouro": "Rua Augusta",
      "numero": "2340",
      "bairro": "Jardins",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "01412000"
    },
    "documentos": {
      "CPF": "44556677890",
      "CRM": "19032098788"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325297")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b594"),
    "nome": "Ana Oliveira",
    "data_nascimento": ISODate("1983-09-05T03:00:00.000Z"),
    "altura": 1.70,
    "peso": 65,
    "endereco": {
      "logradouro": "Rua Oscar Freire",
      "numero": "678",
      "bairro": "Jardim Paulista",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "01426000"
    },
    "documentos": {
      "CPF": "55667788901",
      "CRM": "19032098789"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325297")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b595"),
    "nome": "Carlos Ferreira",
    "data_nascimento": ISODate("1990-07-30T03:00:00.000Z"),
    "altura": 1.82,
    "peso": 85,
    "endereco": {
      "logradouro": "Alameda Santos",
      "numero": "455",
      "bairro": "Paraíso",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "01419000"
    },
    "documentos": {
      "CPF": "66778899012",
      "CRM": "19032098790"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325297")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b596"),
    "nome": "Patricia Lima",
    "data_nascimento": ISODate("1987-04-15T03:00:00.000Z"),
    "altura": 1.68,
    "peso": 58,
    "endereco": {
      "logradouro": "Rua Pamplona",
      "numero": "1023",
      "bairro": "Jardim Paulista",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "01405000"
    },
    "documentos": {
      "CPF": "77889900123",
      "CRM": "19032098791"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325298")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b597"),
    "nome": "Ricardo Souza",
    "data_nascimento": ISODate("1982-12-08T02:00:00.000Z"),
    "altura": 1.75,
    "peso": 78,
    "endereco": {
      "logradouro": "Rua Haddock Lobo",
      "numero": "595",
      "bairro": "Cerqueira César",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "01414000"
    },
    "documentos": {
      "CPF": "88990011234",
      "CRM": "19032098792"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325298")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b598"),
    "nome": "Fernanda Costa",
    "data_nascimento": ISODate("1993-02-20T03:00:00.000Z"),
    "altura": 1.72,
    "peso": 63,
    "endereco": {
      "logradouro": "Rua da Consolação",
      "numero": "3456",
      "bairro": "Consolação",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "01301000"
    },
    "documentos": {
      "CPF": "99001122345",
      "CRM": "19032098793"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325298")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b599"),
    "nome": "Lucas Mendes",
    "data_nascimento": ISODate("1985-08-25T03:00:00.000Z"),
    "altura": 1.80,
    "peso": 82,
    "endereco": {
      "logradouro": "Rua Estados Unidos",
      "numero": "1288",
      "bairro": "Jardim América",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "01427000"
    },
    "documentos": {
      "CPF": "00112233456",
      "CRM": "19032098794"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325298")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b600"),
    "nome": "Beatriz Almeida",
    "data_nascimento": ISODate("1991-05-17T03:00:00.000Z"),
    "altura": 1.67,
    "peso": 60,
    "endereco": {
      "logradouro": "Rua Joaquim Floriano",
      "numero": "987",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04534000"
    },
    "documentos": {
      "CPF": "11223344567",
      "CRM": "19032098795"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325298")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b601"),
    "nome": "Gabriel Santos",
    "data_nascimento": ISODate("1989-10-03T03:00:00.000Z"),
    "altura": 1.85,
    "peso": 88,
    "endereco": {
      "logradouro": "Avenida Brigadeiro Faria Lima",
      "numero": "3477",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04538000"
    },
    "documentos": {
      "CPF": "22334455678",
      "CRM": "19032098796"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325299")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b602"),
    "nome": "Mariana Costa",
    "data_nascimento": ISODate("1986-07-22T03:00:00.000Z"),
    "altura": 1.69,
    "peso": 61,
    "endereco": {
      "logradouro": "Rua Tabapuã",
      "numero": "1234",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04533000"
    },
    "documentos": {
      "CPF": "33445566789",
      "CRM": "19032098797"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325299")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b603"),
    "nome": "Felipe Rodrigues",
    "data_nascimento": ISODate("1984-03-14T03:00:00.000Z"),
    "altura": 1.83,
    "peso": 87,
    "endereco": {
      "logradouro": "Rua Bandeira Paulista",
      "numero": "567",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04532000"
    },
    "documentos": {
      "CPF": "44556677890",
      "CRM": "19032098798"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325299")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b604"),
    "nome": "Camila Lima",
    "data_nascimento": ISODate("1994-01-30T02:00:00.000Z"),
    "altura": 1.71,
    "peso": 64,
    "endereco": {
      "logradouro": "Rua João Cachoeira",
      "numero": "890",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04535000"
    },
    "documentos": {
      "CPF": "55667788901",
      "CRM": "19032098799"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325299")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b605"),
    "nome": "Rafael Oliveira",
    "data_nascimento": ISODate("1981-12-05T02:00:00.000Z"),
    "altura": 1.79,
    "peso": 83,
    "endereco": {
      "logradouro": "Rua Clodomiro Amazonas",
      "numero": "1432",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04537000"
    },
    "documentos": {
      "CPF": "66778899012",
      "CRM": "19032098800"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf5325299")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b606"),
    "nome": "Julia Ferreira",
    "data_nascimento": ISODate("1990-09-18T03:00:00.000Z"),
    "altura": 1.66,
    "peso": 59,
    "endereco": {
      "logradouro": "Rua Leopoldo Couto Magalhães Jr",
      "numero": "758",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04542000"
    },
    "documentos": {
      "CPF": "77889900123",
      "CRM": "19032098801"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf53252a0")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b607"),
    "nome": "Bruno Santos",
    "data_nascimento": ISODate("1987-06-27T03:00:00.000Z"),
    "altura": 1.81,
    "peso": 84,
    "endereco": {
      "logradouro": "Rua Amauri",
      "numero": "345",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04536000"
    },
    "documentos": {
      "CPF": "88990011234",
      "CRM": "19032098802"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf53252a0")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b608"),
    "nome": "Carolina Silva",
    "data_nascimento": ISODate("1992-04-09T03:00:00.000Z"),
    "altura": 1.73,
    "peso": 66,
    "endereco": {
      "logradouro": "Rua Manuel Guedes",
      "numero": "321",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04536000"
    },
    "documentos": {
      "CPF": "99001122345",
      "CRM": "19032098803"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf53252a0")
  },  {
    "_id": ObjectId("671939c25a37072279c0b610"),
    "nome": "Rodrigo Mendonça",
    "data_nascimento": ISODate("1986-08-14T03:00:00.000Z"),
    "altura": 1.88,
    "peso": 89,
    "endereco": {
      "logradouro": "Rua Pedroso Alvarenga",
      "numero": "890",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04531011"
    },
    "documentos": {
      "CPF": "12123434567",
      "CRM": "19032098804"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf53252a0")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b611"),
    "nome": "Amanda Ribeiro",
    "data_nascimento": ISODate("1991-03-22T03:00:00.000Z"),
    "altura": 1.64,
    "peso": 57,
    "endereco": {
      "logradouro": "Rua Campos Bicudo",
      "numero": "456",
      "bairro": "Jardim Europa",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04536041"
    },
    "documentos": {
      "CPF": "23234545678",
      "CRM": "19032098805"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf53252a0")
  },
  {
    "_id": ObjectId("671939c25a37072279c0b612"),
    "nome": "Leonardo Martins",
    "data_nascimento": ISODate("1983-11-30T02:00:00.000Z"),
    "altura": 1.76,
    "peso": 77,
    "endereco": {
      "logradouro": "Rua Joaquim Floriano",
      "numero": "1250",
      "bairro": "Itaim Bibi",
      "cidade": "São Paulo",
      "estado": "SP",
      "cep": "04534004"
    },
    "documentos": {
      "CPF": "34345656789",
      "CRM": "19032098806"
    },
    "convenio_id": ObjectId("67193973b62fc3ebf53252a0")
  }])
```
## Médicos
```js
db.medicos.insertMany([
  {
    "_id": ObjectId("67193646c6d8b0a4761650dc"),
    "nome": "Matheus de Oliveira",
    "data_nascimento": ISODate("2006-07-11T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044244"
    ],
    "contato": {
      "telefone": "11987539647",
      "email": "mathtml.1105@gmail.com"
    },
    "documentos": {
      "CPF": "54144941850",
      "CRM": "05814944145"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650dd"),
    "nome": "Ana Clara",
    "data_nascimento": ISODate("1985-02-22T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044245"
    ],
    "contato": {
      "telefone": "11987654321",
      "email": "anaclara@gmail.com"
    },
    "documentos": {
      "CPF": "12345678900",
      "CRM": "05814944146"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650de"),
    "nome": "Lucas Ferreira",
    "data_nascimento": ISODate("1990-05-15T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044246"
    ],
    "contato": {
      "telefone": "11984561234",
      "email": "lucas.ferreira@gmail.com"
    },
    "documentos": {
      "CPF": "09876543210",
      "CRM": "05814944147"
    },
    "status": false
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650df"),
    "nome": "Juliana Santos",
    "data_nascimento": ISODate("1995-03-30T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044247"
    ],
    "contato": {
      "telefone": "11983456789",
      "email": "juliana.santos@gmail.com"
    },
    "documentos": {
      "CPF": "11223344556",
      "CRM": "05814944148"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e0"),
    "nome": "Fernando Lima",
    "data_nascimento": ISODate("1988-08-20T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044248"
    ],
    "contato": {
      "telefone": "11999887766",
      "email": "fernando.lima@gmail.com"
    },
    "documentos": {
      "CPF": "66778899000",
      "CRM": "05814944149"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e1"),
    "nome": "Mariana Costa",
    "data_nascimento": ISODate("1992-12-05T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044249"
    ],
    "contato": {
      "telefone": "11987766554",
      "email": "mariana.costa@gmail.com"
    },
    "documentos": {
      "CPF": "12312312312",
      "CRM": "05814944150"
    },
    "status": false
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e2"),
    "nome": "Gustavo Almeida",
    "data_nascimento": ISODate("1983-10-17T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044250"
    ],
    "contato": {
      "telefone": "11933334455",
      "email": "gustavo.almeida@gmail.com"
    },
    "documentos": {
      "CPF": "44455566677",
      "CRM": "05814944151"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e3"),
    "nome": "Isabela Martins",
    "data_nascimento": ISODate("1994-06-09T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044251"
    ],
    "contato": {
      "telefone": "11944445556",
      "email": "isabela.martins@gmail.com"
    },
    "documentos": {
      "CPF": "55566677788",
      "CRM": "05814944152"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e4"),
    "nome": "Rafael Souza",
    "data_nascimento": ISODate("1987-09-14T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044252"
    ],
    "contato": {
      "telefone": "11922223333",
      "email": "rafael.souza@gmail.com"
    },
    "documentos": {
      "CPF": "66677788899",
      "CRM": "05814944153"
    },
    "status": false
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e5"),
    "nome": "Roberta Lima",
    "data_nascimento": ISODate("1991-01-11T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044253"
    ],
    "contato": {
      "telefone": "11977788899",
      "email": "roberta.lima@gmail.com"
    },
    "documentos": {
      "CPF": "33344455566",
      "CRM": "05814944154"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e6"),
    "nome": "Tiago Martins",
    "data_nascimento": ISODate("1996-03-23T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044254"
    ],
    "contato": {
      "telefone": "11955566666",
      "email": "tiago.martins@gmail.com"
    },
    "documentos": {
      "CPF": "88899900011",
      "CRM": "05814944155"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e7"),
    "nome": "Fernanda Almeida",
    "data_nascimento": ISODate("1990-07-20T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044255"
    ],
    "contato": {
      "telefone": "11944455666",
      "email": "fernanda.almeida@gmail.com"
    },
    "documentos": {
      "CPF": "77788899900",
      "CRM": "05814944156"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e8"),
    "nome": "Aline Santos",
    "data_nascimento": ISODate("1993-05-29T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044256"
    ],
    "contato": {
      "telefone": "11955554433",
      "email": "aline.santos@gmail.com"
    },
    "documentos": {
      "CPF": "12332112332",
      "CRM": "05814944157"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650e9"),
    "nome": "Henrique Costa",
    "data_nascimento": ISODate("1984-04-12T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044257"
    ],
    "contato": {
      "telefone": "11977788888",
      "email": "henrique.costa@gmail.com"
    },
    "documentos": {
      "CPF": "33322211100",
      "CRM": "05814944158"
    },
    "status": false
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650ea"),
    "nome": "Roberto Silva",
    "data_nascimento": ISODate("1995-08-30T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044258"
    ],
    "contato": {
      "telefone": "11988887766",
      "email": "roberto.silva@gmail.com"
    },
    "documentos": {
      "CPF": "44433322211",
      "CRM": "05814944159"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650eb"),
    "nome": "Cláudia Mendes",
    "data_nascimento": ISODate("1989-02-19T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044259"
    ],
    "contato": {
      "telefone": "11922221111",
      "email": "claudia.mendes@gmail.com"
    },
    "documentos": {
      "CPF": "55566644433",
      "CRM": "05814944160"
    },
    "status": false
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650ec"),
    "nome": "Daniela Freitas",
    "data_nascimento": ISODate("1986-11-01T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044260"
    ],
    "contato": {
      "telefone": "11911112222",
      "email": "daniela.freitas@gmail.com"
    },
    "documentos": {
      "CPF": "44455566677",
      "CRM": "05814944161"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650ed"),
    "nome": "Vinícius Rocha",
    "data_nascimento": ISODate("1980-03-07T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044261"
    ],
    "contato": {
      "telefone": "11988888888",
      "email": "vinicius.rocha@gmail.com"
    },
    "documentos": {
      "CPF": "22233344455",
      "CRM": "05814944162"
    },
    "status": true
  },{
    "_id": ObjectId("67193646c6d8b0a4761650ee"),
    "nome": "Tatiane Ribeiro",
    "data_nascimento": ISODate("1992-08-15T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044262"
    ],
    "contato": {
      "telefone": "11912345678",
      "email": "tatiane.ribeiro@gmail.com"
    },
    "documentos": {
      "CPF": "55566677788",
      "CRM": "05814944163"
    },
    "status": true
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650ef"),
    "nome": "Eduardo Gomes",
    "data_nascimento": ISODate("1983-04-10T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044263"
    ],
    "contato": {
      "telefone": "11999998888",
      "email": "eduardo.gomes@gmail.com"
    },
    "documentos": {
      "CPF": "33344455566",
      "CRM": "05814944164"
    },
    "status": false
  },
  {
    "_id": ObjectId("67193646c6d8b0a4761650f0"),
    "nome": "Sofia Martins",
    "data_nascimento": ISODate("1994-05-30T03:00:00.000Z"),
    "especialidades": [
      "671934a66c655bc7d9044264"
    ],
    "contato": {
      "telefone": "11987654321",
      "email": "sofia.martins@gmail.com"
    },
    "documentos": {
      "CPF": "11122233344",
      "CRM": "05814944165"
    },
    "status": true
  }
])
```
## Especialidades
```js
db.enfermeiros.insertMany([
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051f9"),
    "nome": "Marcelo Silva",
    "cpf": "78294561031",
    "coren": "123456789"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fa"),
    "nome": "Julia Fernandes",
    "cpf": "45129836029",
    "coren": "987654321"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fb"),
    "nome": "Roberto Souza",
    "cpf": "96385274100",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fc"),
    "nome": "Camila Ribeiro",
    "cpf": "10293847560",
    "coren": "102938475"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fd"),
    "nome": "Ana Beatriz",
    "cpf": "20394857612",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fe"),
    "nome": "Ricardo Almeida",
    "cpf": "39485726109",
    "coren": "453627819"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051ff"),
    "nome": "Fernanda Costa",
    "cpf": "50618372948",
    "coren": "761029384"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605200"),
    "nome": "Luis Oliveira",
    "cpf": "67584930215",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605201"),
    "nome": "Paula Monteiro",
    "cpf": "73829465012",
    "coren": "293847561"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605202"),
    "nome": "Carlos Augusto",
    "cpf": "82639475019",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605203"),
    "nome": "Beatriz Mendes",
    "cpf": "93718204659",
    "coren": "120394857"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605204"),
    "nome": "Gustavo Silva",
    "cpf": "83910274658",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605205"),
    "nome": "Sara Albuquerque",
    "cpf": "94027536198",
    "coren": "908172635"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605206"),
    "nome": "Pedro Henrique",
    "cpf": "05183746290",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605207"),
    "nome": "Mariana Almeida",
    "cpf": "16274839501",
    "coren": "475829103"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605208"),
    "nome": "Rafael Costa",
    "cpf": "27384951607",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605209"),
    "nome": "Priscila Andrade",
    "cpf": "38495061782",
    "coren": "374920485"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e60520a"),
    "nome": "Renato Nunes",
    "cpf": "49506173829",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e60520b"),
    "nome": "Letícia Faria",
    "cpf": "50618294738",
    "coren": "584920371"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e60520c"),
    "nome": "Felipe Machado",
    "cpf": "61729384015",
    "coren": ""
  }
]
)
```
## Enfermeiros
```js
db.enfermeiros.insertMany([
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051f9"),
    "nome": "Marcelo Silva",
    "cpf": "78294561031",
    "coren": "123456789"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fa"),
    "nome": "Julia Fernandes",
    "cpf": "45129836029",
    "coren": "987654321"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fb"),
    "nome": "Roberto Souza",
    "cpf": "96385274100",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fc"),
    "nome": "Camila Ribeiro",
    "cpf": "10293847560",
    "coren": "102938475"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fd"),
    "nome": "Ana Beatriz",
    "cpf": "20394857612",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051fe"),
    "nome": "Ricardo Almeida",
    "cpf": "39485726109",
    "coren": "453627819"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e6051ff"),
    "nome": "Fernanda Costa",
    "cpf": "50618372948",
    "coren": "761029384"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605200"),
    "nome": "Luis Oliveira",
    "cpf": "67584930215",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605201"),
    "nome": "Paula Monteiro",
    "cpf": "73829465012",
    "coren": "293847561"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605202"),
    "nome": "Carlos Augusto",
    "cpf": "82639475019",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605203"),
    "nome": "Beatriz Mendes",
    "cpf": "93718204659",
    "coren": "120394857"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605204"),
    "nome": "Gustavo Silva",
    "cpf": "83910274658",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605205"),
    "nome": "Sara Albuquerque",
    "cpf": "94027536198",
    "coren": "908172635"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605206"),
    "nome": "Pedro Henrique",
    "cpf": "05183746290",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605207"),
    "nome": "Mariana Almeida",
    "cpf": "16274839501",
    "coren": "475829103"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605208"),
    "nome": "Rafael Costa",
    "cpf": "27384951607",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e605209"),
    "nome": "Priscila Andrade",
    "cpf": "38495061782",
    "coren": "374920485"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e60520a"),
    "nome": "Renato Nunes",
    "cpf": "49506173829",
    "coren": ""
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e60520b"),
    "nome": "Letícia Faria",
    "cpf": "50618294738",
    "coren": "584920371"
  },
  {
    "_id": ObjectId("67193a5b1c9caeda5e60520c"),
    "nome": "Felipe Machado",
    "cpf": "61729384015",
    "coren": ""
  }
]
)
```
## Convenios
```js
db.convenios.insertMany([
  {
    "_id": ObjectId("67193973b62fc3ebf5325297"),
    "nome": "Premium",
    "cnpj": "12345678000199",
    "tempo_carencia": "90 dias",
    "limites_cobertura": ["Consultas médicas", "Exames laboratoriais", "Internação hospitalar"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf5325298"),
    "nome": "Standard",
    "cnpj": "98765432000155",
    "tempo_carencia": "60 dias",
    "limites_cobertura": ["Consultas médicas", "Exames laboratoriais"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf5325299"),
    "nome": "Gold",
    "cnpj": "55667788000144",
    "tempo_carencia": "30 dias",
    "limites_cobertura": ["Consultas médicas", "Exames laboratoriais", "Cirurgias de baixa complexidade"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a0"),
    "nome": "Platinum",
    "cnpj": "22334455000133",
    "tempo_carencia": "45 dias",
    "limites_cobertura": ["Consultas médicas", "Exames laboratoriais", "Cirurgias de média complexidade", "Internação hospitalar"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a1"),
    "nome": "Bronze",
    "cnpj": "66778899000111",
    "tempo_carencia": "120 dias",
    "limites_cobertura": ["Consultas médicas"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a2"),
    "nome": "Silver",
    "cnpj": "44556677000122",
    "tempo_carencia": "90 dias",
    "limites_cobertura": ["Consultas médicas", "Exames laboratoriais", "Tratamento odontológico"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a3"),
    "nome": "Master",
    "cnpj": "33445566000188",
    "tempo_carencia": "",
    "limites_cobertura": []
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a4"),
    "nome": "Essencial",
    "cnpj": "99887766000144",
    "tempo_carencia": "15 dias",
    "limites_cobertura": ["Consultas médicas", "Exames de rotina"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a5"),
    "nome": "Avançado",
    "cnpj": "11223344000177",
    "tempo_carencia": "60 dias",
    "limites_cobertura": ["Consultas médicas", "Exames laboratoriais", "Atendimento domiciliar"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a6"),
    "nome": "Completo",
    "cnpj": "22113355000155",
    "tempo_carencia": "75 dias",
    "limites_cobertura": ["Consultas médicas", "Internação hospitalar", "Cirurgias"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a7"),
    "nome": "Econômico",
    "cnpj": "33447722000166",
    "tempo_carencia": "30 dias",
    "limites_cobertura": ["Consultas médicas", "Exames laboratoriais"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a8"),
    "nome": "Familia",
    "cnpj": "55001122000199",
    "tempo_carencia": "90 dias",
    "limites_cobertura": ["Consultas médicas", "Internação em enfermaria"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252a9"),
    "nome": "Sênior",
    "cnpj": "77889944000166",
    "tempo_carencia": "120 dias",
    "limites_cobertura": ["Consultas médicas", "Exames preventivos"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252b0"),
    "nome": "Executivo",
    "cnpj": "99001133000122",
    "tempo_carencia": "30 dias",
    "limites_cobertura": ["Consultas médicas", "Check-up anual"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252b1"),
    "nome": "Essencial Plus",
    "cnpj": "77665599000177",
    "tempo_carencia": "60 dias",
    "limites_cobertura": ["Consultas médicas", "Tratamento odontológico", "Fisioterapia"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252b2"),
    "nome": "Top Saúde",
    "cnpj": "66554433000188",
    "tempo_carencia": "20 dias",
    "limites_cobertura": ["Consultas médicas", "Internação hospitalar", "Exames de imagem"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252b3"),
    "nome": "Padrão",
    "cnpj": "88776655000166",
    "tempo_carencia": "45 dias",
    "limites_cobertura": ["Consultas médicas", "Exames laboratoriais"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252b4"),
    "nome": "Saúde Total",
    "cnpj": "44332211000144",
    "tempo_carencia": "90 dias",
    "limites_cobertura": ["Consultas médicas", "Internação hospitalar", "Terapias alternativas"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252b5"),
    "nome": "Viver Bem",
    "cnpj": "99880022000133",
    "tempo_carencia": "15 dias",
    "limites_cobertura": ["Consultas médicas"]
  },
  {
    "_id": ObjectId("67193973b62fc3ebf53252b6"),
    "nome": "Bem-Estar",
    "cnpj": "11002233000199",
    "tempo_carencia": "60 dias",
    "limites_cobertura": ["Consultas médicas", "Exames laboratoriais", "Atendimento psicológico"]
  }
]
)
```
## Consultas
```js
db.consultas.insertMany([
  {
    "_id": ObjectId("671939eb9ef617ec11a50602"),
    "data": ISODate("2023-01-15T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650dc"),
    "paciente_id": ObjectId("671939c25a37072279c0b591")  // Thiago Nascimento
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a50603"),
    "data": ISODate("2023-02-20T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650dc"),
    "paciente_id": ObjectId("671939c25a37072279c0b592")  // Maria Silva
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a50604"),
    "data": ISODate("2023-03-12T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650dc"),
    "paciente_id": ObjectId("671939c25a37072279c0b593")  // João Santos
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a50605"),
    "data": ISODate("2023-04-01T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650dc"),
    "paciente_id": ObjectId("671939c25a37072279c0b594")  // Ana Oliveira
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a50606"),
    "data": ISODate("2023-05-08T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650dd"),
    "paciente_id": ObjectId("671939c25a37072279c0b595")  // Carlos Ferreira
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a50607"),
    "data": ISODate("2023-06-15T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650dd"),
    "paciente_id": ObjectId("671939c25a37072279c0b596")  // Patricia Lima
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a50608"),
    "data": ISODate("2023-07-23T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650dd"),
    "paciente_id": ObjectId("671939c25a37072279c0b597")  // Ricardo Souza
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a50609"),
    "data": ISODate("2023-08-30T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650dd"),
    "paciente_id": ObjectId("671939c25a37072279c0b598")  // Fernanda Costa
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a5060a"),
    "data": ISODate("2023-09-14T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650de"),
    "paciente_id": ObjectId("671939c25a37072279c0b599")  // Lucas Mendes
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a5060b"),
    "data": ISODate("2023-10-05T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650de"),
    "paciente_id": ObjectId("671939c25a37072279c0b600")  // Beatriz Almeida
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a5060c"),
    "data": ISODate("2023-10-18T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650de"),
    "paciente_id": ObjectId("671939c25a37072279c0b601")  // Gabriel Santos
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a5060d"),
    "data": ISODate("2023-11-12T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650de"),
    "paciente_id": ObjectId("671939c25a37072279c0b602")  // Mariana Costa
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a5060e"),
    "data": ISODate("2023-11-30T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650df"),
    "paciente_id": ObjectId("671939c25a37072279c0b603")  // Felipe Rodrigues
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a5060f"),
    "data": ISODate("2023-12-22T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650dc"),
    "paciente_id": ObjectId("671939c25a37072279c0b604")  // Camila Lima
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a50610"),
    "data": ISODate("2023-12-30T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650e2"),
    "paciente_id": ObjectId("671939c25a37072279c0b605")  // Rafael Oliveira
  },
  {
    "_id": ObjectId("671939eb9ef617ec11a50611"),
    "data": ISODate("2023-12-15T03:00:00.000Z"),
    "medico_id": ObjectId("67193646c6d8b0a4761650e2"),
    "paciente_id": ObjectId("671939c25a37072279c0b606")  // Julia Ferreira
  }
]
)
```