# ✏️ Ejercicio — Artículo de Librería

---

## 📝 Descripción

El sistema implementa la clase ArticuloLibreria para administrar los productos de un comercio escolar y de oficina, asegurando que ni el precio ni el stock adopten valores negativos, permitiendo aplicar aumentos porcentuales al costo unitario y descontando existencias tras realizar una venta válida.

---

## 🚀 Funcionalidades e Implementación

### 📦 Clase ArticuloLibreria

* **Atributos:**
* **descripcion** (String): Nombre o detalle del artículo de librería.
* **precioUnitario** (double): Valor de venta por unidad.
* **stock** (int): Cantidad de unidades disponibles en inventario.


* **Métodos Implementados:**
* **Constructor ArticuloLibreria:** Inicializa la descripción, el precio unitario y el stock, verificando que los valores numéricos sean mayores o iguales a 0; de lo contrario, los establece en 0 por seguridad.
* **aplicarAumento(double porcentaje):** Incrementa el precio unitario actual según el porcentaje ingresado por parámetro.
* **vender(int cantidad):** Descuenta las unidades vendidas del stock actual siempre que la cantidad solicitada sea mayor a cero y no supere las existencias disponibles.
* **mostrar():** Imprime en consola la descripción, el precio unitario actualizado y el nivel de stock disponible.



---

## 💻 Programa Principal (main)

El flujo principal ejecuta la siguiente simulación comercial:

1. Instancia el artículo "Cuaderno" con un precio inicial de $8.400 y 20 unidades en stock.
2. Aplica un ajuste porcentual de aumento del 15% sobre el precio unitario.
3. Muestra en pantalla los datos del producto con el nuevo precio ($9.660).
4. Registra la venta de 15 unidades.
5. Despliega en pantalla los detalles finales del artículo con el stock restante (5 unidades).
