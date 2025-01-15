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
    longitudCadenaSmartCast("Esternocleidomastoideo")

    //Ejercicio 16
    dividirNumeros(5, 0)

    //Ejercicio 17
    println("Ingresa un número:")
    val input = readLine()
    val numInput: Int
    try{
        numInput = input?.toInt() ?: 0
    } catch (e: Exception){
        println("No se ha podido convertir la entrada a un número")
    }

    //Ejercicio 18
    operacionesBasicas(4, 0)

    //Ejercicio 19
    val variableAny: Any = 5

    var variableInt = variableAny as Int
    variableInt = (variableAny as? Int)!!

    var variableString: String?
    try{
        variableString = variableAny as String
    } catch (e: Exception){
        println("No se pudo realizar el casteo")
    }

    variableString = variableAny as? String ?: ""

    //Ejercicio 20
    try {
        val listaNumeros = listOf(5, 0)
        println(10 / listaNumeros.random())

        val datos = listOf<Any>("ola")
        val dato = datos.random() as Int

        println(dato)
    } catch (e: ArithmeticException) {
        println("Ha ocurrido un error: No se pudo dividir entre cero")
    } catch (e: ClassCastException) {
        println("Ha ocurrido un error: No se pudo castear un String a un Int")
    } finally {
        println("Fin del bloque trycatch")
    }

    //Ejercicio 21
    val punto1 = Point(0, 0)
    val punto2 = Point(2, 2)
    val distancia = punto1 distancia punto2
    println("Distancia: $distancia")

    //Ejercicio 22
    val suma by lazy {
        5 + 4
    }

    println("Suma lazy: $suma")

    lateinit var cadenaLate: String

    //Ejercicio 23
    val constructor = StringBuilder()
    with(constructor){
        append("ola")
        append(" ke")
        append(" ase")
    }

    println("Resultado StringBuilder con with: $constructor")

    //Ejercicio 24
    val persona = Persona()
    persona.apply {
        nombre = "Juan"
        edad = 25
        direccion = "C/Inexistente, 9"
    }

    //Ejercicio 25
    val rectangulo = Rectangulo(5f, 7.5f)
    rectangulo.run {
        println(calculateArea(longitud, ancho))
    }

    //Ejercicio 26
    val cadenaNullable: String? = "cadena"

    cadenaNullable?.let {
        println(cadenaNullable.length)
    }

    //Ejercicio 27
    val listaNumeros = listOf(1, 3, 5)
    listaNumeros
        .also { println("Lista original: $it") }
        .map { it * 2 }
        .also { println("Lista modificada: $it") }
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

fun longitudCadenaSmartCast(cadena: Any): Int{
    if(cadena is String){
        return cadena.length
    }else return -1
}

fun dividirNumeros(a: Int, b: Int): Int{
    try {
        val resultado = a / b

        return resultado
    } catch (e: Exception){
        println("No se puede dividir entre cero")
        return -1
    }
}

fun operacionesBasicas(a: Int, b: Int){
    println(a + b)
    println(a - b)
    println(a * b)
    try {
        println(a / b)
    } catch (e: Exception){
        println("No se puede dividir entre cero")
    }
}

fun calculateArea(longitud: Float, ancho: Float): Float = longitud * ancho