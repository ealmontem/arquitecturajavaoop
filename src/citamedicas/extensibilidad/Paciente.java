package citamedicas.extensibilidad;

public class Paciente extends Persona{
    private String numeroSeguro;

    public String getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(String numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }
}
