package br.edu.famper.funcionarios.service;

import br.edu.famper.funcionarios.model.Funcionario;
import br.edu.famper.funcionarios.repository.FuncionarioReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioReposity funcionarioReposity;

    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioReposity.save(funcionario);
    }

    public List<Funcionario> findAll(){
        return funcionarioReposity.findAll();
    }

    public Optional<Funcionario> findById(Long id) {
        return funcionarioReposity.findById(id);
    }

    public Funcionario update(Funcionario funcionario) {
        Funcionario salvo = funcionarioReposity.findById(funcionario.getCodigo())
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado!!"));
        salvo.setNome(funcionario.getNome());
        salvo.setCargo(funcionario.getCargo());
        salvo.setDepartamento(funcionario.getDepartamento());
        salvo.setDataAdmissao(funcionario.getDataAdmissao());
        salvo.setEmail(funcionario.getEmail());
        salvo.setTelefone(funcionario.getTelefone());
        return funcionarioReposity.save(salvo);
    }

    public void deleteById(Long id) {
        funcionarioReposity.deleteById(id);
    }
}
