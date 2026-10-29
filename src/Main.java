//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ControlVencimientos control = new ControlVencimientos();

    List<Prestable> materiales = List.of(
            new LibroPrestamo("El Señor de los Anillos"),
            new RevistaPrestamo("National Geographic"),
            new TesisPrestamo("Inteligencia Artificial")
    );

    System.out.println("=== REPORTE DE MULTAS POR VENCIMIENTO ===");

    for (Prestable material : materiales) {
        control.procesarDevolucion(material, 6); 
    }
}

