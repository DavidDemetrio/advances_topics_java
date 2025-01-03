public class ClaseAbstracta {
    public static void main(String[] args) {
        // Nota: No se puede instanciar un objeto de una clase abstracta.
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        // Polimorfismo
        // se manda a llamar el método de la clase hija (Reactangulo)
        figuraGeometrica.dibujar();

        // Segunda intancia de la clase derivada de la clase abstracta
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase abstracta
// algunos de sus métodos serán implementados por sus clases hijas o derivadas
abstract class FiguraGeometrica {
    public abstract void dibujar();
}

// Clases derivadas o clases hijas
class Rectangulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Se dibuja un rectángulo.");
    }
}

class Circulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Se dibuja un círculo.");
    }
}