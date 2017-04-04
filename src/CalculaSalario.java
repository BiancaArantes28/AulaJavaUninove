/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
public class CalculaSalario {
    
    public static void main(String args[]){
        
        Scanner obj = new Scanner(System.in);
        Funcionario joao = new Funcionario();
        
        int horasTrabalhadas;
        float valorHora;
        try{
           System.out.println("Digite as horas trabalhadas: ");
        
            horasTrabalhadas = obj.nextInt();
            joao.setHorasTrabalhadas(horasTrabalhadas);

            System.out.println("Digite o valor por hora: ");
            valorHora = obj.nextFloat();

            joao.setValorHora(valorHora);

            System.out.println("Valor Salário Bruto: "+joao.calculaSalarioBruto());

            System.out.println("Valor INSS: "+joao.calculaInss());

            System.out.println("Valor IR: "+joao.calculaIr());

            System.out.println("Valor salário Liquído: "+joao.calculaSalarioLiquido()); 
        }
        catch(Exception e){
            System.out.println("Erro genérico: "+e.getMessage());
        }
        finally{
            horasTrabalhadas = 0; valorHora = 0;
        }
       
    }
}
