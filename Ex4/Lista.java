package Ex4;

public class Lista {
    No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);
		if(inicio==null)
		{
			inicio=aux;
			fim=aux;

		}else if(aux.dado<inicio.dado)
		{
			inicio.esq=aux;
			aux.dir=inicio;
			inicio=aux;

		}else if(aux.dado>=fim.dado)
		{
			fim.dir = aux;
			aux.esq = fim;
			fim=aux;
			
		}else
		{
			No aux2=inicio;
			while(aux2!=null)
			{
				if(aux.dado<aux2.dado)
				{
					aux2.esq.dir=aux;
					aux.dir=aux2;
					aux.esq=aux2.esq;	
					aux2.esq=aux;
					break;
				}
				aux2=aux2.dir;
			}
		}
		
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
    
}
