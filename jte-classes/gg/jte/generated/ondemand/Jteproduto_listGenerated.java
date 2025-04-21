package gg.jte.generated.ondemand;
import br.com.tecnosys.featureflags.dto.ProdutoDTO;
@SuppressWarnings("unchecked")
public final class Jteproduto_listGenerated {
	public static final String JTE_NAME = "produto_list.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,1,18,18,18,20,20,30,30,32,32,32,33,33,33,34,34,34,36,36,39,39,47,47,47,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.List<ProdutoDTO> produtos) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"pt-BR\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Lista de Produtos</title>\n    <link rel=\"stylesheet\" href=\"/css/styles.css\">\n</head>\n<body>\n    <header>\n        <h1>Lista de Produtos</h1>\n    </header>\n    \n    <main>\n        <section>\n            ");
		if (produtos == null || produtos.isEmpty()) {
			jteOutput.writeContent("\n                <p>Nenhum produto encontrado.</p>\n            ");
		} else {
			jteOutput.writeContent("\n                <table>\n                    <thead>\n                        <tr>\n                            <th>ID</th>\n                            <th>Nome</th>\n                            <th>Preço</th>\n                        </tr>\n                    </thead>\n                    <tbody>\n                        ");
			for (var produto : produtos) {
				jteOutput.writeContent("\n                            <tr>\n                                <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(produto.getId());
				jteOutput.writeContent("</td>\n                                <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(produto.getNome());
				jteOutput.writeContent("</td>\n                                <td>R$ ");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(produto.getPreco());
				jteOutput.writeContent("</td>\n                            </tr>\n                        ");
			}
			jteOutput.writeContent("\n                    </tbody>\n                </table>\n            ");
		}
		jteOutput.writeContent("\n        </section>\n    </main>\n    \n    <footer>\n        <p>&copy; 2024 - Minha Loja</p>\n    </footer>\n</body>\n</html> ");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		java.util.List<ProdutoDTO> produtos = (java.util.List<ProdutoDTO>)params.get("produtos");
		render(jteOutput, jteHtmlInterceptor, produtos);
	}
}
