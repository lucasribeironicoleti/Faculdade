<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Introdução ao Laravel</title>
</head>
<body>
    <div class="container">
        <header>
            <h1>Introdução do Laravel</h1>
        </header>
        <nav>
            <h2>Cadatsro de Clientes</h2>
            <ol>
                <li><a href="{{ route('client.index')}}">Inicio</a></li>
                <li><a href="{{ route('client.create')}}">Novo Cliente</a></li>
            </ol>
        </nav>
        <section>
            @yield('content')
        </section>
        <footer>
            <small>Tecnologi para Sistema para a Internet</small>
        </footer>
    </div>
</body>
</html>