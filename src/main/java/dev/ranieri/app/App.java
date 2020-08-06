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
		
		Handler hola = (ctx)->{
			String saludo = "<h1>Hola Todos</h1>";
			ctx.html(saludo);
		};
		
		app.get("/hello", hello);
		app.get("/hola", hola);
		
	}
}
