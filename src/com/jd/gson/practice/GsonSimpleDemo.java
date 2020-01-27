package com.jd.gson.practice;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

public class GsonSimpleDemo {
	static Gson gson = new Gson();

	public static void main(String arg[]) {
		JsonObject jsonObject = serialization();
		deserialization(jsonObject);
	}

	private static void deserialization(JsonObject jsonObject) {

		Student std = gson.fromJson(jsonObject.toString(), Student.class);
		Student stdStudent= gson.fromJson(std.toString(), Student.class);
		List<Address> students = gson.fromJson(stdStudent.getAddresses().toString(), new TypeToken<ArrayList<Address>>() {
		}.getType());
		students.stream().forEach(student -> {
			System.out.println("Deserlization ");
			System.out.println(student.getAddress());
		});

	}

	private static JsonObject serialization() {
		JsonObject mainJsonObject = new JsonObject();
		List<Address> addresses = new ArrayList<>();
		addresses.add(new Address("First"));
		addresses.add(new Address("Second"));
		Student student = new Student(1, "Alice", addresses);
		mainJsonObject.addProperty("student", student.toString());
		System.out.println(mainJsonObject);
		return mainJsonObject;

	}

}
