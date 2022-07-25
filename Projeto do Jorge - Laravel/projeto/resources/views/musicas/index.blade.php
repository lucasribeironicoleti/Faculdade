<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Listar</title>
</head>
<body>
    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
        <thead>
            <tr>
                <th> Nome da Musica: </th>
                <th> Album: </th>
                <th> Ano de Lançamento:  </th>
                <th> Cantor: </th>

                <th align="center" bgcolor="lightblue"> Editar </th>
            </tr>
        </thead>
        <tbody>
            @if (isset($musics))
                @foreach ($musics as $item)
                    <tr>
                        <td align="center">{{ $item->name_music }}</td>
                        <td align="center">{{ $item->albun_music }}</td>
                        <td align="center">{{ $item->year_music }}</td>
                        <td align="center">{{ $item->singer->singer_music }}</td>
                        <td align="center"><a class="btn btn-primary"
                                href="{{ route('musics.edit', $item->id) }}">
                                Exibir </a>
                            <form method="POST" action="{{ route('musics.destroy', $item->id) }}">
                                @csrf
                                @method('DELETE')
                                <input type="submit" class="btn btn-danger" value="Excluir">
                            </form>
                        </td>
                    </tr>
                @endforeach
            @endif
        </tbody>
    </table>
    <button> <a href="{{ route('musics.create') }}"> Adicionar</a></button> 
</body>
</html>