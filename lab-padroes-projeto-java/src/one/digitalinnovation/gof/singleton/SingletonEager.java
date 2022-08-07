package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author falvojr
 */
public class SingletonEager {
	//já instancia para que quando precisar ja esteja pronto
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
