/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.bookaroom;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Thiago Riquelmo
 */
public class Reserva {
    private LocalDate dataAlocacao;
    private LocalDate horaInicio;
    private LocalDate horaFim;
    private String assunto;
    private List<Equipamento> equipamentos;
    private SalaReuniao sala;
    private Funcionario funcionario;

    public Reserva() {
    }

    public Reserva(LocalDate dataAlocacao, LocalDate horaInicio, LocalDate horaFim, String assunto, List<Equipamento> equipamentos, SalaReuniao sala, Funcionario funcionario) {
        this.dataAlocacao = dataAlocacao;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.assunto = assunto;
        this.equipamentos = equipamentos;
        this.sala = sala;
        this.funcionario = funcionario;
    }

    public LocalDate getDataAlocacao() {
        return dataAlocacao;
    }

    public void setDataAlocacao(LocalDate dataAlocacao) {
        this.dataAlocacao = dataAlocacao;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalDate horaFim) {
        this.horaFim = horaFim;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public SalaReuniao getSala() {
        return sala;
    }

    public void setSala(SalaReuniao sala) {
        this.sala = sala;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Reserva{" + "dataAlocacao=" + dataAlocacao + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", assunto=" + assunto + ", equipamentos=" + equipamentos + ", sala=" + sala + ", funcionario=" + funcionario + '}';
    }
        
}
