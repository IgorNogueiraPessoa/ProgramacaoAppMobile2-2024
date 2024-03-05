import kotlin.math.PI
import kotlin.math.sqrt

fun main(args: Array<String>)
{
    println("Selecione o nº equivalente ao cálculo da área da figura geométrica: \n 1:Área do retângulo \n 2:Área do triangulo: Equilátero \n 3:Escaleno \n 4:Isóscele \n 5:Área da circunferência \n 6:Área do losango \n 7: Área do trapézio")
    val opcao = readLine()?.toInt() ?: 0

    when(opcao){
        1 -> areaRetang()
        2 -> areaEqui()
        3 -> areaEsca()
        4 -> areaIso()
        5 -> areaCircun()
        6 -> areaLosan()
        7 -> areaTrap()
        else -> println("Opção inválida!")
    }
}
fun areaRetang() {
    val base = 10
    val altura = 2
    val area = (base * altura) / 2
    println("Valor da base: $base, valor da altura: $altura. A área do triângulo é: $area")
}

fun areaEqui() {
    val lado = 10
    val area = (sqrt(3.0) / 4) * lado * lado
    println("O lado é: $lado, e a área do triângulo equilatero é: $area")
}

fun areaEsca(){
    val cump = 10
    val alt = 2
    val area = (cump*alt)/2
    println("O cumprimento é: $cump, e a altura: $alt. A área do triângulo escaleno é: $area")
}

fun areaIso(){
    val cump = 10
    val alt = 2
    val area = (cump*alt)/2
    println("O cumprimento é: $cump, e a altura: $alt. A área do triângulo isósceles é: $area")
}

fun areaCircun(){
    val raio = 10
    val area = PI * (raio*raio)
    println("O raio é: $raio. A área da circunferência é: $area")
}

fun areaLosan(){
    val DMaior = 10
    val DMenor = 2
    val area = (DMaior*DMenor) / 2
    println("A diagonal maior é: $DMaior, e a menor é: $DMenor. A área do losango é: $area")
}

fun areaTrap(){
    val BMaior = 10
    val BMenor = 2
    val alt = 10
    val area = ((BMaior + BMenor) * alt) / 2
    println("A base maior é: $BMaior, a menor é: $BMenor, e a altura é: $alt. A área é: $area")
}