package com.desafiomv.models;

import lombok.*;

import javax.persistence.*;

import com.desafiomv.enums.TipoMovimentacao;

import java.util.Date;
/*
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Movimentacao {

    @Id
    @GeneratedValue
    private Integer modo;
    
    @Column(nullable = false)
    private Date dataMovimentacao;
    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipo;
    public Integer getModo() {
		return modo;
	}

	public void setModo(Integer modo) {
		this.modo = modo;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Float getTaxa() {
		return taxa;
	}

	public void setTaxa(Float taxa) {
		this.taxa = taxa;
	}

	public Account getConta() {
		return conta;
	}

	public void setConta(Account conta) {
		this.conta = conta;
	}

	@Column(nullable = false)
    private Float valor;
    @Column(nullable = false)
    private Float taxa;

    @ManyToOne
    @JoinColumn(name = "conta_numero")
    private Account conta;

}*/