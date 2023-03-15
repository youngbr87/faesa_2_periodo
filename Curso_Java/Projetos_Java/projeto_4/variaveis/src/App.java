public class App {
    public static void main(String[] args) throws Exception {
       
        //variaveis do tipo inteiro
        //cada tipo de variavel tem seu range especifico
        
        byte numeroPequeno = 125;
        short numeroShort = 32565;
        int numeroInt = 768886763;
        long numeroLong = 3572198327887656787l;

        //variaveis do tipo Ponto fluante

        float peso = 78.7f;
        double pi = 3.14737373773262662626262;

        //variavel do tipo caracter

        char letra = 'c';
        
        // variavel do tipo booleana

        boolean hojetemcurso = true;

        //variavel do tipo string

        String nome = "Vini";

        //saida na tela das variaveis já inicializadas
        //lembrar do padrão camelCase começa com minusculo e na segunda palavra maiusculo
        //o java tem a caracteristica do CASE sensitivo

        //variaveis tipo inteiro

        System.out.println("Variaveis do tipo inteiro inteiro");
        System.out.println(" ");
        System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);
        System.out.println(" ");

        //variaveis tipo flutuante

        System.out.println("Variaveis do tipo inteiro flutuante");
        System.out.println(peso);
        System.out.println(pi);
        System.out.println(" ");

        //variaveis tipo caracter
        
        System.out.println("Variaveis do tipo caracter");
        System.out.println(letra);
        System.out.println(" ");

        //variaveis booleanas

        System.out.println("Variaveis do tipo boolen");
        System.out.println(hojetemcurso);
        System.out.println(" ");

        //variaveis string

        System.out.println("Variaveis do tipo string");
        System.out.println(nome);
        
    }
}
