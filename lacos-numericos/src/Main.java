public class Main {
    public static void main(String[] args) {

        // 1 2 3 4 5 6 7 8 9 10
        // para uma variavel que inicia em 1, e vai ate 10, mudando 1-por-1, faça:
        // calculos 1 x 1 A 10 x 10

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++){
                System.out.println(j +"x"+ i + " = " + j * i);
            }
        }
    }
}