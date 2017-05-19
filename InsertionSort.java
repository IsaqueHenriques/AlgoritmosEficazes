package TopicosBasicos;
/*
 * 	Algoritmo de ordenação por inserção
 * 	INSERTION SORT
 * 	Data(18/05/2017)
 * 	by Isaque Henriques
 * */
public class InsertionSort {
	public static void main(String[] args) {
		
		int numeros[] = {23,56,43,14,78,99,76,43},aux,chave,i; // Vetor e variaveis( os vetores se conta do Zero)
		// Loop for
		for(i = 1;i < numeros.length;i++){	// i recebe 1 e esse for vai rodar até o tamanho do vetor(Que é definido pelo ,length)
			chave = numeros[i];				// x recebe o numero do vetor que está na posição 1
			aux = i - 1;					// aux recebe o i - 1 que é 0
			//Loop While
			while(aux >= 0 && chave < numeros[aux]){ 	//Enquanto x < numeros na posição aux(que é o primeiro elemento) faça	
				numeros[aux+1] = numeros[aux];		// numeros na posição aux+1 recebe numeros na posição aux
				aux -= 1; 			// aux agora recebe ele mesmo menos 1
			}
			numeros[aux+1] = chave; /* Agora na posição em que estava o numero maoir, aquela chave que serve para armazenar
									 o valor que na linha 14 foi perdido é armazenado.*/
		}
		//Loop for para mostrar os valores do vetor numeros
		for(i = 0;i< numeros.length;i++){
			System.out.print("-"+numeros[i]);
		}
	}
}