package com.careerit.cj.day20;

public class CountDTO {
	private int placedCount;
	private int notPlacedCount;
	
	public CountDTO() {
		super();
	}
	public CountDTO(int placedCount, int notPlacedCount) {
		super();
		this.placedCount = placedCount;
		this.notPlacedCount = notPlacedCount;
	}
	public int getPlacedCount() {
		return placedCount;
	}
	public void setPlacedCount(int placedCount) {
		this.placedCount = placedCount;
	}
	public int getNotPlacedCount() {
		return notPlacedCount;
	}
	public void setNotPlacedCount(int notPlacedCount) {
		this.notPlacedCount = notPlacedCount;
	}
	
}
