/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rafae
 */
public class Cliente implements Comparable<Cliente>{
    public int idCliente;
    public String nome;
    public String sobrenome;
    public String rg;
    public String cpf;
    public String endereco;
    public double salario;
    public int ordenarPor; // 0 - nome | 1 - sobrenome | 2 - salario
    
    public Cliente() {
    }
    
    public Cliente (String nome, String sobrenome, String rg, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int ordenarPor() {
        return ordenarPor;
    }

    public void setordenarPor(int ordenarPor) {
        this.ordenarPor = ordenarPor;
    }
    
    @Override
    public int compareTo(Cliente cliente) {
        if (this.ordenarPor == 0) 
            return this.nome.compareTo(cliente.nome);
        else if (this.ordenarPor == 1) 
            return this.sobrenome.compareTo(cliente.sobrenome);
        else {
            if (this.salario < cliente.salario) 
                    return 1;
                else if (this.salario > cliente.salario)
                    return -1;
                else
                    return 0;
        }
    }
}
