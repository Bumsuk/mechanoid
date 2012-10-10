package com.mechanoid.net;


import com.robotoworks.mechanoid.net.Parser;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.Response;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.ClientProtocolException;
import android.net.Uri;

public class EchoParamsRequest {
	
	private static final String PATH="/echoParams";
	
	private String aParam;
	private boolean aParamSet;
	private boolean bParam;
	private boolean bParamSet;
	private double cParam;
	private boolean cParamSet;
	private int dParam;
	private boolean dParamSet;
	private long eParam;
	private boolean eParamSet;
		
	public void setAParam(String value) {
		this.aParam = value;
		this.aParamSet = true;
	}
	
	public boolean isAParamSet() {
		return aParamSet;
	}
	public void setBParam(boolean value) {
		this.bParam = value;
		this.bParamSet = true;
	}
	
	public boolean isBParamSet() {
		return bParamSet;
	}
	public void setCParam(double value) {
		this.cParam = value;
		this.cParamSet = true;
	}
	
	public boolean isCParamSet() {
		return cParamSet;
	}
	public void setDParam(int value) {
		this.dParam = value;
		this.dParamSet = true;
	}
	
	public boolean isDParamSet() {
		return dParamSet;
	}
	public void setEParam(long value) {
		this.eParam = value;
		this.eParamSet = true;
	}
	
	public boolean isEParamSet() {
		return eParamSet;
	}
		
	public EchoParamsRequest(){
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		if(aParamSet){
			uriBuilder.appendQueryParameter("a", aParam);
		}
		if(bParamSet){
			uriBuilder.appendQueryParameter("b", String.valueOf(bParam));
		}
		if(cParamSet){
			uriBuilder.appendQueryParameter("c", String.valueOf(cParam));
		}
		if(dParamSet){
			uriBuilder.appendQueryParameter("d", String.valueOf(dParam));
		}
		if(eParamSet){
			uriBuilder.appendQueryParameter("e", String.valueOf(eParam));
		}
		
		return uriBuilder.toString();			
	}
	
	protected Response<EchoParamsResponse> execute(String baseUrl, ServiceClient client, TransformerProvider transformerProvider)
		throws ClientProtocolException, IOException {
			
		String url = createUrl(baseUrl);
		
		final TransformerProvider tp = transformerProvider;
		
		Parser<EchoParamsResponse> parser = new Parser<EchoParamsResponse>() {
			public EchoParamsResponse parse(InputStream inStream) throws TransformException {
				return new EchoParamsResponse(tp, inStream);
			}

		};
		
		return new Response<EchoParamsResponse>(client.getJson(url), parser);
	}
}	
