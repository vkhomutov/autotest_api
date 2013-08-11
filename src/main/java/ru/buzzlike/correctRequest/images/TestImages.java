package ru.buzzlike.correctRequest.images;


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

public class TestImages {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpGet requestGet;
    private HttpOptions requestOptions;

    @BeforeClass
    @Parameters({"url","userYuriy", "passwordYuriy"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/images";
        USER = user;
        PASSWORD = password;
    }


    //images get
    @Test
    @Parameters({"idImg", "fileName", "original", "thumbnail", "error"})
    public void correctGetAllImagesUser(String idImg, String fileName, String original, String thumbnail, String error) {

        //create correct request
        requestGet = Enviroment.createGETRequest(URL);
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, idImg), "Fail \"idImg\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, fileName), "Fail \"fileName\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, original), "Fail \"original\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, thumbnail), "Fail \"thumbnail\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, error), "Fail \"error\" parameter");
    }

    /*//images post
    @Test
    //@Parameters({"urlAuth"})
    public void correctUploadImages() {

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL);
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(UP_LOAD));
        List<String> response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //images option
    @Test
    @Parameters({"urlAuth"})
    public void correctOptionImages(String urlAuth) {

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL);
        List<String> response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }
*/
}
