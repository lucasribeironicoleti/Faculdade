@extends('base')
@section('content')
<h2>Visualizando os dados do Cliente</h2>
<p><strong>id:</strong>{{ $client->id }}</p>
<p><strong>Nome:</strong>{{ $client->name }}</p>
<p><strong>Cidade:</strong>{{ $client->city }}</p>
<p><strong>E-mail:</strong>{{ $client->email }}</p>
<a href="{{ route('client.index')}}">Voltar</a>
<hr>
@endsection