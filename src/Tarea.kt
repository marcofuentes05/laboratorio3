package main

class Tarea(private var nombre: String,
            private var completa: Boolean){
    fun getComp():Boolean{
        return completa
    }

    fun getNombre():String{
        return nombre
    }
    fun setCompleta(){
        if (completa==true){
            completa=false
        }else if(completa==false){
            completa = true
        }
    }

}