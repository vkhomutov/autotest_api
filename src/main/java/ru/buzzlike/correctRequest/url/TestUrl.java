package ru.buzzlike.correctRequest.url;


import org.apache.http.client.methods.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Enviroment;
import utils.Utils;

import java.util.List;


public class TestUrl {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpOptions requestOptions;
    private HttpGet requestGet;
    private HttpPut requestPut;
    private HttpDelete requestDelete;


    @BeforeClass
    @Parameters({"url","userYuriy", "passwordYuriy"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/url";
        USER = user;
        PASSWORD = password;
    }


    //url get
    @Test
    @Parameters({})
    public void correctGetAllUrlsUser(){

        //create correct request
        requestGet = Enviroment.createGETRequest(URL);
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
    }

/*    //url post
    @Test
    public void correctRefreshAllImages(){

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL);
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(id));
        List<String> response = Enviroment.getAuthResponceRequest(requestPost, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    */

    /*//combos/{comboId}/urls options
    @Test
    @Parameters({"urlAuth"})
    public void correctOptionsImages(String urlAuth){

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + COMBO_ID + "/urls");
        response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
