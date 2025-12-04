package daw;

public class Paqueteria {

    // creamos un método que nos permita calcular la tarifa por cada zona.
    public static double calcularTarifaEnvio(double peso, String zona) {
        // ya hemos creaado las variables zona y peso
        // Inicializamos la variable peso.
        peso = 0;
        int precioBase = 0;
        int precioFinal = 0;
        // Si el peso es 0 o negativo lanza una excepción de tipo illegalArgument
        if (peso <= 0) {
            // throw new IllegalArgumentException ("Respuesta Imposible. El peso no puede
            // dar 0 o menor que 0");
            return -1;

        } // Ahora nos piden que en base a la zona que se solicite que el precio base
          // varia.
        switch (zona) {
            case "A":
                precioBase = 10;
                break;
            case "B":
                precioBase = 15;
                break;
            case "C":
                precioBase = 20;
                break;
            default:
                if (peso < 5) {
                    System.out.println("Si el peso es menor a 5, no hay suplemento");
                }
                if (peso > 5 && peso < 10) {
                    precioBase = precioBase + 5;
                    System.out.println(precioBase);
                }
                if (peso >= 10) {
                    precioBase = precioBase + 10;
                    System.out.println(precioBase);
                }
                precioFinal = precioBase;
                return -1;

        }
        return precioFinal;
    } // Creamos el método que nos permita validar el identificador

    public static boolean validarIdentificador(String id) {
        // Si es nulo --> no es válido.
        if (id == null) {
            return false;
        }
        // Debe tener unicamente 4 caracteres --> ponemos que id.length == 4 es decir
        // que el
        // tamaño de id debe ser como max 4
        if (id.length() != 4) {
            return false;
        } // id.length() --> es básicamente la cantidad de caracteres que tiene un String
          // Comproamos que todos sean dígitos
        if (!Chart) {
            
        }   
        
        // Si ha pasado todos las pruebas --> true
        return true;
    }

    // Ahora creamos el último método del proyecto que nos permitirá repartir cargas.
    public static int repartirCargas (int totalPaquetes, int camiones) {
        
    }
}
