package test.main.MainModule;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.java.MainModule.Main;

public class MainTest {

    public void testMain() {
        // Aquí puedes agregar las pruebas para tu método main
        // Por ejemplo, puedes probar que el método main no lanza ninguna excepción
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}