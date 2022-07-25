<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('rentals', function (Blueprint $table) {
            $table->id();
            //----------------------------------------------------------------------
            $table->foreignId('client_id'); //..creates the relationship automatically
            //---------------------------------------------------------------------
            $table->unsignedBigInteger('vehicle_id'); //..creates the relationship manually
            $table->foreign('vehicle_id')->references('id')->on('vehicles');
            //-------------------------------------------------------------------------
            $table->date('rent_date');
            $table->date('devolution_date')->nullable();
            $table->decimal('value', 9, 2);
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('rentals');
    }
};
