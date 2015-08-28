package br.ufc.lsbd.bcl.nn.algorithm;

import java.util.List;

import br.ufc.lsbd.bcl.nn.entity.Iris;

public class Nn {
	
	private List<Iris> sampleList;
	
	public Nn(List<Iris> sampleList) {
		this.sampleList = sampleList;
	}
	
	public Iris nextNeighbor(Iris irisToClassify) {
		//System.out.println("finding the nn for " + irisToClassify);
		Iris irisMin = sampleList.get(0);
		double distance = irisToClassify.calcularDistancia(irisMin); 
		for (Iris iris : sampleList) {
			double distanceAux = irisToClassify.calcularDistancia(iris);
			if (distanceAux < distance) {
				distance = distanceAux;
				irisMin = iris;
			}
		}
		
		return irisMin;
	}

}
