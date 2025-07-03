package citamedicas.extensibilidad;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.setNombre("Elvis");
        paciente1.setCedula("3344");
        paciente1.setNumeroSeguro("33222");

        //

        System.out.println("Nombre:" + paciente1.getNombre());
        System.out.println("Cedula:" + paciente1.getCedula());
        System.out.println("Numero Seguro:" + paciente1.getNumeroSeguro());

        Doctor doctor = new Doctor();
        doctor.setNombre("Ramon");
        doctor.setCedula("3322221");
        doctor.setEspecialidad("Cardiologo");

        System.out.println("Nombre:" + doctor.getNombre());
        System.out.println("Cedula:" + doctor.getCedula());
        System.out.println("NEspecialidad:" + doctor.getEspecialidad());
    }
}
