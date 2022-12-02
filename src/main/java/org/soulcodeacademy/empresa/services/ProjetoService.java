package org.soulcodeacademy.empresa.services;


import org.soulcodeacademy.empresa.domain.Projeto;
import org.soulcodeacademy.empresa.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private EmpregadoService empregadoService;

    public List<Projeto> listarProjetos(){

        return this.projetoRepository.findAll();
    }
    public Projeto getProjeto(Integer idProjeto){

        return this.projetoRepository.findById(idProjeto)
                .orElseThrow(() -> new RuntimeException("Chamado não encontrado"));
    }


}
