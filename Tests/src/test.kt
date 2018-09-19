/*
 YGG
 19/09/2018
*/


var correctas =0
var falladas =0
fun main(parametro: Array<String>) {



    preguntasResp(
            "¿Qué es Kotlin?",
            "Kotlin es un lenguaje de programación creado en 2010 por Jetbrains",
            "Es un helado",
            1)

    preguntasResp(
            "¿Por qué usar Kotlin?",
            "Seguro contra nulos",
            "No tienes que escribir codigo solo hablarlo",
            1)



}


fun preguntasResp(p:String,r1:String,r2:String,correcta:Int) {

    print("\n"+p+ "\n")
    print("1. $r1\n")
    print("2. $r2\n")

    var resp = readLine()!!.toInt()

    if (resp == correcta) {

        println("correcto")

        correctas++
        print("Preguntas correctas $correctas")

    } else {

        println("Faill!!")

        falladas++
        print("Preguntas falladas  $falladas")

    }
}

