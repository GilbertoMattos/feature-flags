@import br.com.tecnosys.featureflags.dto.ProdutoDTO
@param java.util.List<ProdutoDTO> produtos

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Produtos</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            background-color: #f5f5f5;
            padding-top: 80px;
            padding-bottom: 60px;
            min-height: 100vh;
            position: relative;
        }

        header {
            background-color: #2c3e50;
            color: white;
            padding: 1rem;
            text-align: center;
            position: fixed;
            top: 0;
            left: 0;
            right: 0;
            z-index: 1000;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 1rem;
            position: relative;
        }

        .table-container {
            position: relative;
            margin-top: 1rem;
            border-radius: 8px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            background-color: white;
            overflow: hidden;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        thead {
            background-color: #34495e;
        }

        th {
            position: sticky;
            top: 0;
            background-color: #34495e;
            color: white;
            font-weight: 600;
            z-index: 1;
        }

        th, td {
            padding: 1rem;
            text-align: left;
        }

        tbody tr:nth-child(even) {
            background-color: #f8f9fa;
        }

        tbody tr:hover {
            background-color: #e9ecef;
        }

        td:first-child {
            font-weight: bold;
            color: #2c3e50;
        }

        .preco {
            color: #27ae60;
            font-weight: bold;
        }

        .mensagem-vazia {
            text-align: center;
            padding: 2rem;
            color: #7f8c8d;
            font-size: 1.2rem;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            margin-top: 1rem;
        }

        footer {
            background-color: #2c3e50;
            color: white;
            text-align: center;
            padding: 1rem;
            position: fixed;
            bottom: 0;
            left: 0;
            right: 0;
            z-index: 1000;
        }

        @media (max-width: 768px) {
            body {
                padding-top: 70px;
            }

            th, td {
                padding: 0.75rem;
            }

            .table-container {
                overflow-x: auto;
            }
        }
    </style>
</head>
<body>
    <header>
        <h1>Lista de Produtos</h1>
    </header>
    
    <main class="container">
        @if(produtos == null || produtos.isEmpty())
            <div class="mensagem-vazia">
                <p>Nenhum produto encontrado.</p>
            </div>
        @else
            <div class="table-container">
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nome do Produto</th>
                            <th>Preço</th>
                        </tr>
                    </thead>
                    <tbody>
                        @for(var produto : produtos)
                            <tr>
                                <td>#${produto.getId()}</td>
                                <td>${produto.getNome()}</td>
                                <td class="preco">R$ ${String.format("%.2f", produto.getPreco())}</td>
                            </tr>
                        @endfor
                    </tbody>
                </table>
            </div>
        @endif
    </main>
    
    <footer>
        <p>&copy; 2024 - Lista de Produtos</p>
    </footer>
</body>
</html>