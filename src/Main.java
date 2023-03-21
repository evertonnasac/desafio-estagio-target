import java.util.Scanner;

public class Main {

    //Método do desafio número 2 de Fibonnaci
    static boolean fibo(int n) {

        boolean member = false;
        int target = n;
        int prev = 0, current = 1, next;

        if(n == prev || n == current){
            return true;
        }

        for (int i = 3; current <= target; i++ ){
            next = prev + current;
            prev = current;
            current = next;

            if(current == target){
               member = true;
            }
        }
        return  member;
    }

    static String messageFibo(boolean n){
        return n ? "Faz parte da sequência de Fibonacci" :  "Não Faz parte da sequência de Fibonacci";
    }



    //Método do desafio número 5 Reverter Strings
    static void reverseString(String s){
        int length = s.length();
        char[] reverse = new char[length];

        for (int i = 0; i < length; i++){
            reverse[length - i -1] = s.charAt(i);
        }

        String newstring = String.copyValueOf(reverse);
        System.out.println(newstring);
    }


    public static void main(String[] args) {

        ///////Desafio número 2
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Digite um numero para verificar se ele faz parte da sequência de Fibonacci");
        System.out.println(" OU digite um número negativo para ir para o proximo desafio");
        number = scanner.nextInt();

        if (number >= 0){
            System.out.println(messageFibo(fibo(number)));
        }


        /////////Desafio numero 5
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite uma string para ser invertida");
        String s = scanner2.nextLine();
        System.out.println(s);
        reverseString(s);

    }

}