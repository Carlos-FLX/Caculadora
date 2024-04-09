package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Escolha a operação (+, -, *, /) : ");
        char operacao = scanner.next().charAt(0);
        
        double resultado = 0;
        
        switch(operacao){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if(numero2 != 0){
                    resultado = numero1 / numero2;
                    break;
                }
                 else {
                    System.out.println("Não é possível dividir por 0");
            }
                return;

            default:
                System.out.println("Operador inválido!");
        }
        
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
    
}
