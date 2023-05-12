package examenm05;

public class Suma {
    
    // ens retorna la suma del valor absolut de dos nombres
    
    public double sumaValorAbsolut(double Nombre1, double Nombre2) {
        Nombre1 = Math.abs(Nombre1);
        Nombre2 = Math.abs(Nombre2);
        return Nombre1 + Nombre2;
    }
}
