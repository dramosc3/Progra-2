public class App {
    public static void main(String[] args) {

        // PERSONAS

        persona3 persona1 = new persona3();

        // Asignar nombre
        persona1.nombre = "Diego";

        // Asignar edad
        persona1.edad = 20;

        // Imprimir nombre
        System.out.println(persona1.nombre);

        // Mostrar nombre y edad
        persona1.mostrarDatos();

        System.out.println();

        persona3 persona2 = new persona3("María");

        persona3 persona3 = new persona3("Carlos", 25);

        persona2.edad = 22;

        persona2.mostrarDatos();
        System.out.println();

        persona3.mostrarDatos();

        System.out.println("\n==========================");

        // AUTOS

        Auto3 auto1 = new Auto3("Toyota");

        auto1.acelerar(60);
        auto1.frenar(20);

        auto1.mostrarAuto();

        System.out.println();

        Auto3 auto2 = new Auto3("Honda");

        auto2.acelerar(90);

        auto2.mostrarAuto();

        System.out.println();

        if (auto1.velocidad > auto2.velocidad) {
            System.out.println("El Toyota es más rápido.");
        } else if (auto2.velocidad > auto1.velocidad) {
            System.out.println("El Honda es más rápido.");
        } else {
            System.out.println("Ambos tienen la misma velocidad.");
        }

        System.out.println("\n==========================");

        // PRODUCTOS

        Producto3 producto1 = new Producto3("Laptop", 5500);

        Producto3 producto2 = new Producto3("Mouse", 150);

        Producto3 producto3 = new Producto3("Teclado", 300);

        producto1.mostrarProducto();
        producto2.mostrarProducto();
        producto3.mostrarProducto();

        System.out.println("\n==========================");

        // CUENTAS

        Cuenta3 cuenta1 = new Cuenta3(1000);

        cuenta1.depositar(500);

        cuenta1.retirar(300);

        cuenta1.mostrarSaldo();

        System.out.println();

        Cuenta3 cuenta2 = new Cuenta3(200);

        cuenta2.retirar(500);

        cuenta2.mostrarSaldo();
    }

}
