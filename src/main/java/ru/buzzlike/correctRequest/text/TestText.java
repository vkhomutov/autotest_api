package ru.buzzlike.correctRequest.text;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
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
    private HttpGet requestGet;
    private HttpOptions requestOptions;

    @BeforeClass
    @Parameters({"url","userYuriy", "passwordYuriy"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/text";
        USER = user;
        PASSWORD = password;
    }


    //text get
    @Test
    @Parameters({ "idText", "valueText", "localization", "userId", "error"})
    public void correctGetAllTextUser(String idText, String valueText, String localization,
                                      String userId, String error) {

        //create correct request
        requestGet = Enviroment.createGETRequest(URL);
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, idText), "Fail \"idText\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, valueText), "Fail \"valueText\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, localization), "Fail \"localization\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, userId), "Fail \"userId\" parameter ");
        Assert.assertTrue(Utils.checkResponse(response, error), "Fail \"error\" parameter ");
    }

    /*//text post
    @Test
    //@Parameters({"urlAuth"})
    public void correctCreateTextUser() {

        //create new text

        //get idText parameter

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL);
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(TEXT));
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //text options
    @Test
    public void correctOptionsText() {

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL);
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
