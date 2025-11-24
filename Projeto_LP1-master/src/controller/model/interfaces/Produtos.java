public class Produtos {
    private int id;
    private String nome;
    private double preco;
    private int estoque; // Regra de Negócio: Todos os produtos em estoque

    public Produtos(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = 99; // Simula que está em estoque
    }

    // Getters
    public double getPreco() { return preco; }
    public String getNome() { return nome; }

    // Método para simular a atualização do estoque (importante para [RF005])
    public void reduzirEstoque(int quantidade) {
        this.estoque -= quantidade;
    }
}

package com.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private double preco;
    private int estoque;

    // Construtores, Getters e Setters
    // ...

    public Produto() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
                }
}