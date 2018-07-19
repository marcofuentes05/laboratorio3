package main

fun main(args: Array<String>) {
    var listaMain : ArrayList<Agenda> = ArrayList()
    var uvg = Agenda("Universidad")
    val add = listaMain.add(uvg)
    var continuar:Boolean=true
    var posicion : Int =0
    var continuar1:Boolean = true
    do{
        var contador: Int = listaMain.count()
        if (contador == 0){
            println("1. Crear una nueva lista de tareas")
            println ("2. Salir")
            var respuesta1 = readLine()!!
            if (respuesta1 == "2"){
                continuar = false
            }else{
                println("Ingresa el nombre d3e la nueva lista de tareas")
                var nombreLista= readLine()!!.toString()
                listaMain.add(Agenda(nombreLista))
                continuar = true
            }
        }else{
            println("1. Crear lista de tareas")
            println("2. Ver todas las listas de tareas")
            println("3. Seleccionar una lista de tareas")
            println("4. Salir")
            var respuesta2 : String = readLine()!!.toString()
            if (respuesta2=="1"){
                println("Ingresa el nombre de la nueva lista de tareas")
                var nombreLista:String= readLine()!!.toString()
                listaMain.add(Agenda(nombreLista))
                continuar = true
            }else if (respuesta2=="2"){
                listaMain.forEach{println(it.getNombre())}
            }else if(respuesta2 == "3"){
                for (i in listaMain.indices){
                    println("${i}) ${listaMain.get(i).getNombre()}")
                }
                println("Ingresa el numero de la lista que deseas seleccionar")
                var respuesta3:Int =  readLine()!!.toInt()
                posicion=respuesta3
                println("Lista seleccionada exitosamente!")
                //continuar = true
                println("")
                println("")
                println("")
                do{
                    println("1. Deseleccionar lista: ${listaMain.get(posicion).getNombre()}")
                    println("2. Agregar una tarea")
                    println("3. Completar una tarea")
                    println("4. Ver todas las tareas en esta lista")
                    println("5. Salir")
                    var respuesta4 : String= readLine()!!.toString()
                    if (respuesta4 =="1"){
                        posicion = 0
                        continuar1=false
                    }else if (respuesta4 =="2"){
                        println("Ingrese el titulo de la nueva tarea")
                        var nom:String= readLine()!!.toString()
                        listaMain.get(posicion).agregarTarea(Tarea(nom,false))
                        println("Tarea agregada exitosamente!")
                    }else if (respuesta4=="3"){
                        for (i in listaMain.get(posicion).getLista().indices){
                            println("$i) ${listaMain.get(posicion).getLista().get(i).getNombre()}")
                        }
                        println("Ingresa el numero de tarea que deseas completar")
                        var respuesta5:String=readLine()!!.toString()
                        listaMain.get(posicion).getLista().get(respuesta5.toInt()).setCompleta()
                        listaMain.removeAt(respuesta5.toInt())
                        println("Tarea completada con éxito!")
                    }else if (respuesta4 == "4"){
                        for (i in listaMain.get(posicion).getLista().indices){
                            if (listaMain.get(posicion).getLista().get(i).getComp()==true){
                                println("${listaMain.get(posicion).getLista().get(i).getNombre()}")
                            }
                        }
                        listaMain.get(posicion).getLista().forEach{println(it.getNombre())}
                    }else if (respuesta4=="5"){
                        continuar = false
                        continuar1= false
                    }
                }while (continuar1 == true)

            }else if (respuesta2 == "4"){
                continuar=false
            }
        }

    }while(continuar == true)
}
