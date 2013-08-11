package ru.buzzlike.correctRequest.combos.combId.images;


import org.apache.http.client.methods.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;
import utils.Utils;

import java.util.List;


public class TestImages {

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

        URL = url + "/combs";
        USER = user;
        PASSWORD = password;
    }


    //combos/{comboId}/images get
    @Test
    @Parameters({"combsId", "idImg", "fileName", "original", "thumbnail", "error"})
    public void correctGetAllImages(String combsId, String idImg, String fileName, String original, String thumbnail, String error){

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + combsId + "/images");
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, idImg), "Fail \"idImg\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, fileName), "Fail \"fileName\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, original), "Fail \"original\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, thumbnail), "Fail \"thumbnail\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, error), "Fail \"error\" parameter");
    }

    /*//combos/{comboId}/images post
    @Test
    @Parameters({"combsId"})
    public void correctRefreshAllImages(String combsId){

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + combsId + "/images");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(id));
        List<String> response = Enviroment.getAuthResponceRequest(requestPost, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //combos/{comboId}/images put
    @Test
    @Parameters({"combsId"})
    public void correctReplacementAllImages(String combsId){

        //create correct request
        requestPut = Enviroment.createPUTRequest(URL + combsId + "/images");
        requestPut = (HttpPut) Enviroment.setEntityRequest(requestPut, Utils.createBodyRequest(id));
        List<String> response = Enviroment.getAuthResponceRequest(requestPut, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //combos/{comboId}/images delete
    @Test
    @Parameters({"combsId"})
    public void correctDeleteAllImages(String combsId){

         //create new img in combs

         //get idImg parameter

        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + combsId + "/images");
        List<String> response = Enviroment.getAuthResponceRequest(requestDelete, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/

    /*//combos/{comboId}/images options
    @Test
    @Parameters({"urlAuth"})
    public void correctOptionsImages(String urlAuth){

        //auth
        requestPost = TestUtlis.authorization(urlAuth, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + COMBO_ID + "/images");
        response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
