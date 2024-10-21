# Inclua ao menos dez médicos de diferentes especialidades

```js 
db.medicos.insertMany([
    {
        "nome": "Dr. João Pereira",
        "data_nascimento": ISODate("1979-07-15"),
        "endereco": {
            "logradouro": "Avenida Paulista",
            "numero": "1500",
            "bairro": "Bela Vista",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01310300"
        },
        "especialidades": [
            "Cardiologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-934567890",
            "email": "joao@hospital.com"
        },
        "documentos": {
            "CPF": "34567890123",
            "RG": "6612345678",
            "CRM": "SP345678"
        },
        "em_atividade": false
    },
    {
        "nome": "Dra. Marina Silva",
        "data_nascimento": ISODate("1988-04-22"),
        "endereco": {
            "logradouro": "Rua Augusta",
            "numero": "250",
            "bairro": "Consolação",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01305000"
        },
        "especialidades": [
            "Pediatria"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-912345678",
            "email": "marina@hospital.com"
        },
        "documentos": {
            "CPF": "45678901234",
            "RG": "7723456789",
            "CRM": "SP456789"
        },
        "em_atividade": true
    },
    {
        "nome": "Dr. Carlos Menezes",
        "data_nascimento": ISODate("1980-12-03"),
        "endereco": {
            "logradouro": "Rua Oscar Freire",
            "numero": "789",
            "bairro": "Jardins",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01426000"
        },
        "especialidades": [
            "Ortopedia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-913456789",
            "email": "carlos@hospital.com"
        },
        "documentos": {
            "CPF": "56789012345",
            "RG": "8834567890",
            "CRM": "SP567890"
        },
        "em_atividade": true
    },
    {
        "nome": "Dra. Patrícia Gomes",
        "data_nascimento": ISODate("1990-09-17"),
        "endereco": {
            "logradouro": "Rua dos Trilhos",
            "numero": "432",
            "bairro": "Mooca",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "03168000"
        },
        "especialidades": [
            "Ginecologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-914567890",
            "email": "patricia@hospital.com"
        },
        "documentos": {
            "CPF": "67890123456",
            "RG": "9945678901",
            "CRM": "SP678901"
        },
        "em_atividade": false
    },
    {
        "nome": "Dr. Eduardo Santos",
        "data_nascimento": ISODate("1975-05-28"),
        "endereco": {
            "logradouro": "Rua Vergueiro",
            "numero": "150",
            "bairro": "Vila Mariana",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "04101000"
        },
        "especialidades": [
            "Neurologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-915678901",
            "email": "eduardo@hospital.com"
        },
        "documentos": {
            "CPF": "78901234567",
            "RG": "1056789012",
            "CRM": "SP789012"
        },
        "em_atividade": true
    },
    {
        "nome": "Dra. Fernanda Costa",
        "data_nascimento": ISODate("1983-11-30"),
        "endereco": {
            "logradouro": "Rua da Consolação",
            "numero": "400",
            "bairro": "Consolação",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01302000"
        },
        "especialidades": [
            "Oftalmologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-916789012",
            "email": "fernanda@hospital.com"
        },
        "documentos": {
            "CPF": "89012345678",
            "RG": "1167890123",
            "CRM": "SP890123"
        },
        "em_atividade": false
    },
    {
        "nome": "Dr. Ricardo Teixeira",
        "data_nascimento": ISODate("1987-03-05"),
        "endereco": {
            "logradouro": "Rua Cardoso de Almeida",
            "numero": "900",
            "bairro": "Perdizes",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "05013001"
        },
        "especialidades": [
            "Endocrinologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-917890123",
            "email": "ricardo@hospital.com"
        },
        "documentos": {
            "CPF": "90123456789",
            "RG": "1278901234",
            "CRM": "SP901234"
        },
        "em_atividade": true
    },
    {
        "nome": "Dra. Letícia Andrade",
        "data_nascimento": ISODate("1992-06-12"),
        "endereco": {
            "logradouro": "Rua dos Franceses",
            "numero": "350",
            "bairro": "Bela Vista",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01329000"
        },
        "tipo": "Residente",
        "contato": {
            "telefone": "55-11-918901234",
            "email": "leticia@hospital.com"
        },
        "documentos": {
            "CPF": "01234567890",
            "RG": "1389012345",
            "CRM": "SP012345"
        },
        "em_atividade": true
    },
    {
        "nome": "Dr. Felipe Almeida",
        "data_nascimento": ISODate("1978-10-09"),
        "endereco": {
            "logradouro": "Rua dos Timbiras",
            "numero": "1500",
            "bairro": "Santa Ifigênia",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01208010"
        },
        "especialidades": [
            "Urologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-919012345",
            "email": "felipe@hospital.com"
        },
        "documentos": {
            "CPF": "12345678901",
            "RG": "1490123456",
            "CRM": "SP123456"
        },
        "em_atividade": false
    },
    {
        "nome": "Dra. Vanessa Oliveira",
        "data_nascimento": ISODate("1984-08-19"),
        "endereco": {
            "logradouro": "Rua Piauí",
            "numero": "123",
            "bairro": "Higienópolis",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01241010"
        },
        "especialidades": [
            "Reumatologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-920123456",
            "email": "vanessa@hospital.com"
        },
        "documentos": {
            "CPF": "23456789012",
            "RG": "1501234567",
            "CRM": "SP234567"
        },
        "em_atividade": true
    }, {
        "nome": "Dr. Leonardo Araújo",
        "data_nascimento": ISODate("1980-08-10"),
        "endereco": {
            "logradouro": "Avenida Brigadeiro Faria Lima",
            "numero": "1700",
            "bairro": "Jardim Paulistano",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01452000"
        },
        "especialidades": [
            "Ortopedia",
            "Traumatologia",
            "Medicina Esportiva"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-921345678",
            "email": "leonardo@hospital.com"
        },
        "documentos": {
            "CPF": "34567890123",
            "RG": "5512345678",
            "CRM": "SP234567"
        },
        "em_atividade": true
    },
    {
        "nome": "Dra. Camila Nogueira",
        "data_nascimento": ISODate("1985-03-15"),
        "endereco": {
            "logradouro": "Rua Heitor Penteado",
            "numero": "510",
            "bairro": "Sumaré",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01257000"
        },
        "especialidades": [
            "Pediatria",
            "Alergologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-922456789",
            "email": "camila@hospital.com"
        },
        "documentos": {
            "CPF": "45678901234",
            "RG": "6623456789",
            "CRM": "SP345678"
        },
        "em_atividade": true
    },
    {
        "nome": "Dr. Roberto Lima",
        "data_nascimento": ISODate("1979-12-02"),
        "endereco": {
            "logradouro": "Rua Frei Caneca",
            "numero": "1020",
            "bairro": "Consolação",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01307000"
        },
        "especialidades": [
            "Gastroenterologia",
            "Clínica Geral"
        ],
        "tipo": "Generalista",
        "contato": {
            "telefone": "55-11-923567890",
            "email": "roberto@hospital.com"
        },
        "documentos": {
            "CPF": "56789012345",
            "RG": "7734567890",
            "CRM": "SP456789"
        },
        "em_atividade": true
    }, {
        "nome": "Dr. Gabriel Almeida",
        "data_nascimento": ISODate("1985-05-10"),
        "endereco": {
            "logradouro": "Rua dos Três Irmãos",
            "numero": "100",
            "bairro": "Vila Progredior",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "05522000"
        },
        "especialidades": [
            "Cardiologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-912345678",
            "email": "gabriel.almeida@gmail.com"
        },
        "documentos": {
            "CPF": "12345678900",
            "RG": "123456789",
            "CRM": "SP123456"
        },
        "em_atividade": true
    },
    {
        "nome": "Dr. Gabriel Costa",
        "data_nascimento": ISODate("1982-03-25"),
        "endereco": {
            "logradouro": "Avenida São João",
            "numero": "200",
            "bairro": "Centro",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01035000"
        },
        "especialidades": [
            "Pediatria"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-934567890",
            "email": "gabriel.costa@gmail.com"
        },
        "documentos": {
            "CPF": "23456789012",
            "RG": "234567890",
            "CRM": "SP654321"
        },
        "em_atividade": true
    },
    {
        "nome": "Dr. Gabriel Oliveira",
        "data_nascimento": ISODate("1978-08-30"),
        "endereco": {
            "logradouro": "Rua Augusta",
            "numero": "1500",
            "bairro": "Bela Vista",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01305000"
        },
        "especialidades": [
            "Dermatologia",
            "Cirurgia Geral"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-912345679",
            "email": "gabriel.oliveira@gmail.com"
        },
        "documentos": {
            "CPF": "34567890123",
            "RG": "345678901",
            "CRM": "SP789456"
        },
        "em_atividade": false
    },
    {
        "nome": "Dr. Gabriel Santos",
        "data_nascimento": ISODate("1990-01-15"),
        "endereco": {
            "logradouro": "Avenida Ipiranga",
            "numero": "300",
            "bairro": "República",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01046000"
        },
        "especialidades": [
            "Oftalmologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-976543210",
            "email": "gabriel.santos@gmail.com"
        },
        "documentos": {
            "CPF": "45678901234",
            "RG": "456789012",
            "CRM": "SP123789"
        },
        "em_atividade": true
    },
    {
        "nome": "Dr. Gabriel Ferreira",
        "data_nascimento": ISODate("1989-11-07"),
        "endereco": {
            "logradouro": "Rua Pamplona",
            "numero": "500",
            "bairro": "Jardim Paulista",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01405000"
        },
        "especialidades": [
            "Neurologia",
            "Psiquiatria"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-945678901",
            "email": "gabriel.ferreira@gmail.com"
        },
        "documentos": {
            "CPF": "56789012345",
            "RG": "567890123",
            "CRM": "SP456123"
        },
        "em_atividade": false
    },
    {
        "nome": "Dr. Gabriel Alves",
        "data_nascimento": ISODate("1989-11-07"),
        "endereco": {
            "logradouro": "Rua Pamplona",
            "numero": "550",
            "bairro": "Jardim Paulista",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01405000"
        },
        "especialidades": [
            "Neurologia",
            "gastroenterologia"
        ],
        "tipo": "Especialista",
        "contato": {
            "telefone": "55-11-945678901",
            "email": "gabriel.ferreira@gmail.com"
        },
        "documentos": {
            "CPF": "56789012345",
            "RG": "567890123",
            "CRM": "SP456123"
        },
        "em_atividade": false
    }
])

```

