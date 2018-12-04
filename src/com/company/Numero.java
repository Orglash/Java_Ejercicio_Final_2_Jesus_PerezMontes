package com.company;

public class Numero implements Interface {
    int size;
    int valor;
    String numero;

    public Numero(String numero) {
        this.size = numero.length();
        this.valor = Integer.parseInt(numero);
        this.numero = numero;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean esCapicua ()
    {
        boolean result = false;

        if (this.size == 2){
            if (this.numero.charAt(0)==this.numero.charAt(1)){
                result = true;
            }
        }

        if (this.size == 3){
            if (this.numero.charAt(0)==this.numero.charAt(2)){
                result = true;
            }
        }

        return result;
    }

    public boolean esPar (){
        if (this.valor%2==0){
            return true;
        } else {
            return false;
        }
    }

    public boolean esDivisiblePorTres(){
        if (this.valor%3==0){
            return true;
        } else {
            return false;
        }
    }
}
