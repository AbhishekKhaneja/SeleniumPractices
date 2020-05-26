package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class client {

	public void getmethod(String URL) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet Httpget = new HttpGet(URL);// Httpget request method
		try {
			CloseableHttpResponse closeablehttpresponse = httpClient.execute(Httpget);// hit the GET URL

			//statusCode
			int Statuscode = closeablehttpresponse.getStatusLine().getStatusCode();
			System.out.println(Statuscode);

			//JSOnString
			String responsestring = EntityUtils.toString(closeablehttpresponse.getEntity(), "UTF-8");

			JSONObject J = new JSONObject(responsestring);

			System.out.println(J);
            //allheaders
			Header[] headerarray = closeablehttpresponse.getAllHeaders();

			HashMap<String, String> allHeaders = new HashMap<String, String>();

			for (Header header : headerarray) {
				allHeaders.put(header.getName(), header.getValue());
			}

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