# Inclua ao menos 15 pacientes

```js 
 db.pacientes.insertMany([
    {
        "nome": "Paulo Santos",
        "nome_social": "Joana Santos",
        "data_nascimento": ISODate("1995-02-14"),
        "altura": 1.86,
        "peso": 76,
        "sexo": "masculino",
        "genero": "feminino",
        "etnia": "branca",
        "endereco": {
            "logradouro": "Rua A",
            "numero": "10",
            "bairro": "Centro",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "12345678"
        },
        "contato": {
            "telefone": "55-11-92654843",
            "email": "paulo@gmail.com"
        },
        "convenio": {
            "nome": "Saúde",
            "validade": ISODate("2021-12-31"),
            "CNPJ": "23456789000102",
            "carencia": 60
        },
        "documentos": {
            "CPF": "98765432100",
            "RG": "569574259"
        }
    }, 
    {
        "nome": "Renata Oliveira",
        "data_nascimento": ISODate("1992-11-03"),
        "altura": 1.68,
        "peso": 60,
        "sexo": "feminino",
        "genero": "feminino",
        "etnia": "branca",
        "endereco": {
            "logradouro": "Rua dos Pinheiros",
            "numero": "450",
            "bairro": "Pinheiros",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "05422010"
        },
        "contato": {
            "telefone": "55-11-921234567",
            "email": "renata@gmail.com"
        },
        "convenio": {
            "nome": "Saúde",
            "validade": ISODate("2026-01-20"),
            "CNPJ": "23456789000102",
            "carencia": 30
        },
        "documentos": {
            "CPF": "23456789012",
            "RG": "678901234"
        }
    }, {
        "nome": "Carlos Almeida",
        "data_nascimento": ISODate("1975-06-12"),
        "altura": 1.80,
        "peso": 85,
        "sexo": "masculino",
        "genero": "masculino",
        "etnia": "negro",
        "endereco": {
            "logradouro": "Rua Vergueiro",
            "numero": "850",
            "bairro": "Vila Mariana",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "04101000"
        },
        "contato": {
            "telefone": "55-11-923456789",
            "email": "carlos@gmail.com"
        },
        "convenio": {
            "nome": "Saúde",
            "validade": ISODate("2025-08-10"),
            "CNPJ": "23456789000102",
            "carencia": 60
        },
        "documentos": {
            "CPF": "34567890123",
            "RG": "567890123"
        }
    },
    {
        "nome": "Fernanda Souza",
        "data_nascimento": ISODate("1985-10-24"),
        "altura": 1.65,
        "peso": 68,
        "sexo": "feminino",
        "genero": "feminino",
        "etnia": "branca",
        "endereco": {
            "logradouro": "Avenida Rebouças",
            "numero": "2200",
            "bairro": "Jardim Paulista",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "05402000"
        },
        "contato": {
            "telefone": "55-11-934567890",
            "email": "fernanda@gmail.com"
        },
        "convenio": {
            "nome": "Amil",
            "validade": ISODate("2026-03-14"),
            "CNPJ": "98765432100123",
            "carencia": 30
        },
        "documentos": {
            "CPF": "45678901234",
            "RG": "678901234"
        }
    },
    {
        "nome": "Marcos Silva",
        "data_nascimento": ISODate("1991-04-18"),
        "altura": 1.90,
        "peso": 92,
        "sexo": "masculino",
        "genero": "masculino",
        "etnia": "pardo",
        "endereco": {
            "logradouro": "Rua da Consolação",
            "numero": "550",
            "bairro": "Consolação",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01302000"
        },
        "contato": {
            "telefone": "55-11-945678901",
            "email": "marcos@gmail.com"
        },
        "convenio": {
            "nome": "Unimed",
            "validade": ISODate("2024-11-30"),
            "CNPJ": "11223344556677",
            "carencia": 90
        },
        "documentos": {
            "CPF": "56789012345",
            "RG": "789012345"
        }
    },
    {
        "nome": "Aline Pereira",
        "data_nascimento": ISODate("1989-09-07"),
        "altura": 1.70,
        "peso": 58,
        "sexo": "feminino",
        "genero": "feminino",
        "etnia": "parda",
        "endereco": {
            "logradouro": "Rua dos Franceses",
            "numero": "300",
            "bairro": "Bela Vista",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01329000"
        },
        "contato": {
            "telefone": "55-11-956789012",
            "email": "aline1@gmail.com"
        },
        "convenio": {
            "nome": "Amil",
            "validade": ISODate("2025-05-22"),
            "CNPJ": "98765432100123",
            "carencia": 30
        },
        "documentos": {
            "CPF": "67890123456",
            "RG": "890123456"
        }
    },
    {
        "nome": "Thiago Lopes",
        "nome_social": "Sofia Lopes",
        "data_nascimento": ISODate("1996-02-12"),
        "altura": 1.78,
        "peso": 75,
        "sexo": "masculino",
        "genero": "feminino",
        "etnia": "branca",
        "endereco": {
            "logradouro": "Rua dos Timbiras",
            "numero": "800",
            "bairro": "Santa Ifigênia",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01208010"
        },
        "contato": {
            "telefone": "55-11-967890123",
            "email": "thiago@gmail.com"
        },
        "convenio": {
            "nome": "Saúde",
            "validade": ISODate("2027-07-18"),
            "CNPJ": "23456789000102",
            "carencia": 60
        },
        "documentos": {
            "CPF": "78901234567",
            "RG": "901234567"
        }
    },
    {
        "nome": "João Batista",
        "data_nascimento": ISODate("1980-07-15"),
        "altura": 1.85,
        "peso": 88,
        "sexo": "masculino",
        "genero": "masculino",
        "etnia": "negro",
        "endereco": {
            "logradouro": "Rua Augusta",
            "numero": "3000",
            "bairro": "Cerqueira César",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01413000"
        },
        "contato": {
            "telefone": "55-11-921234567",
            "email": "joao@gmail.com"
        },
        "convenio": {
            "nome": "Unimed",
            "validade": ISODate("2025-02-15"),
            "CNPJ": "11223344556677",
            "carencia": 60
        },
        "documentos": {
            "CPF": "12345678909",
            "RG": "678901234"
        }
    },
    {
        "nome": "Patrícia Mendes",
        "data_nascimento": ISODate("1990-10-05"),
        "altura": 1.68,
        "peso": 63,
        "sexo": "feminino",
        "genero": "feminino",
        "etnia": "branca",
        "endereco": {
            "logradouro": "Rua Oscar Freire",
            "numero": "500",
            "bairro": "Jardins",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01426000"
        },
        "contato": {
            "telefone": "55-11-932345678",
            "email": "patricia@gmail.com"
        },
        "convenio": {
            "nome": "Amil",
            "validade": ISODate("2024-11-05"),
            "CNPJ": "98765432100123",
            "carencia": 30
        },
        "documentos": {
            "CPF": "23456789001",
            "RG": "789012345"
        }
    },
    {
        "nome": "Lucas Costa",
        "data_nascimento": ISODate("1987-01-21"),
        "altura": 1.78,
        "peso": 72,
        "sexo": "masculino",
        "genero": "masculino",
        "etnia": "pardo",
        "endereco": {
            "logradouro": "Avenida Ipiranga",
            "numero": "400",
            "bairro": "Centro",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01046000"
        },
        "contato": {
            "telefone": "55-11-943567890",
            "email": "lucas@gmail.com"
        },
        "convenio": {
            "nome": "Bradesco Saúde",
            "validade": ISODate("2025-07-15"),
            "CNPJ": "55667788990011",
            "carencia": 90
        },
        "documentos": {
            "CPF": "34567890123",
            "RG": "890123456"
        }
    },
    {
        "nome": "Juliana Pereira",
        "data_nascimento": ISODate("1995-12-12"),
        "altura": 1.60,
        "peso": 55,
        "sexo": "feminino",
        "genero": "feminino",
        "etnia": "parda",
        "endereco": {
            "logradouro": "Rua dos Estudantes",
            "numero": "650",
            "bairro": "Liberdade",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01505000"
        },
        "contato": {
            "telefone": "55-11-954567890",
            "email": "juliana1@gmail.com"
        },
        "convenio": {
            "nome": "Unimed",
            "validade": ISODate("2026-03-20"),
            "CNPJ": "11223344556677",
            "carencia": 60
        },
        "documentos": {
            "CPF": "45678901234",
            "RG": "901234567"
        }
    },
    {
        "nome": "André Ferreira",
        "nome_social": "Andréa Ferreira",
        "data_nascimento": ISODate("1998-03-18"),
        "altura": 1.76,
        "peso": 70,
        "sexo": "masculino",
        "genero": "feminino",
        "etnia": "branca",
        "endereco": {
            "logradouro": "Rua do Arouche",
            "numero": "900",
            "bairro": "República",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01220000"
        },
        "contato": {
            "telefone": "55-11-965678901",
            "email": "andre@gmail.com"
        },
        "convenio": {
            "nome": "Saúde",
            "validade": ISODate("2027-05-15"),
            "CNPJ": "23456789000102",
            "carencia": 60
        },
        "documentos": {
            "CPF": "56789012345",
            "RG": "012345678"
        }
    },
    {
        "nome": "Marcelo Nogueira",
        "data_nascimento": ISODate("1983-02-11"),
        "altura": 1.82,
        "peso": 78,
        "sexo": "masculino",
        "genero": "masculino",
        "etnia": "branco",
        "endereco": {
            "logradouro": "Rua Cardoso de Almeida",
            "numero": "345",
            "bairro": "Perdizes",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "05013000"
        },
        "contato": {
            "telefone": "55-11-912345678",
            "email": "marcelo1@gmail.com"
        },
        "convenio": {
            "nome": "Amil",
            "validade": ISODate("2025-09-10"),
            "CNPJ": "98765432100123",
            "carencia": 30
        },
        "documentos": {
            "CPF": "67890123456",
            "RG": "012345678"
        }
    },
    {
        "nome": "Carla Vieira",
        "data_nascimento": ISODate("1990-11-19"),
        "altura": 1.65,
        "peso": 62,
        "sexo": "feminino",
        "genero": "feminino",
        "etnia": "parda",
        "endereco": {
            "logradouro": "Rua Clélia",
            "numero": "450",
            "bairro": "Lapa",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "05042000"
        },
        "contato": {
            "telefone": "55-11-934567890",
            "email": "carla@gmail.com"
        },
        "convenio": {
            "nome": "Unimed",
            "validade": ISODate("2026-04-05"),
            "CNPJ": "11223344556677",
            "carencia": 60
        },
        "documentos": {
            "CPF": "78901234567",
            "RG": "123456789"
        }
    },
    {
        "nome": "Ricardo Alves",
        "data_nascimento": ISODate("1985-06-23"),
        "altura": 1.77,
        "peso": 80,
        "sexo": "masculino",
        "genero": "masculino",
        "etnia": "branco",
        "endereco": {
            "logradouro": "Avenida Brasil",
            "numero": "800",
            "bairro": "Jardim América",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01431000"
        },
        "contato": {
            "telefone": "55-11-945678901",
            "email": "ricardo1@gmail.com"
        },
        "convenio": {
            "nome": "Bradesco Saúde",
            "validade": ISODate("2024-12-31"),
            "CNPJ": "55667788990011",
            "carencia": 90
        },
        "documentos": {
            "CPF": "89012345678",
            "RG": "234567890"
        }
    },
    {
        "nome": "Renato Lima",
        "nome_social": "Renata Lima",
        "data_nascimento": ISODate("1993-03-17"),
        "altura": 1.74,
        "peso": 73,
        "sexo": "masculino",
        "genero": "feminino",
        "etnia": "branca",
        "endereco": {
            "logradouro": "Rua Dr. Rafael de Barros",
            "numero": "250",
            "bairro": "Paraíso",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "04003040"
        },
        "contato": {
            "telefone": "55-11-956789012",
            "email": "renato@gmail.com"
        },
        "convenio": {
            "nome": "Saúde",
            "validade": ISODate("2026-10-10"),
            "CNPJ": "23456789000102",
            "carencia": 60
        },
        "documentos": {
            "CPF": "90123456789",
            "RG": "345678901"
        }
    },
    {
        "nome": "Luciana Carvalho",
        "data_nascimento": ISODate("1994-12-05"),
        "altura": 1.62,
        "peso": 58,
        "sexo": "feminino",
        "genero": "feminino",
        "etnia": "negra",
        "endereco": {
            "logradouro": "Rua Coronel Xavier de Toledo",
            "numero": "520",
            "bairro": "Centro",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "01048010"
        },
        "contato": {
            "telefone": "55-11-967890123",
            "email": "luciana1@gmail.com"
        },
        "convenio": {
            "nome": "Amil",
            "validade": ISODate("2025-07-01"),
            "CNPJ": "98765432100123",
            "carencia": 30
        },
        "documentos": {
            "CPF": "01234567890",
            "RG": "456789012"
        }
    },
    {
        "nome": "Lucas Ferreira",
        "data_nascimento": ISODate("2010-03-15"),
        "altura": 1.45,
        "peso": 35,
        "sexo": "masculino",
        "genero": "masculino",
        "etnia": "branco",
        "endereco": {
            "logradouro": "Rua das Flores",
            "numero": "123",
            "bairro": "Jardim Paulista",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "12345678"
        },
        "contato": {
            "telefone": "55-11-934567843",
            "email": "lucas.ferreira@gmail.com"
        },
        "convenio": {
            "nome": "Amil",
            "validade": ISODate("2025-09-15"),
            "CNPJ": "12345678000199",
            "carencia": 60
        },
        "documentos": {
            "CPF": "12345678901",
            "RG": "123456789"
        }
    },
    {
        "nome": "Mariana Souza",
        "data_nascimento": ISODate("2012-06-20"),
        "altura": 1.30,
        "peso": 28,
        "sexo": "feminino",
        "genero": "feminino",
        "etnia": "branca",
        "endereco": {
            "logradouro": "Avenida Central",
            "numero": "456",
            "bairro": "Centro",
            "cidade": "São Paulo",
            "estado": "SP",
            "CEP": "98765432"
        },
        "contato": {
            "telefone": "55-11-923456789",
            "email": "mariana.souza@gmail.com"
        },
        "convenio": {
            "nome": "Bradesco Saúde",
            "validade": ISODate("2026-01-30"),
            "CNPJ": "98765432000188",
            "carencia": 90
        },
        "documentos": {
            "CPF": "98765432100",
            "RG": "987654321"
        }
    }
])
```

