import java.util.Scanner;

public class Desafio02 {

    public Desafio02() {

    }

    public void Executar() {
        double num1, num2, res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        num1 = sc.nextDouble();
        System.out.println("Informe a segunda nota:");
        num2 = sc.nextDouble();

        res = (num1 + num2) / 2;

        System.out.println("A média da nota" + " " + res);
    }

    public static void main(String[] args) {

        Desafio02 desafio02;
        desafio02 = new Desafio02();
        desafio02.Executar();
    }
}
