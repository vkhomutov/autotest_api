package ru.buzzlike.correctRequest.combos.combId.tags;


import org.apache.http.client.methods.HttpDelete;
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

public class TestTags {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpGet requestGet;
    private HttpDelete requestDelete;
    private HttpOptions requestOptions;


    @BeforeClass
    @Parameters({"url","userYuriy", "passwordYuriy"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/combs";
        USER = user;
        PASSWORD = password;
    }


    //combos/{comboId}/tags get
    @Test
    @Parameters({"combsId", "error"})
    public void correctGetAllTagsInCombs(String combsId, String error) {

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + combsId + "/tags");
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, error), "Fail error parameter");
    }

   /* //combos/{comboId}/tags post
    @Test
    @Parameters({"urlAuth", "tagValue"})
    public void correctRefreshTags(String urlAuth, String tagValue){

        //auth
        requestPost = TestUtlis.authorization(urlAuth, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + COMBO_ID + "/tags");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(tagValue));
        response = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");

    }

    //combos/{comboId}/tags delete
    @Test
    @Parameters({"urlAuth"})
    public void correctDeleteTags(String urlAuth){

        //auth
        requestPost = TestUtlis.authorization(urlAuth, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + COMBO_ID + "/tags");
        response = Enviroment.getResponceRequest(requestDelete);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");

    }

    //combos/{comboId}/tags options
    @Test
    @Parameters({"urlAuth"})
    public void correctOptionsTags(String urlAuth){

        //auth
        requestPost = TestUtlis.authorization(urlAuth, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + COMBO_ID + "/tags");
        response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
