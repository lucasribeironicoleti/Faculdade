<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Editar</title>
</head>
<body>
    <form action="{{ route('musics.update', $musics->id) }}" method="post">
        @method('PUT')
        @csrf
        <label for="">Nome da Musica:</label><br/>
        <input type="text" name="name_music" value="{{ $musics->name_music }}"><br/>
        <label for="">Nome do Albúm:</label><br/>
        <input type="text" name="albun_music" value="{{ $musics->albun_music }}"><br/>
        <label for="">Nome do Cantor:</label><br/>
        <select name="singer_music">
            <option value="1">Mauê</option>
            <option value="2">Metallica</option>
        </select>
      <!--  <input type="text" name="singer_music"><br/>-->
      <br/>
        <label for="">Ano de Lançamento:</label><br/>
        <input type="number" name="year_music" value="{{ $musics->year_music }}"><br/>
        <button>Alterar</button>
    </form>
</body>
</html>