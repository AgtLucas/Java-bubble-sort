package aula02.bubble.sort;

import java.util.Scanner;

/**
 *
 * @author AgtLucas
 */
class Funcionario {
    String name;
    float salario;
}

public class Aula02BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, n, i, troca;
        int x[] = new int[10];
        Funcionario[] funcionario = new Funcionario[5];
        Funcionario aux = new Funcionario();
        
        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Funcionários");
            System.out.println("2 - Salário em ordem crescente");
            System.out.println("3 - Salário em ordem decrescente");
            System.out.println("4 - Listar Funcionários em ordem alfabética");
            op = in.nextInt();
            if(op < 1 || op > 4) {
                System.out.println("Opção inválida");
            } else {
                if (op == 1) {
                    for(i = 0; i < funcionario.length; i++) {
                        funcionario[i] = new Funcionario();
                        System.out.println("Digite o nome do " + (i + 1) +"º funcionario:");
                        funcionario[i].name = in.next();
                        System.out.println("Digite o salário do " + (i + 1) +"º funcionario:");
                        funcionario[i].salario = in.nextFloat();
                    }
                }
                if (op == 2) {
                    
                    n = 1;
                    troca = 1;
                    
                    while(n <= 5 && troca == 1) {
                        troca = 0;
                        for(i = 0; i <= 3; i++) {
                            if(funcionario[i].salario > funcionario[i + i].salario) {
                                troca = 1;
                                aux = funcionario[i];
                                funcionario[i] = funcionario[i + 1];
                                funcionario[i + 1] = aux;
                            }
                        }
                        n = n + 1;
                    }  
                    
                    for(i = 0; i <= 9; i++) {
                        System.out.println(funcionario[i].salario);
                    }
                }
            }
        } while (op != 4);
        
//        System.out.println("Nome");
//        f1.name = in.next();
//        System.out.println("Salario");
//        f1.salario = in.nextFloat();
//        
//        System.out.println(f1.name);
        
//        int op;
//        int x[] = new int[10];
        
        
    }
}
