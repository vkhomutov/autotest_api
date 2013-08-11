package utils;


import org.apache.http.client.methods.*;

import java.util.List;


//wtf????
public class InCorrectTypeRequest {

    private static List<String> responseGET;
    private static List<String> responsePUT;
    private static List<String> responseDELETE;


   /* public static boolean checkPOSTRequest(String url, String answer, String...params ){
        if(params == null || params.length == 0){

            responseGET =  Enviroment.getResponceRequest(getGETRequest(url));
            responsePUT = Enviroment.getResponceRequest(getPUTReaquest(url));
            responseDELETE = Enviroment.getResponceRequest(getDELETERequest(url));

        }
        responseGET =  Enviroment.getResponceRequest(getGETRequest(url, user, password));
        responsePUT = Enviroment.getResponceRequest(getPUTReaquest(url,user, password));
        responseDELETE = Enviroment.getResponceRequest(getDELETERequest(url));
        return checkResponse(responseGET, answer)||checkResponse(responseDELETE, answer)||checkResponse(responsePUT, answer);
    }

    /*public static boolean checkGETRequest(String url, String answer, String...params){
        List<String> responsePOST =  Enviroment.getResponceRequest(getPOSTRequest(url, user, password));
        List<String> responsePUT = Enviroment.getResponceRequest(getPUTReaquest(url,user, password));
        List<String> responseDELETE = Enviroment.getResponceRequest(getDELETERequest(url));
        return checkResponse(responsePOST, answer)||checkResponse(responseDELETE, answer)||checkResponse(responsePUT, answer);
    }

    public static boolean checkPUTRequest(String url, String answer, String user, String password){
        List<String> responsePOST =  Enviroment.getResponceRequest(getPOSTRequest(url, user, password));
        List<String> responseGET = Enviroment.getResponceRequest(getGETRequest(url, user, password));
        List<String> responseDELETE = Enviroment.getResponceRequest(getDELETERequest(url));
        return checkResponse(responsePOST, answer)||checkResponse(responseDELETE, answer)||checkResponse(responseGET, answer);
    }*/


    private static boolean checkResponse(List<String> response, String parameter){
        if(response.toString().contains(parameter)){
            return true;
        }
        return false;
    }

    private static HttpGet getGETRequest(String url, String user, String password){
        return Enviroment.createGETRequest(url, user, password);
    }

    private static HttpDelete getDELETERequest(String url){
        return Enviroment.createDELETERequest(url);
    }

    private static HttpPost getPOSTRequest(String url, String user, String password){
        return (HttpPost) Enviroment.setEntityRequest(Enviroment.createPOSTRequest(url), Utils.createBodyRequest(user, password));
    }

    private static HttpPut getPUTReaquest(String url, String...params){
        if(params == null || params.length == 0){

       // return (HttpPut) Enviroment.setEntityRequest(Enviroment.createPUTRequest(url), Utils.createBodyRequest(user, password));
        }
        return null;
    }
}
