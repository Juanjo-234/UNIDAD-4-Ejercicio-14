public class ControlVencimientos {
    public void procesarDevolucion(Prestable material, int diasAtraso) {
        System.out.println("==================================================");
        System.out.println("          PROCESANDO DEVOLUCIÓN DE MATERIAL       ");
        System.out.println("==================================================");
        System.out.println("• Material / Título : " + material.getTitulo());
        System.out.println("• Tipo de Recurso   : " + material.getClass().getSimpleName());
        System.out.println("• Días de Atraso    : " + diasAtraso);

        double multaCalculada = material.calcularMultaDemora(diasAtraso);

        System.out.printf("• Multa a Pagar     : $%.2f%n", multaCalculada);
        System.out.println("--------------------------------------------------\n");
    }
}
