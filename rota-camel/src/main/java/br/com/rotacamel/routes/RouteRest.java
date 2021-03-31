package br.com.rotacamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouteRest extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		restConfiguration().host("localhost:8100").component("servlet");
		
		rest("/api") 
	        .get("/trbrasil") 
	        .to("direct:hello");
		
	    from("direct:hello")
	        .to("rest:get:/api/v1/rs?bridgeEndpoint=true");
	   
	    //.log("rest:${body}");
	}

}
