package Aparelho;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    //Aparelho Telefônico
    public void ligar(String celular) {
        System.out.println("Ligando para " + celular);
    }

    public void atender() {
        System.out.println("Ligação atendida!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo as mensagens gravadas...");
    }

    // Navegador de Internet
    public void exibirPagina() {
        System.out.println("Página exibida.");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada com sucesso!");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    // Reprodutor Musical
    public void tocarMusica(String musica) {
        System.out.println("Tocando a música " + musica);
    }
    public void pausarMusica(){
        System.out.println("Música em pausa.");
    }
    public void selecionarMusica (String musica) {
        System.out.println("A música " + musica + " foi selecionada.");
    }


}