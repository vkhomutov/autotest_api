package ru.buzzlike.correctRequest.combos.combId.images.imageId;


import org.apache.http.client.methods.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;

import java.util.List;


public class TestImageId {

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

    /*//combos/{comboId}/images delete
    @Test
    @Parameters({"combsId"})
    public void correctDeleteImageId(String combsId){

        //create new Img in combs

        //get ImgId parameter


        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + combsId + "/images/" + IMAGE_ID);
        response = Enviroment.getResponceRequest(requestDelete);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //combs/{combId}/images/{imageId} options
    @Test
    @Parameters({"combsId"})
    public void correctOptionsImagesId(String combsId){


        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + combsId + "/images/" + IMAGE_ID);
        List<String> response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
