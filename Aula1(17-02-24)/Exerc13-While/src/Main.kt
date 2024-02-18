fun main(args: Array<String>){
    var opcao: Int = 0
    while(opcao != -1){
        val line = readLine() ?: "0" ///const
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opcao $opcao")
    }
    println("Até a proxima")
}