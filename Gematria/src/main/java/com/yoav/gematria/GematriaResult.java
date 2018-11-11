package com.yoav.gematria;

public class GematriaResult {

	private int result;
	private int smallResult;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getSmallResult() {
		return smallResult;
	}
	public void setSmallResult(int smallResult) {
		this.smallResult = smallResult;
	}
	@Override
	public String toString() {
		return "GematriaResult [result=" + result + ", smallResult=" + smallResult + "]";
	}
	
	
}
