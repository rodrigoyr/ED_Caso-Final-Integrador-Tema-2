package modules.VisitantesModule;

public interface GuiaVirtual {
    void proporcionarTour();
}

class GuiaNinos implements GuiaVirtual {
    @Override
    public void proporcionarTour() {
        System.out.println("Bienvenido, pequeño explorador. Te llevaré en un tour especial para niños.");
        // Lógica específica para el tour de niños...
    }
}

class GuiaAves implements GuiaVirtual {
    @Override
    public void proporcionarTour() {
        System.out.println("¡Hola amante de las aves! Vamos a explorar el fascinante mundo de nuestras aves.");
        // Lógica específica para el tour de amantes de aves...
    }
}

class GuiaMamiferos implements GuiaVirtual {
    @Override
    public void proporcionarTour() {
        System.out.println("¡Prepárate para un emocionante viaje entre los mamíferos! ¡Vamos a comenzar!");
        // Lógica específica para el tour de amantes de mamíferos...
    }
}

class QuioscoInteractivo {
    public void proporcionarInformacion(String categoria) {
        switch (categoria.toLowerCase()) {
            case "animales":
                System.out.println("¡Bienvenido al Quiosco Interactivo de Animales! Aquí encontrarás información sobre nuestros maravillosos habitantes.");
                // Lógica específica para la información de animales...
                break;
            case "habitats":
                System.out.println("Explora el Quiosco Interactivo de Habitats para conocer más sobre los entornos de nuestros animales.");
                // Lógica específica para la información de hábitats...
                break;
            default:
                System.out.println("Lo siento, no se encuentra disponible la información para la categoría seleccionada.");
        }
    }
}