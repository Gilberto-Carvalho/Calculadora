public class Calculadora {
    public String Nome;
    public double SalarioMensal;
    public double fhd = 7;
    public int diasUteis = 20;
    public double horasUteisMes = diasUteis * fhd;

    public double CalcularValorHora() {
        return ((SalarioMensal) / horasUteisMes);
    }
}
