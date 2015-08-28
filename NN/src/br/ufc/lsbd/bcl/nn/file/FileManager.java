package br.ufc.lsbd.bcl.nn.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.ufc.lsbd.bcl.nn.entity.Iris;

public class FileManager {

	public FileManager() {

	}

	public List<Iris> lerListaDeEntrada(String arquivo) {

		List<Iris> listaDeEntrada = new ArrayList<Iris>();
		FileReader fileReader;
		try {
			fileReader = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fileReader);
			
			String linha = br.readLine();
			while (linha != null) {
				String[] atributos = linha.split(",");
				float sepalLength = Float.parseFloat(atributos[0]);
				float sepalWidth = Float.parseFloat(atributos[1]);
				float petalLength = Float.parseFloat(atributos[2]);
				float petalWidth = Float.parseFloat(atributos[3]);
				String classification = atributos[4];
				Iris flower = new Iris(sepalLength, sepalWidth, petalLength, petalWidth, classification);
				listaDeEntrada.add(flower);
				linha = br.readLine();
			}
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listaDeEntrada;
	}

}
