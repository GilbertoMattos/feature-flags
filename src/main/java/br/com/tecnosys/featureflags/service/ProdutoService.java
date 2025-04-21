package br.com.tecnosys.featureflags.service;

import br.com.tecnosys.featureflags.dto.ProdutoDTO;

import java.util.List;

public interface ProdutoService {

    List<ProdutoDTO> findAll();
}
