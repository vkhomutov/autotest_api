package ru.buzzlike.correctRequest.text.textId;


import org.apache.http.client.methods.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;
import utils.Utils;

import java.util.List;

public class TestTextId {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpGet requestGet;
    private HttpDelete requestDelete;
    private HttpOptions requestOptions;
    private HttpPut requestPUT;

    @BeforeClass
    @Parameters({"url","user", "password"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/text/";
        USER = user;
        PASSWORD = password;
    }


    //text/{textId} get
    @Test
    @Parameters({"textId", "idText", "valueText", "localization", "userId", "error"})
    public void correctGetTextUser(String textId, String idText, String valueText, String localization,
                                   String userId, String error) {

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + textId);
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, idText), "Fail \"idText\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, valueText), "Fail \"valueText\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, localization), "Fail \"localization\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, userId), "Fail \"userId\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, error), "Fail \"error\" parameter ");
    }

    /*//text/{textId} delete
    @Test
    public void correctDeleteTextUser() {

        //create new text for user

        //get textId parameter for user

        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + TEXT_ID);
        List<String> response = Enviroment.getResponceRequest(requestDelete);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //text/{textId} options
    @Test
    public void correctOptionsText() {

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + TEXT_ID);
        List<String> response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //text/{textId} put
    @Test
    //@Parameters({"urlAuth"})
    public void correctReplacementText() {

        //create new text

        //get parameter idText

        //create correct request
        requestPUT = Enviroment.createPUTRequest(URL + TEXT_ID);
        requestPUT = (HttpPut) Enviroment.setEntityRequest(requestPUT, Utils.createBodyRequest(TEXT));
        response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
