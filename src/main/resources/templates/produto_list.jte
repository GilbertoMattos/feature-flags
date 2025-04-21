@import br.com.tecnosys.featureflags.dto.ProdutoDTO
@param java.util.List<ProdutoDTO> produtos

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Produtos</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <header>
        <h1>Lista de Produtos</h1>
    </header>
    
    <main>
        <section>
            @if(produtos == null || produtos.isEmpty())
                <p>Nenhum produto encontrado.</p>
            @else
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nome</th>
                            <th>Preço</th>
                        </tr>
                    </thead>
                    <tbody>
                        @for(var produto : produtos)
                            <tr>
                                <td>${produto.getId()}</td>
                                <td>${produto.getNome()}</td>
                                <td>R$ ${produto.getPreco()}</td>
                            </tr>
                        @endfor
                    </tbody>
                </table>
            @endif
        </section>
    </main>
    
    <footer>
        <p>&copy; 2024 - Minha Loja</p>
    </footer>
</body>
</html> 