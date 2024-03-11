public class Main {

    public interface GuiaVirtual {
        void proporcionarTour();
    }

    public static class GuiaNinos implements GuiaVirtual {
        @Override
        public void proporcionarTour() {
            System.out.println("Bienvenido, pequeño explorador. Te llevaré en un tour especial para niños.");
        }
    }

    public static class GuiaAves implements GuiaVirtual {
        @Override
        public void proporcionarTour() {
            System.out.println("¡Hola amante de las aves! Vamos a explorar el fascinante mundo de nuestras aves.");
        }
    }

    public static class GuiaMamiferos implements GuiaVirtual {
        @Override
        public void proporcionarTour() {
            System.out.println("¡Prepárate para un emocionante viaje entre los mamíferos! ¡Vamos a comenzar!");
        }
    }

    public static class QuioscoInteractivo {
        public void proporcionarInformacion(String categoria) {
            switch (categoria.toLowerCase()) {
                case "animales":
                    System.out.println("¡Bienvenido al Quiosco Interactivo de Animales! Aquí encontrarás información sobre nuestros maravillosos habitantes.");
                    break;
                case "habitats":
                    System.out.println("Explora el Quiosco Interactivo de Habitats para conocer más sobre los entornos de nuestros animales.");
                    break;
                default:
                    System.out.println("Lo siento, no se encuentra disponible la información para la categoría seleccionada.");
            }
        }
    }

    public static void main(String[] args) {
        GuiaVirtual guiaNinos = new GuiaNinos();
        GuiaVirtual guiaAves = new GuiaAves();
        GuiaVirtual guiaMamiferos = new GuiaMamiferos();
        QuioscoInteractivo quioscoInteractivo = new QuioscoInteractivo();

        guiaNinos.proporcionarTour();
        guiaAves.proporcionarTour();
        guiaMamiferos.proporcionarTour();

        quioscoInteractivo.proporcionarInformacion("animales");
        quioscoInteractivo.proporcionarInformacion("habitats");
    }
}