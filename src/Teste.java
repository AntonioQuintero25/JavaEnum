
public class Teste {
	public static void main(String[] args) {
		 
//		Thread t = new Thread(() -> System.out.println("Rodando ..."));
//		
//		t.setPriority(Thread.MAX_PRIORITY);
//		
//		t.start();
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());
		
	}
}
