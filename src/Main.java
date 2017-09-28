public class Main {
    public static void main(String[] args) {
        Afd a =new Afd();
        Tabla t=new Tabla();
        t.insertar();
        String[] entrada = {"1","0","1"};
        a.validar(entrada);
       System.out.println(a.q);
        //a.validar2(t.matriz3);
    }
}
