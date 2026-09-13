public class Main {
    public static void main(String[] args) {
        ArticuloLibreria articuloLibreria = new ArticuloLibreria("Cuaderno", 8400, 20);
        articuloLibreria.aplicarAumento(15);
        articuloLibreria.mostrar();
        articuloLibreria.vender(15);
        articuloLibreria.mostrar();
    }
}