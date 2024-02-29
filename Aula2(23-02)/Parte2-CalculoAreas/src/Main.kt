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
    println("Digite a base do retangulo:")
    val base = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite a altura do retangulo:")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    val area = (base * altura) / 2
    println("A área do triângulo é: $area")
}

fun areaEqui() {
    println("Digite o lado do triangulo:")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0
    val area = (sqrt(3.0) / 4) * lado * lado
    println("A área do triângulo equilatero é: $area")
}

fun areaEsca(){
    println("Digite o comprimento do triangulo:")
    val cump = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o a altura do triangulo:")
    val alt = readLine()?.toDoubleOrNull() ?: 0.0
    val area = (cump*alt)/2
    println("A área do triângulo escaleno é: $area")
}

fun areaIso(){
    println("Digite o comprimento do triangulo:")
    val cump = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o a altura do triangulo:")
    val alt = readLine()?.toDoubleOrNull() ?: 0.0
    val area = (cump*alt)/2
    println("A área do triângulo isósceles é: $area")
}

fun areaCircun(){
    println("Digite o raio da circunferencia:")
    val raio = readLine()?.toDoubleOrNull() ?: 0.0
    val area = PI * (raio*raio)
    println("A área da circunferência é: $area")
}

fun areaLosan(){
    println("Digite o valor da diagonal maior:")
    val DMaior = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o valor da diagonal menor:")
    val DMenor = readLine()?.toDoubleOrNull() ?: 0.0
    val area = (DMaior*DMenor) / 2
    println("A área da circunferência é: $area")
}

fun areaTrap(){
    println("Digite o valor da base maior:")
    val BMaior = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o valor da base menor:")
    val BMenor = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o valor da altura:")
    val alt = readLine()?.toDoubleOrNull() ?: 0.0
    val area = ((BMaior + BMenor) * alt) / 2
    println("A área da circunferência é: $area")
}