<?php

use App\Http\Controllers\MusicsController;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

// Route::get('/musics/create', [App\Http\Controllers\MusicsController::class, 'create']);

// Route::post('/musics/new', [App\Http\Controllers\MusicsController::class, 'store'])->name('registrar');

Route::resource("/musics", MusicsController::class);

//Route::get('/musics/edit/{id}', 'MusicsController@edit');

// Route::post('/musics/edit/{id}', 'MusicsController@update');
