package Desafios;

public class Desafio {
    public static void main(String[] args) {

        String ninja1 = "Naruto";
        int ninja1idade = 12;
        String ninja1missao = "resgatar cachorro";
        char ninja1dificiduldade = 'c';
        String ninja1status;


        String ninja2 = "Naruto2";
        int ninja2idade = 10;
        String ninja2missao = "resgatar cachorro2";
        char ninja2dificiduldade = 'a';
        String ninja2status;

        String ninja3 = "Naruto3";
        int ninja3idade = 10;
        String ninja3missao = "resgatar cachorro3";
        char ninja3dificiduldade = 'b';
        String ninja3status;

        if (ninja1idade < 15) {
            if (ninja1dificiduldade == 'c' || ninja1dificiduldade == 'd') {
                ninja1status = "concluida";
            } else {
                ninja1status = "não concluida";
            }
        } else {
                ninja1status = "concluida";
            }


        if (ninja2idade < 15) {
            if (ninja2dificiduldade == 'c' || ninja2dificiduldade == 'd') {
                ninja2status = "concluida";
            } else {
                ninja2status = "nao concluida";
            }
        }else {
            ninja2status = "concluida";
        }

        if (ninja3idade > 15) {
            ninja3status = "concluida";
        } if (ninja3dificiduldade == 'c' || ninja3dificiduldade == 'd' ) {
            ninja3status = "concluida";
        }
        else {
            ninja3status = "não concluida";
        }

        System.out.println(
                "Ninja: " + ninja1 +
                "\nIdade: " + ninja1idade+
                "\nMissao: " + ninja1missao +
                "\nDificuldade: " +ninja1dificiduldade+
                "\nStatus da missao: " +ninja1status+

                "\n\nNinja: " + ninja2 +
                "\nIdade: " + ninja2idade+
                "\nMissao: " + ninja2missao +
                "\nDificuldade: " +ninja2dificiduldade+
                "\nStatus da missao: " +ninja2status+


                "\n\nNinja: " + ninja3 +
                "\nIdade: " + ninja3idade+
                "\nMissao: " + ninja3missao +
                "\nDificuldade: " +ninja3dificiduldade+
                "\nStatus da missao:" + ninja3status




        );

    }


}

