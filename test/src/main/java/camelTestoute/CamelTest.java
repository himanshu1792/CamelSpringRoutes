package camelTestoute;

import org.apache.camel.Exchange;
import org.json.JSONObject;


public class CamelTest {
	
	public void route(Exchange exchange) {
		
		String name = (String)exchange.getIn().getHeader("name");
		JSONObject returnJson = new JSONObject();
		returnJson.put("name", name);
		exchange.getIn().setBody(returnJson);
		System.out.println(name+"name");
		
	}

}
