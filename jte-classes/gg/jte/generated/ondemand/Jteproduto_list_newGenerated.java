package gg.jte.generated.ondemand;
import br.com.tecnosys.featureflags.dto.ProdutoDTO;
@SuppressWarnings("unchecked")
public final class Jteproduto_list_newGenerated {
	public static final String JTE_NAME = "produto_list_new.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,1,139,139,139,143,143,154,154,156,156,156,157,157,157,158,158,158,160,160,164,164,171,171,171,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.List<ProdutoDTO> produtos) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"pt-BR\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Lista de Produtos</title>\n    <style>\n        * {\n            margin: 0;\n            padding: 0;\n            box-sizing: border-box;\n            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n        }\n\n        body {\n            background-color: #f5f5f5;\n            padding-top: 80px;\n            padding-bottom: 60px;\n            min-height: 100vh;\n            position: relative;\n        }\n\n        header {\n            background-color: #2c3e50;\n            color: white;\n            padding: 1rem;\n            text-align: center;\n            position: fixed;\n            top: 0;\n            left: 0;\n            right: 0;\n            z-index: 1000;\n            box-shadow: 0 2px 4px rgba(0,0,0,0.1);\n        }\n\n        .container {\n            max-width: 1200px;\n            margin: 0 auto;\n            padding: 0 1rem;\n            position: relative;\n        }\n\n        .table-container {\n            position: relative;\n            margin-top: 1rem;\n            border-radius: 8px;\n            box-shadow: 0 1px 3px rgba(0,0,0,0.1);\n            background-color: white;\n            overflow: hidden;\n        }\n\n        table {\n            width: 100%;\n            border-collapse: collapse;\n        }\n\n        thead {\n            background-color: #34495e;\n        }\n\n        th {\n            position: sticky;\n            top: 0;\n            background-color: #34495e;\n            color: white;\n            font-weight: 600;\n            z-index: 1;\n        }\n\n        th, td {\n            padding: 1rem;\n            text-align: left;\n        }\n\n        tbody tr:nth-child(even) {\n            background-color: #f8f9fa;\n        }\n\n        tbody tr:hover {\n            background-color: #e9ecef;\n        }\n\n        td:first-child {\n            font-weight: bold;\n            color: #2c3e50;\n        }\n\n        .preco {\n            color: #27ae60;\n            font-weight: bold;\n        }\n\n        .mensagem-vazia {\n            text-align: center;\n            padding: 2rem;\n            color: #7f8c8d;\n            font-size: 1.2rem;\n            background-color: white;\n            border-radius: 8px;\n            box-shadow: 0 1px 3px rgba(0,0,0,0.1);\n            margin-top: 1rem;\n        }\n\n        footer {\n            background-color: #2c3e50;\n            color: white;\n            text-align: center;\n            padding: 1rem;\n            position: fixed;\n            bottom: 0;\n            left: 0;\n            right: 0;\n            z-index: 1000;\n        }\n\n        @media (max-width: 768px) {\n            body {\n                padding-top: 70px;\n            }\n\n            th, td {\n                padding: 0.75rem;\n            }\n\n            .table-container {\n                overflow-x: auto;\n            }\n        }\n    </style>\n</head>\n<body>\n    <header>\n        <h1>Lista de Produtos</h1>\n    </header>\n    \n    <main class=\"container\">\n        ");
		if (produtos == null || produtos.isEmpty()) {
			jteOutput.writeContent("\n            <div class=\"mensagem-vazia\">\n                <p>Nenhum produto encontrado.</p>\n            </div>\n        ");
		} else {
			jteOutput.writeContent("\n            <div class=\"table-container\">\n                <table>\n                    <thead>\n                        <tr>\n                            <th>ID</th>\n                            <th>Nome do Produto</th>\n                            <th>Preço</th>\n                        </tr>\n                    </thead>\n                    <tbody>\n                        ");
			for (var produto : produtos) {
				jteOutput.writeContent("\n                            <tr>\n                                <td>#");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(produto.getId());
				jteOutput.writeContent("</td>\n                                <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(produto.getNome());
				jteOutput.writeContent("</td>\n                                <td class=\"preco\">R$ ");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(String.format("%.2f", produto.getPreco()));
				jteOutput.writeContent("</td>\n                            </tr>\n                        ");
			}
			jteOutput.writeContent("\n                    </tbody>\n                </table>\n            </div>\n        ");
		}
		jteOutput.writeContent("\n    </main>\n    \n    <footer>\n        <p>&copy; 2024 - Lista de Produtos</p>\n    </footer>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		java.util.List<ProdutoDTO> produtos = (java.util.List<ProdutoDTO>)params.get("produtos");
		render(jteOutput, jteHtmlInterceptor, produtos);
	}
}
