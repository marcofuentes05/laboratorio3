package main

class Agenda(private var nombre: String,
             private var listaTareas: ArrayList<Tarea> = ArrayList()){
    fun getLista() : ArrayList<Tarea>{
        return listaTareas
    }
    fun agregarTarea( task:Tarea){
        listaTareas.add(task)
    }
    fun getNombre():String{
        return nombre
    }
}