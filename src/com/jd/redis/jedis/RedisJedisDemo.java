package com.jd.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisJedisDemo {
	public static void main(String arg[]) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		System.out.println("Server is running: " + jedis.set("save", "Hello Jedis!!!"));
		System.out.println("Server is running: " + jedis.get("save"));
	}
}
