package org.soulcodeacademy.empresa.domain.dto;


import org.soulcodeacademy.empresa.domain.Endereco;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmpregadoDTO {


    private Integer idEmpregado;

    @NotNull(message = "nome obrigatório")
    private String nome;

    @NotBlank(message = "email obrigatório")
    @Email(message = " email inválido")
    private String email;

    @NotNull(message = "salário obrigatório")
    @Min(value = 3000, message = "campo salário inválido")
    private Double salario;

    @NotNull
    private Endereco endereco;

    public Integer getIdEmpregado() {
        return idEmpregado;
    }

    public void setIdEmpregado(Integer idEmpregado) {
        this.idEmpregado = idEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
