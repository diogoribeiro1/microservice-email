# microservice-email
Microservice para envio de email utilizando Spring Email e o servidor SMTP do Gmail.

<h3><li>Tecnologias usadas</li></h3>
    Java 11<br>
    Spring<br>
    Spring Email<br>
    SMTP Gmail<br>
    JPA<br>
    Hibernate<br>
    H2 Database<br>
    
# API Endpoints:

| Endpoint  | Method |
| ------------- | ------------- |
| /sending-email  | POST  |

    Example Request:
    {
        "ownerRef": "",
        "emailFrom": "",
        "emailTo": "",
        "subject": "",
        "text": ""
    }
    
    Example Response:
    }
        "emailId": "",
        "emailRef": "",
        "emailFrom": "",
        "emailTo": "",
        "subject": "",
        "text": "",
        "sendDateEmail": "",
        "statusEmail": ""
    }
    
# Screenshots:
    
![Captura de tela de 2022-02-26 19-10-33](https://user-images.githubusercontent.com/89152312/155860682-d2e1a41a-ed67-4edc-b77d-411682791286.png)
