import java.util.Scanner;

public class Desafio03 {

    public Desafio03() {

    }

    public void Executar() {
        double num1, res, res2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a medida me metros :");
        num1 = sc.nextDouble();

        res = num1 * 100;
        res2 = num1 * 1000;

        System.out.println("A medida em centimetros" + " " + res + " " + "medida em milimetros" + " " + res2);
    }

    public static void main(String[] args) {

        Desafio03 desafio03;
        desafio03 = new Desafio03();
        desafio03.Executar();
    }
}
