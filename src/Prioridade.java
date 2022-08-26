
public enum Prioridade {

	MIN(1),NORMAL(5),MAX(10);
	
	//Também podemos ter nomes em Enum
	
//	public String getNome() {
//		return "Prioridade";
//	}
	
	private int valor;
	
	Prioridade(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
}
