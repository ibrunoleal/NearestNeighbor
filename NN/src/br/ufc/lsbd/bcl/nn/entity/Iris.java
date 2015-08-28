package br.ufc.lsbd.bcl.nn.entity;

public class Iris {
	
	private double sepalLength;
	
	private double sepalWidth;
	
	private double petalLength;
	
	private double petalWidth;
	
	private String classification;

	public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, String classification) {

		this.sepalLength = sepalLength;
		this.sepalWidth = sepalWidth;
		this.petalLength = petalLength;
		this.petalWidth = petalWidth;
		this.classification = classification;
	}
	
	public double calcularDistancia(Iris outra) {
		double d1 = Math.pow((this.sepalLength - outra.getSepalLength()),2);
		double d2 = Math.pow((this.sepalWidth - outra.getSepalWidth()),2);
		double d3 = Math.pow((this.petalLength - outra.getPetalLength()),2);
		double d4 = Math.pow((this.getPetalWidth() - outra.getPetalWidth()),2);
		double dTotal = d1 + d2 + d3 + d4;
		
		double distanciaEuclidianda = Math.sqrt(dTotal);
		
		return distanciaEuclidianda;
	}

	
	

	public double getSepalLength() {
		return sepalLength;
	}

	public void setSepalLength(double sepalLength) {
		this.sepalLength = sepalLength;
	}

	public double getSepalWidth() {
		return sepalWidth;
	}

	public void setSepalWidth(double sepalWidth) {
		this.sepalWidth = sepalWidth;
	}

	public double getPetalLength() {
		return petalLength;
	}

	public void setPetalLength(double petalLength) {
		this.petalLength = petalLength;
	}

	public double getPetalWidth() {
		return petalWidth;
	}

	public void setPetalWidth(double petalWidth) {
		this.petalWidth = petalWidth;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		return "[" + sepalLength + ", " + sepalWidth + ", " + petalLength
				+ ", " + petalWidth + ", " + classification + "]";
	}
	
	

}
