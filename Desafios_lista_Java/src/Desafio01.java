import java.util.Scanner;

public class Desafio01 {

    public Desafio01() {

    }

    public void Executar() {
        int num1, res, res2;
        double res3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor:");
        num1 = sc.nextInt();

        res = num1 * 2;
        res2 = num1 * 3;
        res3 = Math.sqrt(num1);
        System.out.println(
                "O dobro do valor:" + res + " " + "O Triplo do valor:" + res2 + " " + "A raiz do valor:" + res3);

    }

    public static void main(String[] args) {

        Desafio01 desafio01;
        desafio01 = new Desafio01();
        desafio01.Executar();
    }
}
