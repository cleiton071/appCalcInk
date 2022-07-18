package com.cleiton.appcalcink.model;

public class Wall {

    private Double altura;
    private Double largura;
    private Integer nporta;
    private Integer njanela;

    public Wall(Double altura, Double largura, Integer nporta, Integer njanela) {
        this.altura = altura;
        this.largura = largura;
        this.nporta = nporta;
        this.njanela = njanela;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Integer getNporta() {
        return nporta;
    }

    public void setNporta(Integer nporta) {
        this.nporta = nporta;
    }

    public Integer getNjanela() {
        return njanela;
    }

    public void setNjanela(Integer njanela) {
        this.njanela = njanela;
    }
}
