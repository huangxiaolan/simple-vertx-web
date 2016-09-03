package com.hxiaol.simple;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

public class StartWeb {

	public static void main(String[] args) {
		Vertx vertx=Vertx.factory.vertx();
		
		HttpServer server=vertx.createHttpServer();
		Router mainRouter = Router.router(vertx);
		mainRouter.route().handler(StaticHandler.create().setCachingEnabled(false));
		
		server.requestHandler(mainRouter::accept).listen(13000);

	}

}
