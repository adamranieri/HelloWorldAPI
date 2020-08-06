package dev.ranieri.app;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class App {
	
	public static void main(String[] args) {
		Javalin app = Javalin.create().start(7000);
		
		Handler hello = (ctx) ->{
			
			String greeting = "<h1>Hello Everyone v2</h1>";
			ctx.html(greeting);
		};
		
		
		app.get("/hello", hello);
		
	}
}
