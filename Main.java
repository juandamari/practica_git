//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    inventario E1 = new inventario("qwe", "gaseosa", 2900, 10);
    E1.mostrarTotal();
    E1.vender(5);
    E1.mostrarTotal();
    E1.abastecer(30);
    E1.mostrarTotal();
}
