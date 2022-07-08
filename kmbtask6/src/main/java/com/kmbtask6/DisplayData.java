package com.kmbtask6;

import java.util.Hashtable;
import java.util.Map;

import org.json.simple.JSONObject;

public class DisplayData {
	public static JSONObject display(int Id) {
		Hashtable<Integer, GetEmployeeDetails> ht = new Hashtable<Integer, GetEmployeeDetails>();
		System.out.println("Creating Employee Details");
		GetEmployeeDetails gmd = new GetEmployeeDetails("Ajith", "ContractEmployee", 101, 50000);
		GetEmployeeDetails gmd1 = new GetEmployeeDetails("vijay", "PermanentEmployee", 102, 60000);
		GetEmployeeDetails gmd2 = new GetEmployeeDetails("Surya", "TemporaryEmployee", 103, 20000);
		ht.put(101, gmd);
		ht.put(102, gmd1);
		ht.put(103, gmd2);

		JSONObject obj = new JSONObject();

		for (Map.Entry<Integer, GetEmployeeDetails> entry : ht.entrySet()) {
			int key = entry.getKey();
			if (key == Id) {
				GetEmployeeDetails ged = ht.get(Id);
				obj.put("ID", ged.Id);
				obj.put("NAME", ged.Name);
				obj.put("SALARY", ged.Salary);
				obj.put("TYPE", ged.Type);
				System.out.println(obj);
				
			}
	}
	
return obj;
}
}