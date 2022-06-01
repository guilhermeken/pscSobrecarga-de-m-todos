public class TesteCalculadoraC {
    public static void main(String[] args) {
        CalculadoraCientifica pow = new CalculadoraCientifica();
        CalculadoraCientifica sqrt = new CalculadoraCientifica();
        int i1 = 8;
        byte a = 2;
        byte b = 4;
        String s1 = "6.2";
        String s2 = "4.2";
        double d1 = 2.0;
        pow.potencia(a, b);
        pow.potencia(s1, s2);
        pow.potencia(i1, d1);
        sqrt.raiz(i1);
        sqrt.raiz(d1);
        sqrt.raiz(s1);
    }
}
