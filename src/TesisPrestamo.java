public class TesisPrestamo implements Prestable{
    private String titulo;
    private double Tarifa_Diaria = 3.0;

    public TesisPrestamo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public double calcularMultaDemora(int diasAtraso) {
        if (diasAtraso <= 0) return 0.0;
        double multaBase =  diasAtraso * Tarifa_Diaria;
        if(diasAtraso >= 5){
            multaBase += 10;
        }
        return multaBase;
    }
}
