// Prática sobre desvio condicional usando "CASE".
// Sérgio Pires (slpires@slpires.com)

programa
{
	
	funcao inicio()
	{
		escreva("Escolha uma das opções a seguir:" + "\n" + "1 - Netflix" + "\n" + "2 - Amazon Prime" + "\n" + "3 - HBO" + "\n")
		
		inteiro menu = 0
		leia(menu)
		escolha(menu) {
			
			caso 1:
			escreva("Iniciando Netflix...")
			pare

			caso 2:
			escreva("Iniciando Amazon Prime...")
			pare

			caso 3:
			escreva("Iniciando HBO...")
			pare

			caso contrario:
			escreva("\n" + "Nenhuma das opções listadas anteriormente foi escolhida. Favor verificar.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */