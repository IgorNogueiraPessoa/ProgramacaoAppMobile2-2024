fun main(args: Array<String>){
    val nota = 9
    //usando operador range
    if(nota in 9..10){
        println("Fantástico")
    } else if (nota in 7..8){
        println("Parabéns")
    } else if (nota in 4..6){
        println("Tem como recuperar")
    } else if (nota in 0..3){
    println("Te vejo no proximo ano")
    } else {
        println("Nota inválida")
    }
}