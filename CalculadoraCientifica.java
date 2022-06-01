public class CalculadoraCientifica {
    public void potencia(byte a, byte b){
        System.out.println(Math.pow(a, b));
    }
    public void potencia (String s1, String s2){
        System.out.println(Math.pow(Double.parseDouble(s1), Double.parseDouble(s2)));
    }
    public void potencia (int i1, double d1){
        System.out.println(Math.pow(i1, d1));
    }
    public void raiz (int i1){
        System.out.println(Math.sqrt((Double)(i1));
    }
    public void raiz (double d1){
        System.out.println(Math.sqrt(d1));
    }
    public void raiz (String s1){
        System.out.println(Math.sqrt(Double.parseDouble(s1)));
    }
}
