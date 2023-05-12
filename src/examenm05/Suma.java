package examenm05;

public class Suma {
   //Sumar que retorna la suma de dos nombres enters
    public int sumaEnters(int Nombre1, int Nombre2) {
        return Nombre1 + Nombre2;
    }
  
    // ens retorna el valor del primer número a sumar
    public int getNombre1(int Nombre1, int Nombre2) {
        return Nombre1;
    }
  
    // ens retorna la suma del valor absolut de dos nombres
    public double sumaValorAbsolut(double Nombre1, double Nombre2) {
        Nombre1 = Math.abs(Nombre1);
        Nombre2 = Math.abs(Nombre2);
        return Nombre1 + Nombre2;
    }
}