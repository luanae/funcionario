package br.edu.famper.funcionarios.repository;

import br.edu.famper.funcionarios.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioReposity extends JpaRepository<Funcionario, Long> {
}
