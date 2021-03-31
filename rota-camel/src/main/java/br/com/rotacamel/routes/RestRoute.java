package br.com.rotacamel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

@Component
public class RestRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		
		restConfiguration().host("localhost:8080").component("http");
		
		from("timer:scheduler?period=5000")
		
			.setHeader(Exchange.HTTP_METHOD).constant(HttpMethod.GET).
			
		to("rest:get:/webservices/ebook/item").
			log("${body}");
		
	}
}
