package ru.buzzlike.correctRequest.combos.combId.text;


import org.apache.http.client.methods.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;
import utils.Utils;

import java.util.List;

public class TestText {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpOptions requestOptions;
    private HttpGet requestGet;
    private HttpPut requestPut;
    private HttpDelete requestDelete;


    @BeforeClass
    @Parameters({"url","user", "password"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/combs";
        USER = user;
        PASSWORD = password;
    }

    //combos/{comboId}/text get
    @Test
    @Parameters({"combsId", "idText", "valueText", "localization", "userId", "error"})
    public void correctGetAllTextInCombs(String combsId, String idText, String valueText, String localization,
                                         String userId, String error){

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + combsId + "/text");
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, idText), "Fail \"idText\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, valueText), "Fail \"valueText\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, localization), "Fail \"localization\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, userId), "Fail \"userId\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, error), "Fail \"error\" parameter ");
    }

   /* //combos/{comboId}/text options
    @Test
    @Parameters({"combsId"})
    public void correctOptionsText(String combsId){

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + combsId + "/text");
        List<String> response = Enviroment.getResponceRequest(requestOptions);

        System.out.print(response.toString()+"-----------------------");
        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/


   /* //combos/{comboId}/text post
    @Test
    @Parameters({"combsId"})
    public void correctRefreshAllText(String combsId){

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + combsId + "/text");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(id));
        List<String> response = Enviroment.getAuthResponceRequest(requestPost, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //combos/{comboId}/text put
    @Test
    @Parameters({"combsId"})
    public void correctReplacementAllText(String combsId){

        //create correct request
        requestPut = Enviroment.createPUTRequest(URL + combsId + "/text");
        requestPut = (HttpPut) Enviroment.setEntityRequest(requestPut, Utils.createBodyRequest(id));
        List<String> response = Enviroment.getAuthResponceRequest(requestPut, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //combos/{comboId}/text delete
    @Test
    @Parameters({"combsId"})
    public void correctDeleteAllText(String combsId){

        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + combsId + "/text");
        List<String> response = Enviroment.getAuthResponceRequest(requestPut, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/


}
