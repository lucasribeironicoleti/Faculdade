<?php

use App\Http\Controllers\ClientController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ProductController;

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

Route::get('/hello/{name?}', function ($name = "Lucas") {
    return "<h1>Hello $name !!!</h1>";
})->where('name', '[A-Za-z]+');

Route::prefix('/app')->group(function () {
    Route::get('/', function (){
        return "<h2>Meu Apepe</h2>";
    });
    Route::get('/profile', function () {
        return "<h2>Meu Perfil!</h2>";
    });
});


Route::get('/products', [ProductController::class, 'index']);

Route::get('/products/add/{products}', [ProductController::class, 'add']);

Route::get('/products/promotion', [ProductController::class, 'promotion']);





Route::resource('/client', ClientController::class);