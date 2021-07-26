// Matrizes e Vetores.
// Sérgio Pires (slpires@slplires.com)

programa
{
	
	funcao inicio()
	{
		cadeia frutas[4] // Exemplo de Vetor.
		inteiro contador = 0
		frutas[0] = "Maçã"
		frutas[1] = "Pera"
		frutas[2] = "Uva"
		frutas[3] = "Abacaxi"
		faca {
			escreva(frutas[contador] + "\n")
			contador++
		}enquanto (contador <=3)

		contador = 0
		faca {
			cadeia cesta[][] = {{"Maçã","100"}, {"Pera","200"}, {"Uva","300"}, {"Abacaxi","400"}} // Exemplo de Matriz.
			escreva("\n" + "Fruta: " + cesta[contador][0] + " >>> quantidade = " + cesta[contador][1])
			contador++
		}enquanto (contador <=3)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 21; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */