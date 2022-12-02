package org.soulcodeacademy.empresa.services;


import org.soulcodeacademy.empresa.domain.Endereco;
import org.soulcodeacademy.empresa.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {


    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listar(){

        return this.enderecoRepository.findAll();
    }

    public Endereco getEndereco(Integer idEndereco) {
        Optional<Endereco> endereco = this.enderecoRepository.findById(idEndereco);

        if (endereco.isEmpty()) {
            throw new RuntimeException("Endereço não encontrado!");
        } else {
            return endereco.get();
        }
    }
}
