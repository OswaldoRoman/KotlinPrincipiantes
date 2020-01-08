package com.udemandroid.kotlinprincipiantes
/**Proyecto hecho con ayuda del canal: Moure Dev by Brais Moure**/
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Leccion 1
        variablesYConstantes()
        //Leccion 2
        //tiposDatos()
        //Leccion 3
        //sentenciaIf()
        //Leccion 4
        //sentenciaWhen()
        //Leccion 5
        //arrays()
        //Leccion6
        //maps()
        //Leccion 7
        //loops()
    }

    /*Metodo de variables y constantes*/
    private fun variablesYConstantes() {
        //Primer variable
        println("Zeus es una perra")

    }

    /*Metodo con los tipos de datos*/
    private fun tiposDatos() {
        //String
        val myString = "Hola Dell"
        val myString2 = "Andorid Dev"
        val myString3 = myString + " " + myString2
        println(myString3)

        //Enteros(Byte, Short, Int, Long)
        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales (Float, Double)
        val myDecimal = 1.0f
        val myDouble = 1
        val myDouble2 = 9.8
        val myDouble4 = myDecimal + myDouble + myDouble2
        println(myDouble4)

        //Boolean (bool)
        val myBool = true
        println(myBool)
    }

    private fun sentenciaIf() {
        val myNumber = 12
        if (myNumber <= 10) {
            println("$myNumber es menor o igual que diez")
        } else {
            println("$myNumber es mayor que diez")
        }
    }

    private fun sentenciaWhen() {
        val country = "China"
        when (country) {
            "Mexico", "España", "Perú" -> {
                println("El idioma es Español")
            }
            "Estados Unidos" -> {
                println("El idioma es Ingles")
            }
            else -> {
                println("No conocemos el idioma")
            }
        }

        val age = 100
        when (age) {
            0, 1, 2 -> {
                println("Eres un bebé")
            }
            in 3..10 -> {
                println("Eres un niño")
            }
            in 11..17 -> {
                println("Eres un adolecente")
            }
            in 18..69 -> {
                println("Eres un adulto")
            }
            in 70..99 -> {
                println("Eres un anciano")
            }
            else -> {
                println("😱")
            }
        }
    }

    private fun arrays() {
        var nombre = "Oswaldo"
        var apellido = "Roman"
        var empresa = "Del Rancho"
        var edad = "23"
        var miArray: ArrayList<String> = arrayListOf()
        miArray.add(nombre)
        miArray.add(apellido)
        miArray.add(empresa)
        miArray.add(edad)
        println(miArray)
        miArray.addAll(listOf("Kotlin", "Java"))
        println(miArray)
        var dato = miArray[4]
        println(dato)
        miArray.removeAt(3)
        println(miArray)
        println(miArray.count())
        miArray.forEach {
            println(it)
        }
    }

    //Metodo para explicar los mapas (diccionarios)
    private fun maps() {
        var myMap: Map<String, Int>
        //Insertar datos
        myMap = mutableMapOf("Oswaldo" to 1, "Zeus" to 6, "Dario" to 5)
        println(myMap)
        myMap.put("Ruben", 9)
        myMap["Celia"] = 4
        println(myMap)
        //Actualizar datos
        myMap.put("Oswaldo", 13)
        myMap["Celia"] = 32
        println(myMap)
        //Eliminar datos
        myMap.remove("Oswaldo")
        println(myMap)
        //Consultar valores
        println(myMap["Zeus"])
        println("Ejemplo de hashset")
        var myhHashSet: Set<String>
        myhHashSet = mutableSetOf()
        myhHashSet.add("Oswaldo")
        myhHashSet.add("Zeus")
        myhHashSet.add("Oswaldo")
        myhHashSet.add("Dario")
        println(myhHashSet)

    }

    private fun loops() {
        val miList: List<String> = listOf("Caballo", "Vaca", "Perro")
        val myMap: Map<String, Int> = mutableMapOf("Mamá" to 1, "Papá" to 2, "Hermanos" to 3)
        //ciclo for
        for (myString in miList) {
            println(myString)
        }

        for (myElement in myMap) {
            println("${myElement.key} - ${myElement.value} ")
        }
        //números del 0 hasta el 10
        for (i in 0..10) {
            println(i)
        }
        //números de dos en dos del 0 hasta el 9
        for (i in 0 until 10 step 2){
            println(i)
        }
        //Números regresivos del 10 hasta el cero
        for (i in 10 downTo 0){
            println(i)
        }
        //Creacion de un array de números
        val miniArray = (1..20)
        for (arr in miniArray){
            println(arr)
        }
        //ciclo while
        var x = 0
        //Números del 0 hasta el 4
        while (x < 5) {
            println(x)
            x++
        }
    }
}
