package br.com.tecnosys.featureflags.controller;

import br.com.tecnosys.featureflags.dto.ProdutoDTO;
import br.com.tecnosys.featureflags.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import java.util.List;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    private final ProdutoService produtoService;
    private final FeatureManager manager;
    public static final Feature LAYOUT_NEW = new NamedFeature("LAYOUT_NEW");

    public ProdutoController(ProdutoService produtoService, FeatureManager manager) {
        this.produtoService = produtoService;
        this.manager = manager;
    }

    @GetMapping
    public String getProdutoPage(Model model) {
        List<ProdutoDTO> produtos = produtoService.findAll();
        model.addAttribute("produtos", produtos);
        return manager.isActive(LAYOUT_NEW) ? "produto_list_new" : "produto_list";
    }
}