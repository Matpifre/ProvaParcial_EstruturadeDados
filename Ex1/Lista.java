package Ex1;

public class Lista {
    No inicio, fim;
	
	// insere um nó no final da lista. Esse método será chamado pelo método inserir
	private void inserirFim(No aux) {
		if(inicio == null) {
			inicio = aux;
		} else {
			fim.prox = aux;
		}
		fim = aux;
	}
	
	//esse método deverá ser implementado de acordo com o enunciado do exercício
	private void inserirPrioridade(No aux) {
		if(aux.cor.equals("amarelo"))
		{
			No aux2 = inicio;
			No verde=null;
			No amarelo=null;
			if(inicio == null)
			{
				inicio = fim = aux;
			} else if(inicio.cor.equalsIgnoreCase("verde"))
			{
				aux.prox = inicio;
				inicio = aux;
			}else
			{
				while(aux2!=null)
				{
					if(aux2.cor.equalsIgnoreCase("verde"))
					{
						verde = aux2;
						break;
					}
					amarelo = aux2;
					aux2 = aux2.prox;
					
				}
				amarelo.prox = aux;
				aux.prox = verde;	
			}
		}	
		
	}
	
	// método inserir. Esse método será chamado a partir da classe Main
	public void inserir(int numero, String cor) {
		No aux = new No(numero, cor);
		if(cor.equalsIgnoreCase("verde")) {
			inserirFim(aux);
		} else {
			inserirPrioridade(aux);
		}
	}
	
	// método utilizado para imprimir os dados da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.numero);
			aux = aux.prox;
		}
	}
    
}
