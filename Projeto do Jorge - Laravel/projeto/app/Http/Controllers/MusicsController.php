<?php

namespace App\Http\Controllers;

use App\Models\music;
use App\Models\singer;
use Illuminate\Http\Request;
use app\resources\views\musicas;

class MusicsController extends Controller
{
    public function create(){
        return view('musicas.create');
    }

    public function store(Request $request){

        $musics = new Music();

        $musics->name_music = $request->input('name_music');
        $musics->albun_music = $request->input('albun_music');
        $musics->year_music = $request->input('year_music');
        $musics->singer_id = singer::find($request->input('singer_music'))->id;
        $musics->save();

        return (redirect(route('musics.index')));
    }
    
    public function index()
    {
        $musics = Music::all();
        return view('musicas.index')->with('musics', $musics);
    }

    public function edit($id)
    {
        $musics = Music::find($id);
        $singer = singer::all();
        return view('musicas.edit')->with('musics', $musics)->with('singer', $singer);

        // return view('phone.edit')->with('phone', $phone)->with('brands', $brands);
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        $musics = Music::findOrFail($id);

        $musics->update([
            'name_music' => $request->name_music,
            'albun_music' => $request->albun_music,
            'year_music' => $request->year_music,
            'singer_id' => singer::find($request->input('singer_music'))->id,
        ]);

        return(redirect(route('musics.index')));

    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        $music = Music::find($id);

        $music->delete();

        return(redirect(route('musics.index')));
    }
}

// 'name_music' => $request->name_music,
            // 'albun_music' => $request->albun_music,
            // 'singer_music' => $request->singer_music,
            // 'year_music' => $request->year_music