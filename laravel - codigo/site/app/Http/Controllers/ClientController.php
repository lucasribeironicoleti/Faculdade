<?php

namespace App\Http\Controllers;
use App\Models\Client;
use Illuminate\Http\Request;
use stdClass;

class ClientController extends Controller
{
    //..store clients temporary
    private $clients=[];

    public function __construct(){
        
    }
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        //return the view - using the view name
        //return view('client.index')->with('clients', session('clients'));

        $clients = Client::orderBy('name')->get();
        return view('client.index')->with('clients', $clients);
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        return view('client.create');
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $client = new Client();

        $client->name = $request->input('name');
        $client->city = $request->input('city');
        $client->email = $request->input('email');
        $client->save();

        return(redirect(route('client.index')));
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        $client = Client::find($id);
        if($client){
            return view('client.show')->with('client', $client);        
        }else{
            abort(404);
        }
        dd($client);
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        $client = Client::find($id);
        if($client){
            return view('client.edit')->with('client', $client);        
        }else{
            abort(404);
        }
        dd($client);
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
        $client = Client::find($id);
        $client->name = $request->input('name');
        $client->city = $request->input('city');    
        $client->email = $request->input('email');    
        $client->save();        
        return(redirect(route('client.index')));
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        $client = Client::find($id);
        $client->delete();
        return(redirect(route('client.index')));
    }

    //..create a set of mocked clients
    private function createClients(){

        $client = new stdClass;
        $client->id=1;
        $client->name='Mikasa Sukasa';
        $client->city='Paradis';
        $client->email='mikasa@paradis.com';

        $this->clients[] = $client;



        $client = new stdClass;
        $client->id=2;
        $client->name='Tangiro Dois';
        $client->city='Andandis';
        $client->email='tangiro@amdandis.com';

        $this->clients[] = $client;
    }

    //..returns an object from an array
private function arrayFind($array, $id){
    if($array){
        foreach($array as $obj){
            if ($obj->id == $id)
                return $obj;
        }
        return null;
    }
}

    //..return the index of an array in an object
    private function arraySearch($array, $key, $search)
    {
    if ($array) {
        $i = 0;
        foreach($array as $obj){
            if ($obj->$key == $search) {
                return $i;
            }
            $i++;
        }
        return -1;
    }
    }
}
