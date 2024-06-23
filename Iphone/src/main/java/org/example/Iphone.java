package org.example;

import model.InternetBrowser;
import model.Ipod;
import model.Telephone;

class iPhone implements Telephone, Ipod, InternetBrowser {
    private boolean ligado;
    private int volume;
    private String musicaAtual;
    private String numeroChamadaEmCurso;


    public void ligar() {
        ligado = true;
        System.out.println("iPhone ligado!");
    }


    public void desligar() {
        ligado = false;
        System.out.println("iPhone desligado!");
    }


    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para " + volume + "%");
        } else {
            System.out.println("Volume máximo já atingido!");
        }
    }


    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para " + volume + "%");
        } else {
            System.out.println("Volume mínimo já atingido!");
        }
    }

    @Override
    public void showPage(String url) {
        if (ligado) {
            System.out.println("Abrindo página: " + url);
        } else {
            System.out.println("iPhone precisa estar ligado para acessar a internet!");
        }
    }

    @Override
    public void addNewTab(String url) {
        if (ligado) {
            System.out.println("Abrindo nova aba!");
        } else {
            System.out.println("iPhone precisa estar ligado para abrir novas abas!");
        }
    }

    @Override
    public void updatetab() {
        if (ligado) {
            System.out.println("Atualizando página!");
        } else {
            System.out.println("iPhone precisa estar ligado para atualizar páginas!");
        }
    }

    @Override
    public void playMusic(String musicName) {
        if (ligado) {
            musicaAtual = musicName;
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("iPhone precisa estar ligado para tocar música!");
        }
    }

    @Override
    public void pauseMusic() {
        if (ligado && musicaAtual != null) {
            System.out.println("Música pausada!");
        } else {
            System.out.println("Nenhuma música tocando no momento!");
        }
    }

    @Override
    public void selectMusic(String musicName) {
        if (ligado) {
            musicaAtual = musicName;
            System.out.println("Música selecionada: " + musicaAtual);
        } else {
            System.out.println("iPhone precisa estar ligado para selecionar músicas!");
        }
    }

    @Override
    public void resumeMusic() {
        if (ligado && musicaAtual != null) {
            System.out.println("Música retomada!");
        } else {
            System.out.println("Nenhuma música pausada para ser retomada!");
        }
    }

    @Override
    public void advanceMusic() {
        if (ligado) {
            // Simulação de avançar para a próxima música (implementação específica)
            System.out.println("Avançando para a próxima música...");
        } else {
            System.out.println("iPhone precisa estar ligado para avançar músicas!");
        }
    }

    @Override
    public void backMusic() {
        if (ligado) {
            // Simulação de voltar para a música anterior (implementação específica)
            System.out.println("Voltando para a música anterior...");
        } else {
            System.out.println("iPhone precisa estar ligado para voltar músicas!");
        }
    }

    @Override
    public void makeCall(String number) {
        if (ligado) {
            numeroChamadaEmCurso = number;
            System.out.println("Ligando para: " + number);
        } else {
            System.out.println("iPhone precisa estar ligado para fazer chamadas!");
        }
    }

    @Override
    public void endCall() {
        if (ligado && numeroChamadaEmCurso != null) {
            System.out.println("Chamada encerrada!");
            numeroChamadaEmCurso = null;
        } else {
            System.out.println("Nenhuma chamada em curso para ser encerrada!");
        }
    }

    @Override
    public void answerCall() {
        if (ligado && numeroChamadaEmCurso != null) {
            System.out.println("Atendendo chamada de: " + numeroChamadaEmCurso);
            numeroChamadaEmCurso = null; // Finaliza a chamada simulada
        } else {
            System.out.println("Nenhuma chamada em curso para ser atendida!");
        }
    }

    @Override
    public void startVoiceMail(String number) {
        if (ligado) {
            System.out.println("Ativando correio de voz para o número: " + number);
        } else {
            System.out.println("iPhone precisa estar ligado para ativar o correio de voz!");
        }
    }

    @Override
    public void sendMessage(String number, String message) {
        if (ligado) {
            System.out.println("Enviando mensagem para " + number + ": " + message);
        } else {
            System.out.println("iPhone precisa estar ligado para enviar mensagens!");
        }
    }
}
