public class TesteImpressora {
    public static void main(String[] args) {
        Impressora imprimir = new Impressora();
        float f1 = 1.8f;
        float f2 = 2.1f;
        String s1 = "Texto 1";
        String s2 = "Texto 2";
        String s3 = "Texto 3";
        int a = 10;
        int b = 20;
        imprimir.exibir(f1);
        imprimir.exibir(f1, f2);
        imprimir.exibir(f1, s1);
        imprimir.exibir(s1,f1);
        imprimir.exibir(s1, s2, s3);
        imprimir.exibir(a, b, s1);
    }
}
