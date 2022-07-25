<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Client extends Model
{
    use HasFactory;

    // activating the eager loading as default behavior
    protected $with = ['telephone', 'city'];

    public function telephone(){
        return $this->hasOne(Telephone::class, 'id', 'id');
    }

    public function city(){
        return $this->belongsTo(City::class);
    }

}
