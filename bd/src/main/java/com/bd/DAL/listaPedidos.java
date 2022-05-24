package com.bd.DAL;

import java.util.Date;

public class listaPedidos {
    private  int id_encomenda;
    private int id_estafeta;
    private int id_cliente;
    private String descricao;
    private String data;
    private float precodose;
    private int encomendaestados;
    private  int qtd;



    public int getId_encomenda() {
        return id_encomenda;
    }

    public void setId_encomenda(int id_encomenda) {
        this.id_encomenda = id_encomenda;
    }

    public int getId_estafeta() {
        return id_estafeta;
    }

    public void setId_estafeta(int id_estafeta) {
        this.id_estafeta = id_estafeta;
    }

    public int getId_cliete() {
        return id_cliente;
    }

    public void setId_cliete(int id_cliete) {
        this.id_cliente = id_cliete;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPrecodose() {
        return precodose;
    }

    public void setPrecodose(float precodose) {
        this.precodose = precodose;
    }

    public int getEncomendaestados() {
        return encomendaestados;
    }

    public void setEncomendaestados(int encomendaestados) {
        this.encomendaestados = encomendaestados;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public listaPedidos(Encomendas en, Pratos pr, Encomendaestados ee, PratosEncomendados prae ) {
        this.id_encomenda = en.getIdEncomenda();
        this.id_estafeta = en.getIdEstafeta();
        this.id_cliente = en.getIdCliente();
        this.descricao = pr.getDescricao();
        this.data = String.valueOf(ee.getData());
        this.precodose = prae.getPrecodose();
        this.encomendaestados = ee.getIdEstadoencomenda();
        this.qtd = prae.getQtddoses();
    }
}
