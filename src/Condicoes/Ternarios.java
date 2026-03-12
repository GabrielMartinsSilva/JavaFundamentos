package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        int horasDeEstudo = 10;
        int horasRestantes = 1000-horasDeEstudo;
        String dev = (horasDeEstudo>=1000) ? "Virou um dev" : "Falta "+ horasRestantes+" horas de estudo ";
        System.out.println(dev);
    }
}
