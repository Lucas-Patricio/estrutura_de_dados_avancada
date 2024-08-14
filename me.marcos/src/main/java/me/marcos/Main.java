package me.marcos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		try {
			String conteudo = new String(Files.readAllBytes(new File("D:\\estrutura_de_dados_avançada\\me.marcos\\src\\main\\java\\me\\marcos\\tibia.json").toPath()));
			JSONObject jsonObject = new JSONObject(conteudo);
			JSONObject worldsObject = jsonObject.getJSONObject("worlds");
			JSONArray regularWorldsArray = worldsObject.getJSONArray("regular_worlds");
			WorldData[] worldDataArray = new WorldData[regularWorldsArray.length()];
			
			for(int i = 0; i < regularWorldsArray.length(); i++) {
				JSONObject worldObject = regularWorldsArray.getJSONObject(i); 
				int playersOnline = worldObject.getInt("players_online");
				worldDataArray[i] = new WorldData(playersOnline);
			}
			MergeSort mergeSort = new MergeSort();
			
			mergeSort.mergeSort(worldDataArray, 0, worldDataArray.length - 1);
			
			for(WorldData data: worldDataArray) { //todo dado do tipo WorldData dendo do array worldDataArray será pego e feito alguma ação
				System.out.println("Players Online: " + data.getPlayersOnline());
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
