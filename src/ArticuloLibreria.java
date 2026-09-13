public class ArticuloLibreria {
    String descripcion;
    double precioUnitario;
    int stock;

    public ArticuloLibreria(String descripcion, double precioUnitario, int stock) {
        this.descripcion = descripcion;

        if(precioUnitario >= 0){
            this.precioUnitario = precioUnitario;
        }else{
            this.precioUnitario = 0;
        }

        if(stock >= 0){
            this.stock = stock;
        }else{
            this.stock = 0;
        }

    }

    public void aplicarAumento(double porcentaje){
        precioUnitario = precioUnitario +(precioUnitario * porcentaje / 100);
    }

    public void vender(int cantidad){
        if(cantidad > 0 && cantidad <= stock){
            stock = stock - cantidad;
        }

    }

    public void mostrar(){
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Stock: " + stock);
    }
}
