/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacaodenota1117beecrowd;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class ValidacaoDeNota1117Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double nota1 = -1, nota2 = -1;
        
        while (nota1 == -1 || nota2 == -1) {
            double nota = teclado.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
                if (nota1 == -1) {
                    nota1 = nota;
                } else {
                    nota2 = nota;
                }
            } else {
                System.out.println("nota invalida");
            }
        }
        
        double media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f\n", media);
    }
    
}
