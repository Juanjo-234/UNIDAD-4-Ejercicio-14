public class RevistaPrestamo implements Prestable{
    private String titulo;
    private double Tarifa_Diaria = 0.8;

    public RevistaPrestamo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public double calcularMultaDemora(int diasAtraso) {
        if (diasAtraso <= 0) return 0.0;
        return diasAtraso * Tarifa_Diaria;
    }

}
