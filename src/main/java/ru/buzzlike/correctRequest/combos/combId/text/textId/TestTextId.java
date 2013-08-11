package ru.buzzlike.correctRequest.combos.combId.text.textId;


import org.apache.http.client.methods.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;

import java.util.List;

public class TestTextId {

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

        URL = url + "/combs/";
        USER = user;
        PASSWORD = password;
    }


    /*//combos/{comboId}/text/{textId} delete
    @Test
    @Parameters({})
    public void correctDeleteText(){

        //create new text in combs

        //get parameter idText

        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + COMBO_ID + "/text/" + TEXT_ID);
        response = Enviroment.getResponceRequest(requestDelete);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/

    /*//combos/{comboId}/text/{textId} options
    @Test
    @Parameters({"urlAuth"})
    public void correctOptions(String urlAuth){

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + COMBO_ID + "/text/" + TEXT_ID);
        List<String> response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
