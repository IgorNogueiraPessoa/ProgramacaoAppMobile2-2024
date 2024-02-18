fun main(args: Array<String>){
    print("O menor valor é ${min(3,4)}") //NA FUNCAO main temos duas variaveis declaradas A e B
}
fun min(a: Int, b: Int): Int{
    return if (a<b) a else b
} //na funcao min temos duas variaveis sendo comparadas e mostrar a menor