
public class Main {
    public static void main(String[] args) {
        Collar collarRojo = new Collar("Rojo", "acero inoxidable");
        Perro perro = new Perro("Martin", collarRojo);
        Gato gato = new Gato("Kevin");

        Consultorio consultorio1 = new Consultorio(21, "Cra20Sur N20a64");
        Veterinaria vet = new Veterinaria(consultorio1);


        perro.sonido();
        System.out.println("El collar de " + perro.getNombre() + " es: " + perro.getCollar());
        gato.sonido();
        vet.atender(perro);
        vet.atender(gato);
    }
}