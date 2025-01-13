package com.cmj.ejerciciostema5

fun main(){
    //Ejercicio 1
    var cadena = "ola ke ase"
    println(longitudCadena(cadena))

    //Ejercicio 2
    val cadena2 = "ola ke ase2"
    println("$cadena es igual que $cadena2?: ${sonIguales(cadena, cadena2)}")

    //Ejercicio 3
    compararCadenas(cadena, cadena2)

    //Ejercicio 4
    cadena.uppercase()

    //Ejercicio 5
    cadena.lowercase()

    //Ejercicio 6
    val cadena3 = "   homoplato  "
    println(cadena3.trim())

    //Ejercicio 7
    val cadenaLarga = "Cogito ergo sum"
    println(cadenaLarga.substring(5, 10))

    //Ejercicio 8
    println(cadenaLarga.replace("o", "a"))

    //Ejercicio 9
    println(cadenaLarga.split(' '))

    //Ejercicio 10
    val cadena4 = "Hola"
    val cadena5 = "Mundo"
    val cadenaUnida = cadena4 + cadena5

    //Ejercicio 11
    val cadenaFormat = "Hola %s, bienvenido a %s".format("humano", "tu infierno personal")
    println(cadenaFormat)

    //Ejercicio 13
    var a: Int? = null
    var b: Int? = null

    if(a != null && b != null){
        println(a + b)
        println(a - b)
        println(a * b)
    }

    //Ejercicio 14
    var variableNula: String = null ?: ""

    //Ejercicio 15

}

fun longitudCadena(cadena: String): Int {
    return cadena.length
}

fun sonIguales(cadena1: String, cadena2: String): Boolean{
    return cadena1.equals(cadena2)
}

fun compararCadenas(cadena1: String, cadena2: String){
    println(cadena1.compareTo(cadena2))
}