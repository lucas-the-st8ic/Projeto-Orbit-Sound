package com.orbitsound.main;

import java.util.Scanner;

public class Main {

    public void showMenu() {
        Scanner input = new Scanner(System.in)
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
                    """;
            System.out.println(menu);
            option = input.nextInt();
            input.nextLine();

            switch(option) {
                case 1:
                    cadastrasArtistas();
                break;

                case 2:
                    cadastrasMusicas();
                break;

                case 3:
                    listarMusicas();
                break;

                case 4:
                    buscarMusicasPorArtista();
                break;
            }
        }
    }
}
