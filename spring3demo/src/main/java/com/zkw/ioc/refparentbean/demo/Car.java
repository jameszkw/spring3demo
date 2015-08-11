/**
 * 
 */
package com.zkw.ioc.refparentbean.demo;

/**
 * @ClassName: Car
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月9日 下午8:32:21
 *
 */
public class Car {
	private String brand;
	private int masSpeed;
	private double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMasSpeed() {
		return masSpeed;
	}
	public void setMasSpeed(int masSpeed) {
		this.masSpeed = masSpeed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return brand;
	}
	
}
