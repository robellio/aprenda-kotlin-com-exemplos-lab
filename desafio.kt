// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {
    BASICO, INTERMEDIARIO, AVANCADO
}

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome.toString()} matriculado na formação $nome $nivel")
    }
}

fun main() {
   
    val conteudo1 = ConteudoEducacional("Fundamentos da Linguagem", 120)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 180)
    val conteudo3 = ConteudoEducacional("Programação Orientada a Objetos", 240)

    val formacao = Formacao("Python Developer", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))

    val usuario1 = Usuario("Thiago")
    val usuario2 = Usuario("Jhonas")
    val usuario3 = Usuario("Felipe")
    val usuario4 = Usuario("Henrique")

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
    formacao.matricular(usuario4)
    
	println()
    println("Usuários inscritos na formação:\n")
    for (usuario in formacao.inscritos) {
        println(usuario.nome)
    }
}
