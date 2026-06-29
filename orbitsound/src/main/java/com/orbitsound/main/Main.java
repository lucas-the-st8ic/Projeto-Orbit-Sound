package com.orbitsound.main;

import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);

    public void showMenu() {

        var option = -1;

        while(option != 0) {
            var menu = """
                    *** Orbit Sound Musics ***
                    
                    1 - Cadastrar artistas
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Buscar músicas por artistas
                    5 - Pesquisar dados sobre um artista
                    ======================================
                    0 - Sair
                    --------------------------------------
                    "Digite sua opção:      """;
            System.out.print(menu+ " ");
            option = input.nextInt();

            switch(option) {
                case 1:
                    cadastrarArtistas();
                break;

                case 2:
                    cadastrarMusicas();
                break;

                case 3:
                    listarMusicas();
                break;

                case 4:
                    buscarMusicasPorArtista();
                break;

                case 5:
                    pesquisarSobreUmArtista();
                break;

                case 0:

                break;
            }
        }
    }

    private void cadastrarArtistas() {
    }

    private void cadastrarMusicas() {
    }

    private void listarMusicas() {
        
    }

    private void buscarMusicasPorArtista() {
    }

    private void pesquisarSobreUmArtista() {
    }
}
