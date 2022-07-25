<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Music extends Model
{
    use HasFactory;

    protected $fillable = ['name_music', 'albun_music', 'singer_music', 'year_music'];

    public function singer(){
        return $this->belongsTo(singer::class);
    }
}
