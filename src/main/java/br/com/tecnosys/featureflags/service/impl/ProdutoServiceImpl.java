package br.com.tecnosys.featureflags.service.impl;

import br.com.tecnosys.featureflags.dto.ProdutoDTO;
import br.com.tecnosys.featureflags.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Override
    public List<ProdutoDTO> findAll() {
        return List.of(
                ProdutoDTO.builder().id(1).nome("Mouse").preco(BigDecimal.valueOf(9.00)).build(),
                ProdutoDTO.builder().id(2).nome("Teclado").preco(BigDecimal.valueOf(15.00)).build(),
                ProdutoDTO.builder().id(3).nome("Monitor").preco(BigDecimal.valueOf(150.00)).build(),
                ProdutoDTO.builder().id(4).nome("Gabinete").preco(BigDecimal.valueOf(120.00)).build(),
                ProdutoDTO.builder().id(5).nome("Impressora").preco(BigDecimal.valueOf(200.00)).build(),
                ProdutoDTO.builder().id(6).nome("Scanner").preco(BigDecimal.valueOf(180.00)).build(),
                ProdutoDTO.builder().id(7).nome("Mousepad").preco(BigDecimal.valueOf(5.00)).build(),
                ProdutoDTO.builder().id(8).nome("Placa Mãe").preco(BigDecimal.valueOf(250.00)).build(),
                ProdutoDTO.builder().id(9).nome("Processador").preco(BigDecimal.valueOf(350.00)).build(),
                ProdutoDTO.builder().id(10).nome("HD Externo").preco(BigDecimal.valueOf(100.00)).build()
        );
    }
}
