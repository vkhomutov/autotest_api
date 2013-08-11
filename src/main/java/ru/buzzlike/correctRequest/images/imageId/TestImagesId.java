package ru.buzzlike.correctRequest.images.imageId;


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

public class TestImagesId {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpGet requestGet;
    private HttpDelete requestDelete;
    private HttpOptions requestOptions;

    @BeforeClass
    @Parameters({"url","user", "password"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/images/";
        USER = user;
        PASSWORD = password;
    }


    //images/{imageId} get
    @Test
    @Parameters({"idImage", "idImg", "fileName", "original", "thumbnail", "error"})
    public void correctGetImageUser(String idImage,String idImg, String fileName, String original, String thumbnail,
                                            String error ) {

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + idImage);
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, idImg), "Fail \"idImg\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, fileName), "Fail \"fileName\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, original), "Fail \"original\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, thumbnail), "Fail \"thumbnail\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, error), "Fail \"error\" parameter");
    }


/*    //images/{imageId} delete
    @Test
    //@Parameters({"urlAuth"})
    public void correctDeleteImageUser() {

        //create new img for user

        //get  idImg parameter

        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + IMAGE_ID);
        response = Enviroment.getResponceRequest(requestDelete);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //images/{imageId} options
    @Test
    public void correctOptionsImageId() {

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + IMAGE_ID);
        List<String> response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }
*/

}
