package ru.buzzlike.security;


import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.testng.annotations.Test;
import utils.Enviroment;
import java.util.List;

public class TestSimpleSecurity {

   /* private HttpGet requestGet;
    private HttpPost requestPost;
    private HttpPut requestPut;
    private HttpDelete requestDelete;


    @Test (dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listUrlForGet")
    public void testForAllGetRequest(String url){

        //create request
        requestGet = Enviroment.createGETRequest(url);
        List<String> response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    @Test (dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listUrlForPost")
    public void testForAllPostRequest(String url, String body){

        //create request
        requestPost = Enviroment.createPOSTRequest(url);
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, body);
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    @Test (dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listUrlForPut")
    public void testForAllPutRequest(String url, String body){

        //create request
        requestPut = Enviroment.createPUTRequest(url);
        requestPut = (HttpPut) Enviroment.setEntityRequest(requestPost, body);
        List<String> response  = Enviroment.getResponceRequest(requestPut);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");

    }

    @Test (dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listUrlForDelete")
    public void testForAllDeleteRequest(String url){

        //create request
        requestDelete = Enviroment.createDELETERequest(url);
        List<String> response  = Enviroment.getResponceRequest(requestDelete);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");

    }*/
}
