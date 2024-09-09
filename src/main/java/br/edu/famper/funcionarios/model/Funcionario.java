package br.edu.famper.funcionarios.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table(name = "tbl_funcionario")
@Data
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "funcionario_id")
    private Long codigo;

    @Column(name = "nome", length = 75)
    private String nome;

    @Column(name = "cargo", length = 75)
    private String cargo;

    @Column(name = "departamento", length = 75)
    private String departamento;

    @Column(name = "data_admissao")
    private LocalDate dataAdmissao;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "telefone")
    private String telefone;
}
