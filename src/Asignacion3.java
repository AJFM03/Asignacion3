import java.util.Scanner;

public class Asignacion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registro de Visitante a Edificio");

        // String para nombre
        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();

        // byte para edad
        System.out.print("Ingrese la edad del visitante: ");
        byte edad = scanner.nextByte();

        // short para piso a visitar
        System.out.print("Ingrese el piso a visitar (ejemplo: 3): ");
        short piso = scanner.nextShort();

        // int para el número de apartamento
        System.out.print("Ingrese el número del apartamento: ");
        int numeroApartamento = scanner.nextInt();

        // long para la cedula
        System.out.print("Ingrese el número de identificación del visitante: ");
        long Cedula = scanner.nextLong();

        // boolean para indicar si el visitante es recurrente
        System.out.print("¿Es un visitante recurrente? (true/false): ");
        boolean esRecurrente = scanner.nextBoolean();

        // char para inicial del apellido
        System.out.print("Ingrese la inicial del apellido del visitante: ");
        char inicialApellido = scanner.next().charAt(0);

        // Cerrar el objeto Scanner
        scanner.close();

        // Mostrar la información del visitante
        System.out.println("\n--- Información del Visitante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Piso a visitar: " + piso);
        System.out.println("Número de apartamento: " + numeroApartamento);
        System.out.println("Número de identificación: " + Cedula);
        System.out.println("Visitante recurrente: " + esRecurrente);
        System.out.println("Inicial del apellido: " + inicialApellido);
    }
}
