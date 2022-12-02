package org.soulcodeacademy.empresa.services;

import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.domain.dto.EmpregadoDTO;
import org.soulcodeacademy.empresa.repositories.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpregadoService {

    @Autowired
    private EmpregadoRepository empregadoRepository;

    public List<Empregado> listar(){    //retorna todos empregados em forma de lista

        return this.empregadoRepository.findAll();
    }

    public List<Empregado> listarFaixaSalarial(Double valor1, Double valor2 ){
        return this.empregadoRepository.findBySalarioEntreFaixas(valor1, valor2);
    }

    public Empregado getEmpregado(Integer id) {
        // Optional = pode existir ou não a entidade
        Optional<Empregado> empregado = this.empregadoRepository.findById(id);

        if (empregado.isEmpty()) {
            throw new RuntimeException("O empregado não foi encontrado!");
        } else {
            return empregado.get(); // pega o valor da entidade encontrada
        }
    }

    public Empregado salvar(EmpregadoDTO dto){
        Empregado empregado = new Empregado(null, dto.getEmail(), dto.getNome(), dto.getSalario());

        Empregado salvo = this.empregadoRepository.save(empregado);

        return salvo;
    }
}
