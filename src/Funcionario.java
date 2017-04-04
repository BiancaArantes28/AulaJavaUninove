/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author internet
 */
public class Funcionario {
    
    private float salarioBruto;
    private float salarioLiquido;
    private int horasTrabalhadas;
    private float valorHora;
    private double inss;
    private double ir;

    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public float getSalarioLiquido() {
        return this.salarioLiquido;
    }

    public void setSalarioLiquido(float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public double getInss() {
        return this.inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    public double getIr() {
        return this.ir;
    }

    public void setIr(float ir) {
        this.ir = ir;
    }
    
    public float calculaSalarioBruto(){
        this.salarioBruto = this.horasTrabalhadas * this.valorHora;
        return this.salarioBruto;
    }
    
    public double calculaInss(){
        if(this.salarioBruto <= 1000){
            this.inss = 0.08;
        }
        if(this.salarioBruto > 1000){
            this.inss = 0.09;
        }
        return this.inss;
    }
    
    public double calculaIr(){
        if(this.salarioBruto <= 500){
            this.ir = 0;
        }
        if(this.salarioBruto > 500 && this.salarioBruto <= 1000){
            this.ir = 0.06;
        }
        if(this.salarioBruto > 1000){
            this.ir = 0.07;
        }
        return this.ir;
    }
    
    public float calculaSalarioLiquido(){
        this.salarioLiquido = (float) (this.salarioBruto - (this.inss * this.salarioBruto)  - (this.ir * this.salarioBruto));
        return this.salarioLiquido;
    }
    
}
