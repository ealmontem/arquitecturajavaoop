package javamodulo003.com.arquitecturajava.ejemplo002;

public class Principal {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.andar();

        Deportista d1 = new Deportista();
        d1.setNombre("pedro");
        d1.andar();
    }
}
