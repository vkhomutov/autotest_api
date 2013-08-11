package ru.buzzlike.correctRequest.url.urlId;


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

        URL = url + "/url/";
        USER = user;
        PASSWORD = password;
    }

    /*//url/{urlId} delete
    @Test
    @Parameters({})
    public void correctDeleteUrlId(){

        //create new Url for user

        //get urlId parameter


        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + URL_ID);
        response = Enviroment.getAuthResponseRequest(requestDelete, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //url/{urlId} get
    @Test
    @Parameters({"urlId"})
    public void correctGetUrlId(String urlId){

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + urlId);
        response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //url/{urlId} put
    @Test
    //@Parameters({})
    public void correctGetUrlId(){

        //create correct request
        requestPut = Enviroment.createPUTRequest(URL + URL_ID);
        response = Enviroment.getAuthResponceRequest(requestPUT, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //url/{urlId} options
    @Test
    public void correctOptionsImagesId(){

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + URL_ID);
        List<String> response = Enviroment.getResponceRequest(requestOptions);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
