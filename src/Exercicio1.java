/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
public class Exercicio1 {
    
    public static void main(String args[]){
        int n1,n2,operacao = 0,resultado = 0;
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Digite o primeiro número");
            n1 = obj.nextInt();
            
            System.out.println("Digite o segundo número");
            n2 = obj.nextInt();
            
            System.out.println("Escolha a operação: ");
            System.out.println("1 para somar, 2 para subtrair, 3 para multiplicação e 4 para divisão");
            operacao = obj.nextInt();
            if(operacao == 1){
               resultado = n1 + n2; 
            }
            if(operacao == 2){
                resultado = n1 - n2;
            }
            if(operacao == 3){
                resultado = n1 * n2;
            }
            if(operacao == 4){
                resultado = n1 / n2;
            }
            
            System.out.println("Resultado é = à "+resultado);
        }
        catch(Exception e){
            System.out.println("Erro genérico: "+e.getMessage());
        }
        finally{
            n1 = 0; n2 = 0;
        }
    }
}
