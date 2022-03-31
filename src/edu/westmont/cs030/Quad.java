package edu.westmont.cs030;

public class Quad<T1, T2, T3, T4> {
	private T1 t1;
	private T2 t2;
	private T3 t3;
	private T4 t4;
	
	Quad(T1 t1, T2 t2, T3 t3, T4 t4){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
	}
	
	public void setFirst(T1 t1) {
		this.t1 = t1;
	}
	
	public void setSecond(T2 t2) {
		this.t2 = t2;
	}
	
	public void setThird(T3 t3) {
		this.t3 = t3;
	}
	
	public void setFourth(T4 t4) {
		this.t4 = t4;
	}
	
	public T1 getFirst() {
		return t1;
	}
	
	public T2 getSecond() {
		return t2;
	}
	
	public T3 getThird() {
		return t3;
	}
	
	public T4 getFourth() {
		return t4;
	}
}
