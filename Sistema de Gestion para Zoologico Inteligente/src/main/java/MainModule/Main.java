public class Main {

    public interface GuiaVirtual {
        void proporcionarTour();
    }

    public static class Trabajador implements GuiaVirtual {
        @Override
        public void proporcionarTour() {
            System.out.println("Proporcionando un tour como trabajador.");
        }
    }

    public static class Visitante implements GuiaVirtual {
        @Override
        public void proporcionarTour() {
            System.out.println("Tomando un tour como visitante.");
        }
    }

    public static class QuioscoInteractivo {
        public void proporcionarInformacion(String tipo) {
            System.out.println("Proporcionando información sobre " + tipo + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema. ¿Eres un trabajador o un visitante?");
        String userType = scanner.nextLine();

        GuiaVirtual user;
        QuioscoInteractivo quiosco = new QuioscoInteractivo();

        if (userType.equalsIgnoreCase("trabajador")) {
            user = new Trabajador();
            user.proporcionarTour();
        } else if (userType.equalsIgnoreCase("visitante")) {
            user = new Visitante();
            user.proporcionarTour();
            System.out.println("¿Deseas visitar el Quiosco Interactivo? (sí/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("sí")) {
                quiosco.proporcionarInformacion("animales");
            }
        } else {
            System.out.println("Tipo de usuario no reconocido. Por favor, ingresa 'trabajador' o 'visitante'.");
        }

        scanner.close();
    }
}