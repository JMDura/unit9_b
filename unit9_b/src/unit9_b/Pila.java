package unit9_b;

public class Pila {
	private int[] pila;
	private int cima;
	private static final int MAXTAM = 5;
	public Pila(){
		this(MAXTAM);
	}
	public Pila(int maxtam2) {
		pila = new int[maxtam2];
		cima = -1;
	}
	public boolean estaVacia(){
		if(cima == -1)return true;
		return false;
	}
	public boolean estaLlena(){
            System.out.println(cima);
		if(cima+1 == pila.length) return true;
		return false;
	}
	public void apilar(int valor){
		pila[++cima] = valor;
	}
	public int desapilar(){
		return pila[cima--];
	}
	public void vaciar(){
		cima = -1;
	}
}