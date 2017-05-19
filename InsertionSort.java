package TopicosBasicos;
/*
 * 	Algoritmo de ordena��o por inser��o
 * 	INSERTION SORT
 * 	Data(18/05/2017)
 * 	by Isaque Henriques
 * */
public class InsertionSort {
	public static void main(String[] args) {
		
		int numeros[] = {23,56,43,14,78,99,76,43},aux,chave,i; // Vetor e variaveis( os vetores se conta do Zero)
		// Loop for
		for(i = 1;i < numeros.length;i++){	// i recebe 1 e esse for vai rodar at� o tamanho do vetor(Que � definido pelo ,length)
			chave = numeros[i];				// x recebe o numero do vetor que est� na posi��o 1
			aux = i - 1;					// aux recebe o i - 1 que � 0
			//Loop While
			while(aux >= 0 && chave < numeros[aux]){ 	//Enquanto x < numeros na posi��o aux(que � o primeiro elemento) fa�a	
				numeros[aux+1] = numeros[aux];		// numeros na posi��o aux+1 recebe numeros na posi��o aux
				aux -= 1; 			// aux agora recebe ele mesmo menos 1
			}
			numeros[aux+1] = chave; /* Agora na posi��o em que estava o numero maoir, aquela chave que serve para armazenar
									 o valor que na linha 14 foi perdido � armazenado.*/
		}
		//Loop for para mostrar os valores do vetor numeros
		for(i = 0;i< numeros.length;i++){
			System.out.print("-"+numeros[i]);
		}
	}
}