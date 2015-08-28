package br.ufc.lsbd.bcl.nn.aplication;

import java.util.List;

import br.ufc.lsbd.bcl.nn.algorithm.Nn;
import br.ufc.lsbd.bcl.nn.entity.Iris;
import br.ufc.lsbd.bcl.nn.file.FileManager;

public class Main {

	public static void main(String[] args) {
		
		FileManager fileManager = new FileManager();
		System.out.println("reading sample data");
		List<Iris> dataSample = fileManager.lerListaDeEntrada("samples.txt");
		System.out.println("sample data size: " + dataSample.size());
		
		System.out.println("reading test data");
		List<Iris> testsSample = fileManager.lerListaDeEntrada("testsamples.txt");
		System.out.println("sample test size: " + testsSample.size());
		
		Nn nn = new Nn(dataSample);
		for (Iris irisTest : testsSample) {
			Iris irisNn = nn.nextNeighbor(irisTest);
			System.out.println("NN: " + irisNn + "\nTest: " + irisTest + "\n");
			
		}

	}

}
