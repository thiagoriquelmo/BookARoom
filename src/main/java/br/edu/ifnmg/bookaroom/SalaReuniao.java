/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.bookaroom;

/**
 *
 * @author Thiago Riquelmo
 */
public class SalaReuniao {
    private Integer numero;
    private Integer qtdLugares;
    private Predio predio;

    public SalaReuniao() {
    }

    public SalaReuniao(Integer numero, Integer qtdLugares, Predio predio) {
        this.numero = numero;
        this.qtdLugares = qtdLugares;
        this.predio = predio;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(Integer qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    @Override
    public String toString() {
        return "SalaReuniao{" + "numero=" + numero + ", qtdLugares=" + qtdLugares + ", predio=" + predio + '}';
    }
    
}
