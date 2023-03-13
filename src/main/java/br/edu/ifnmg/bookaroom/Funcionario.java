/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.bookaroom;

/**
 *
 * @author Thiago Riquelmo
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private Integer ramal;
    private Campus campus;

    public Funcionario() {
    }

    public Funcionario(String nome, String cargo, Integer ramal, Campus campus) {
        this.nome = nome;
        this.cargo = cargo;
        this.ramal = ramal;
        this.campus = campus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getRamal() {
        return ramal;
    }

    public void setRamal(Integer ramal) {
        this.ramal = ramal;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cargo=" + cargo + ", ramal=" + ramal + ", campus=" + campus + '}';
    }
        
}
