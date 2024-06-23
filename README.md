# iPhone Simulator

Este projeto é uma simulação básica de um iPhone, implementando várias interfaces que representam funcionalidades típicas de um dispositivo eletrônico, como reprodução de música, navegação na internet, e funcionalidades de telefone. As interfaces são usadas para definir contratos que a classe `iPhone` deve seguir, promovendo a modularidade e a reutilização de código.

## Funcionalidades

A classe `IPhone` implementa as seguintes interfaces:

- `Ipod`
- `Telephone`
- `InternetBrowser`

### Ipod

Métodos:
- `playMusic(String musicName)`: Toca a música especificada.
- `pauseMusic()`: Pausa a música atual.
- `selectMusic(String musicName)`: Seleciona a música especificada.
- `resumeMusic()`: Retoma a reprodução da música pausada.
- `advanceMusic()`: Avança para a próxima música (simulação).
- `backMusic()`: Volta para a música anterior (simulação).

### Telephone

Métodos:
- `makeCall(String number)`: Faz uma chamada para o número especificado.
- `endCall()`: Encerra a chamada em curso.
- `answerCall()`: Atende a chamada em curso.
- `startVoiceMail(String number)`: Ativa o correio de voz para o número especificado.
- `sendMessage(String number, String message)`: Envia uma mensagem para o número especificado.

### InternetBrowser

Métodos:
- `showPage(String url)`: Abre a página especificada.
- `addNewTab()`: Abre uma nova aba.
- `updatePage()`: Atualiza a página atual.

## Exemplo de Uso

Aqui está um exemplo de como usar a classe `IPhone`:

```java
public class TesteIPhone {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        meuIPhone.ligar();
        meuIPhone.aumentarVolume();
        meuIPhone.playMusic("Minha Música Favorita");
        meuIPhone.showPage("https://www.example.com");
        meuIPhone.makeCall("123-456-7890");
        meuIPhone.sendMessage("123-456-7890", "Olá, esta é uma mensagem de teste.");
        meuIPhone.endCall();
        meuIPhone.desligar();
    }
}
```

### Diagrama de Classe da aplicação

![Diagrama do Iphone](Iphone/src/main/resources/Iphone.jpg)
