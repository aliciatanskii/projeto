package com.alicia.tanski.calculadoraimc;

/**
 * @author  Alicia Tanski
 * @since 06/12/2016
 * @version 1.0
 * Created by Alicia on 07/12/2016.
 */

public class Calculadora_Imc {

    private double peso;
    private double altura;


    public Calculadora_Imc() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC(){
        return (peso / Math.pow(altura,2));
    }//fecha calcularIMC

    public String verificarIMC(){
        if (calcularIMC()< 20.7){
            return "Abaixo do peso";
        }else if(calcularIMC()>=20.7 && calcularIMC()<=26.4){
            return "Peso normal";
        }else if (calcularIMC()>=26.4 && calcularIMC()<= 27.8){
            return "Marginalmente acima do peso";

        }else if (calcularIMC()>=27.8 && calcularIMC()<=  31.1){
            return "Acima do peso";

        }else{
            return "Obesidade";
        }


    }//fecha verificarImc

    @Override
    public String toString() {
        return "Peso: " +peso
              +"\nAltura: " +altura
              +"\nCalculo do IMC: "+verificarIMC();
    }
}//fecha class
