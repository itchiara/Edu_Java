package esercizio0302;

public class Pair <T1, T2>{ //creo classe generics coppia di due tipi che, per il compilatore, lavora con Object
	private T1 first;
	private T2 second;
	
	public Pair(T1 first, T2 second) {
		this.first = first;
		this.second = second;
	}
	
	public T1 getFirst() {
		return first;
	}
	
	public T2 getSecond() {
		return second;
	}
}
