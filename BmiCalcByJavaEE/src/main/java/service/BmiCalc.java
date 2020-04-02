package service;

import javax.ejb.Stateless;

@Stateless
public class BmiCalc {
	public double calcBmi(double height, double weight) {
		return (double)Math.round(weight / (height * height) * 10) / 10;
	}
}
