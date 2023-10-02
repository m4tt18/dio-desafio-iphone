package Execucao;

import Aparelho.Iphone;

public class Aplicacao {
    
    public static void main(String[] args) {

        Iphone iphone7 = new Iphone();

        //Aparelho Telefônico
        iphone7.ligar("984563248");
        iphone7.atender();
        iphone7.iniciarCorreioVoz();

        //Navegador de Internet
        iphone7.exibirPagina();
        iphone7.adicionarNovaAba();
        iphone7.atualizarPagina();

        //Reprodutor de Música
        iphone7.tocarMusica("Rihanna - Diamonds");
        iphone7.pausarMusica();
        iphone7.selecionarMusica("Guns 'n Roses - Welcome to The Jungle");
        
    }
}
