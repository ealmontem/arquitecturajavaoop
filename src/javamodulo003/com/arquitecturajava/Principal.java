package javamodulo003.com.arquitecturajava;

public class Principal {
    public static void main(String[] args) {
        Deportista deportista = new Deportista();
        deportista.setNombre("Elvis");
        deportista.setDeporte("Beisbol");

        System.out.println(deportista.getNombre());
        System.out.println(deportista.getDeporte());
    }
}
