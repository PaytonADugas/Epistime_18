package edu.westmont.cs030;

public class Triple<S1, S2, S3> {
	private S1 s1;
	private S2 s2;
	private S3 s3;
	
	Triple(S1 s1, S2 s2, S3 s3){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	public void setFirst(S1 s1) {
		this.s1 = s1;
	}
	
	public void setSecond(S2 s2) {
		this.s2 = s2;
	}
	
	public void setThird(S3 s3) {
		this.s3 = s3;
	}
	
	public S1 getFirst() {
		return s1;
	}
	
	public S2 getSecond() {
		return s2;
	}
	
	public S3 getThird() {
		return s3;
	}
}
