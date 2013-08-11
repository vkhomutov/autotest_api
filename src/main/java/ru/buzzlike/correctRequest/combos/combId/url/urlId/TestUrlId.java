package ru.buzzlike.correctRequest.combos.combId.url.urlId;


import org.apache.http.client.methods.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class TestUrlId {

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

    /*//combos/{comboId}/urls delete
    @Test
    @Parameters({"combsId"})
    public void correctDeleteUrlId(String combsId){

        //create new Url in combs

        //get urlId parameter


        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + combsId + "/urls/" + URL_ID);
        response = Enviroment.getResponceRequest(requestDelete);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //combs/{combId}/urls/{urlId} options
    @Test
    @Parameters({"combsId"})
    public void correctOptionsImagesId(String combsId){


        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + combsId + "/urls/" + URL_ID);
        List<String> response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
