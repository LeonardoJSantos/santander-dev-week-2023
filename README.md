# santander-dev-week-2023
Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

## Diagrama de Classses

~~~mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }
  class Account {
    - number: String
    - agency: String
    - balance: Float
    - limit: Float
  }
  class Feature {
    - icon: String
    - description: String
  }
  class Card {
    - Number: String
    - Limit: Float
  }
  class News {
    - icon: String
    - description: String
  }

  User "1" -- "1" Account
  User "1" -- "n" Feature
  User "1" -- "1" Card
  User "1" -- "n" News
~~~
