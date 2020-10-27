package test.json;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import model.CarDTO;

public class TestJSONArray {
	
	public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<String>();
			list.add("손흥민");
			list.add("음바페");
			list.add("네이마르");
			list.add("메시");
			JSONArray jarr = new JSONArray(list);
			System.out.println(jarr.toString());
			
			
			//ArrayList<CarDTO>
			ArrayList<CarDTO> carList = new ArrayList<CarDTO>();	
			carList.add(new CarDTO("모닝",200));
			carList.add(new CarDTO("테슬라",3000));
			carList.add(new CarDTO("BMW",4000));
			carList.add(new CarDTO("Jeep",1500));
			JSONArray carArray = new JSONArray(carList);
			System.out.println(carArray.toString());
			
			ArrayList<JSONObject> list2 = new ArrayList<JSONObject>();
			for(int i=0;i<3;i++) {
			JSONObject json1 = new JSONObject();
			json1.put("model", "소나타");
			json1.put("price", 200);
			
			list2.add(json1);
			}
			JSONArray jarr2 = new JSONArray(list2);
			System.out.println(jarr2.toString());
	}
}
