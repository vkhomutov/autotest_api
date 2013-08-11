package utils;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.json.JSONObject;

import java.io.*;
import java.util.List;


public class Enviroment {

    public static DefaultHttpClient createDefaultClient(){
        BasicHttpParams params = new BasicHttpParams();
        DefaultHttpClient client = new DefaultHttpClient(params);
        return client;
    }


    //TODO refactor !!!
    public static  DefaultHttpClient getAuthClient(String user, String password){
        try {
            DefaultHttpClient client = createDefaultClient();
            HttpPost requestAuth = new HttpPost("http://37.139.9.71:8082/back/auth/login");
            requestAuth.setEntity(new StringEntity("login=" + user + "&password=" + password));
            requestAuth.setHeader("Content-Type","application/x-www-form-urlencoded");
            HttpResponse response = client.execute(requestAuth);
            requestAuth.abort();
            return client;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static HttpPost createPOSTRequest(String url){
        HttpPost request = new HttpPost(url);
        return request;
    }

    public static HttpGet createGETRequest (String url, String...params){
        HttpGet request = new HttpGet(Utils.createLink(url,params));
        return request;
    }

    public static HttpOptions createOPTIONSRequest (String url){
        HttpOptions request = new HttpOptions(url);
        return request;
    }

    public static HttpPut createPUTRequest(String url){
        HttpPut request = new HttpPut(url);
        return request;
    }

    public static HttpDelete createDELETERequest (String url){
        HttpDelete request = new HttpDelete(url);
        return request;
    }

    public static HttpRequest setHeadersRequest(HttpRequest request, String...headers){
        if(headers == null || headers.length == 0){
            return request;
        }
        return setHeader(request, headers);
    }

    private static HttpRequest setHeader(HttpRequest request, String...headers){
        for(String header :headers){
            String[] paramHeader = header.split(":");
            request.setHeader(paramHeader[0], paramHeader[1]);
        }
        return request;
    }

    public static HttpEntityEnclosingRequestBase setEntityRequest(HttpEntityEnclosingRequestBase request, String bodyRequest){
        try {
            request.setEntity(new StringEntity(bodyRequest));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return request;
    }



    public static List<String> getResponceRequest(HttpUriRequest request){
        try {
            HttpResponse response = createDefaultClient().execute(request);
            InputStream input  = response.getEntity().getContent();
            List<String> listResponse = CharStreams.readLines(new InputStreamReader(input, Charsets.UTF_8));
             return listResponse;

        } catch (Throwable e) {
            return null;
        }
    }

    public static List<String> getAuthResponceRequest(HttpUriRequest request, String user, String password){
        try {
            HttpResponse response = getAuthClient(user, password).execute(request);
            request.abort();
            InputStream input  = response.getEntity().getContent();
            return CharStreams.readLines(new InputStreamReader(input, Charsets.UTF_8));
        } catch (Throwable e) {
            return null;
        }
    }



}