# Registre 20 consultas de diferentes pacientes e médicos

```js 
db.consultas.insertMany([
    {
        "data": ISODate("2018-06-25T10:00:00Z"),
        "medico_id": ObjectId("788b3b9b0b1e6b1f1c1f1c1f"),
        "paciente_id": ObjectId("5f8b3b9b0b1e6b1f1c1f1c1f"),
        "valor": 200,
        "conveniada": true,
        "especialidade_buscada": "Pediatria",
        "descricao": "Paciente com febre e tosse",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Paracetamol comprimidos",
                    "quantidade": 10,
                    "instrucoes": "Tomar 1 comprimido a cada 8 horas"
                },
                {
                    "nome": "Ibuprofeno comprimidos",
                    "quantidade": 12,
                    "instrucoes": "Tomar 1 comprimido a cada 12 horas"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Inalação com soro fisiológico",
                    "frequencia": "2 vezes ao dia"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-08-15T09:30:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c50e"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c54b"),
        "valor": 250,
        "conveniada": false,
        "especialidade_buscada": "Cardiologia",
        "descricao": "Paciente relatando dores no peito e cansaço",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Aspirina comprimidos",
                    "quantidade": 20,
                    "instrucoes": "Tomar 1 comprimido a cada 12 horas"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Exercícios leves",
                    "frequencia": "Caminhada de 30 minutos por dia"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-02-10T11:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c50f"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c54d"),
        "valor": 180,
        "conveniada": true,
        "especialidade_buscada": "Dermatologia",
        "descricao": "Paciente com erupções cutâneas e coceira",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Hidrocortisona creme",
                    "quantidade": 1,
                    "instrucoes": "Aplicar 2 vezes ao dia na área afetada"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Banhos de água fria",
                    "frequencia": "Uma vez ao dia"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-11-03T14:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c510"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c554"),
        "valor": 220,
        "conveniada": true,
        "especialidade_buscada": "Ortopedia",
        "descricao": "Paciente com dor no joelho após lesão esportiva",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Diclofenaco comprimidos",
                    "quantidade": 15,
                    "instrucoes": "Tomar 1 comprimido a cada 12 horas"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Fisioterapia",
                    "frequencia": "3 vezes por semana"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-07-22T10:45:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c511"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c552"),
        "valor": 300,
        "conveniada": true,
        "especialidade_buscada": "Neurologia",
        "descricao": "Paciente com dores de cabeça persistentes e tontura",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Amitriptilina comprimidos",
                    "quantidade": 30,
                    "instrucoes": "Tomar 1 comprimido à noite"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Sessões de acupuntura",
                    "frequencia": "1 vez por semana"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-03-05T08:30:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c512"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c553"),
        "valor": 150,
        "conveniada": false,
        "especialidade_buscada": "Pediatria",
        "descricao": "Paciente com dor de garganta e febre alta",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Ibuprofeno xarope",
                    "quantidade": 1,
                    "instrucoes": "10 ml a cada 8 horas"
                },
                {
                    "nome": "Amoxicilina suspensão",
                    "quantidade": 1,
                    "instrucoes": "5 ml a cada 12 horas"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Repouso em casa",
                    "frequencia": "Até a melhora dos sintomas"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-09-12T15:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c513"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c557"),
        "valor": 180,
        "conveniada": true,
        "especialidade_buscada": "Endocrinologia",
        "descricao": "Paciente com sintomas de fadiga e ganho de peso",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Levotiroxina comprimidos",
                    "quantidade": 60,
                    "instrucoes": "Tomar 1 comprimido em jejum diariamente"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Reeducação alimentar",
                    "frequencia": "Acompanhamento mensal com nutricionista"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-06-01T16:15:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c514"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c555"),
        "valor": 230,
        "conveniada": false,
        "especialidade_buscada": "Ginecologia",
        "descricao": "Paciente com cólicas intensas e menstruação irregular",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Anticoncepcional oral",
                    "quantidade": 21,
                    "instrucoes": "Tomar 1 comprimido diariamente"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Exames laboratoriais",
                    "frequencia": "Realizar hemograma completo"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-01-18T10:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c515"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c550"),
        "valor": 200,
        "conveniada": true,
        "especialidade_buscada": "Oftalmologia",
        "descricao": "Paciente com visão embaçada e dores nos olhos",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Colírio lubrificante",
                    "quantidade": 1,
                    "instrucoes": "Aplicar 2 gotas em cada olho a cada 4 horas"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Ajuste de lentes de contato",
                    "frequencia": "Trocar mensalmente"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-12-07T11:45:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c516"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c54e"),
        "valor": 170,
        "conveniada": false,
        "especialidade_buscada": "Otorrinolaringologia",
        "descricao": "Paciente com zumbido nos ouvidos e perda auditiva leve",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Betahistina comprimidos",
                    "quantidade": 30,
                    "instrucoes": "Tomar 1 comprimido a cada 12 horas"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Exame auditivo",
                    "frequencia": "Realizar avaliação auditiva a cada 6 meses"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-05-03T13:30:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c517"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c558"),
        "valor": 210,
        "conveniada": true,
        "especialidade_buscada": "Psiquiatria",
        "descricao": "Paciente com insônia e episódios de ansiedade",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Clonazepam comprimidos",
                    "quantidade": 30,
                    "instrucoes": "Tomar 1 comprimido antes de dormir"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Terapia comportamental",
                    "frequencia": "Sessões semanais"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-11-14T09:30:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c511"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c555"),
        "valor": 250,
        "conveniada": true,
        "especialidade_buscada": "Cardiologia",
        "descricao": "Paciente com dor no peito e cansaço excessivo",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Atorvastatina comprimidos",
                    "quantidade": 30,
                    "instrucoes": "Tomar 1 comprimido diariamente"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Exame de eletrocardiograma",
                    "frequencia": "Realizar 1 vez ao ano"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-02-11T14:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c510"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c54b"),
        "valor": 180,
        "conveniada": false,
        "especialidade_buscada": "Ortopedia",
        "descricao": "Paciente com dor nas costas e dificuldade de movimento",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Diclofenaco comprimidos",
                    "quantidade": 20,
                    "instrucoes": "Tomar 1 comprimido a cada 12 horas"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Fisioterapia",
                    "frequencia": "3 vezes por semana"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-10-05T11:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c519"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c550"),
        "valor": 220,
        "conveniada": true,
        "especialidade_buscada": "Dermatologia",
        "descricao": "Paciente com acne severa e manchas na pele",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Isotretinoína comprimidos",
                    "quantidade": 30,
                    "instrucoes": "Tomar 1 comprimido ao dia"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Creme hidratante",
                    "frequencia": "Aplicar 2 vezes ao dia"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-03-29T16:30:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c51a"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c557"),
        "valor": 190,
        "conveniada": false,
        "especialidade_buscada": "Gastroenterologia",
        "descricao": "Paciente com dor abdominal e refluxo frequente",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Omeprazol comprimidos",
                    "quantidade": 28,
                    "instrucoes": "Tomar 1 comprimido em jejum diariamente"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Dieta controlada",
                    "frequencia": "Acompanhamento com nutricionista"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-12-19T13:15:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c51b"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c551"),
        "valor": 200,
        "conveniada": true,
        "especialidade_buscada": "Oftalmologia",
        "descricao": "Paciente com dificuldade de visão noturna",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Colírio lubrificante",
                    "quantidade": 1,
                    "instrucoes": "Aplicar 2 gotas antes de dormir"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Exame de campo visual",
                    "frequencia": "A cada 6 meses"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-12-05T10:30:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c512"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c556"),
        "valor": 210,
        "conveniada": true,
        "especialidade_buscada": "Neurologia",
        "descricao": "Paciente com dores de cabeça recorrentes",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Amitriptilina comprimidos",
                    "quantidade": 20,
                    "instrucoes": "Tomar 1 comprimido ao deitar"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Ressonância magnética",
                    "frequencia": "Realizar uma vez para avaliação"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-01-20T14:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c513"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c559"),
        "valor": 230,
        "conveniada": false,
        "especialidade_buscada": "Endocrinologia",
        "descricao": "Paciente com fadiga e ganho de peso",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Levotiroxina comprimidos",
                    "quantidade": 30,
                    "instrucoes": "Tomar 1 comprimido em jejum diariamente"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Exame de TSH",
                    "frequencia": "Realizar uma vez por semestre"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-02-02T16:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c514"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c552"),
        "valor": 180,
        "conveniada": true,
        "especialidade_buscada": "Pediatria",
        "descricao": "Paciente com sintomas gripais e febre alta",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Dipirona gotas",
                    "quantidade": 1,
                    "instrucoes": "Administrar 15 gotas a cada 6 horas"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Hidratação e repouso",
                    "frequencia": "Beber água frequentemente e descansar"
                }
            ]
        }
    },
    {
        "data": ISODate("2023-11-15T09:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c515"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c558"),
        "valor": 220,
        "conveniada": false,
        "especialidade_buscada": "Psiquiatria",
        "descricao": "Paciente com ansiedade e insônia",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Clonazepam comprimidos",
                    "quantidade": 30,
                    "instrucoes": "Tomar 1 comprimido ao deitar"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Terapia cognitivo-comportamental",
                    "frequencia": "Sessões semanais"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-03-08T15:30:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c516"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c553"),
        "valor": 240,
        "conveniada": true,
        "especialidade_buscada": "Oftalmologia",
        "descricao": "Paciente com dificuldade para enxergar de perto",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Colírio hidratante",
                    "quantidade": 1,
                    "instrucoes": "Aplicar 1 gota 3 vezes ao dia"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Exame de refração",
                    "frequencia": "Realizar uma vez"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-04-10T11:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c517"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c554"),
        "valor": 190,
        "conveniada": true,
        "especialidade_buscada": "Cardiologia",
        "descricao": "Paciente com dor no peito e falta de ar",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Aspirina comprimidos",
                    "quantidade": 30,
                    "instrucoes": "Tomar 1 comprimido diariamente"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Exame de eletrocardiograma",
                    "frequencia": "Realizar uma vez"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-05-05T13:30:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c518"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c555"),
        "valor": 250,
        "conveniada": false,
        "especialidade_buscada": "Gastroenterologia",
        "descricao": "Paciente com dores abdominais e náuseas",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Omeprazol cápsulas",
                    "quantidade": 28,
                    "instrucoes": "Tomar 1 cápsula pela manhã"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Ultrassom abdominal",
                    "frequencia": "Realizar uma vez"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-06-15T09:15:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c519"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c556"),
        "valor": 205,
        "conveniada": true,
        "especialidade_buscada": "Ortopedia",
        "descricao": "Paciente com fratura no braço",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Dipirona gotas",
                    "quantidade": 20,
                    "instrucoes": "Administrar 15 gotas a cada 8 horas"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Imobilização com gesso",
                    "frequencia": "Realizar uma vez"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-07-20T10:45:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c51a"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c557"),
        "valor": 220,
        "conveniada": false,
        "especialidade_buscada": "Dermatologia",
        "descricao": "Paciente com erupção cutânea",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Cremes tópicos",
                    "quantidade": 1,
                    "instrucoes": "Aplicar na área afetada 2 vezes ao dia"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Consulta de acompanhamento",
                    "frequencia": "Marcar para 15 dias"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-08-30T14:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c51b"),
        "paciente_id": ObjectId("66ee282007cbcc34c9b4c558"),
        "valor": 195,
        "conveniada": true,
        "especialidade_buscada": "Oftalmologia",
        "descricao": "Paciente com visão embaçada",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Colírio lubrificante",
                    "quantidade": 1,
                    "instrucoes": "Aplicar 2 gotas em cada olho 3 vezes ao dia"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Consulta de revisão",
                    "frequencia": "Marcar para 3 meses"
                }
            ]
        }
    },
    {
        "data": ISODate("2024-08-30T14:00:00Z"),
        "medico_id": ObjectId("66ee27e807cbcc34c9b4c51b"),
        "paciente_id": ObjectId("66f45ed26f90520f9d2f41c7"),
        "valor": 195,
        "conveniada": true,
        "especialidade_buscada": "Oftalmologia",
        "descricao": "Paciente com visão embaçada",
        "receita": {
            "medicamentos": [
                {
                    "nome": "Colírio lubrificante",
                    "quantidade": 1,
                    "instrucoes": "Aplicar 2 gotas em cada olho 3 vezes ao dia"
                }
            ],
            "tratamentos": [
                {
                    "nome": "Consulta de revisão",
                    "frequencia": "Marcar para 3 meses"
                }
            ]
        }
    }
]);
```