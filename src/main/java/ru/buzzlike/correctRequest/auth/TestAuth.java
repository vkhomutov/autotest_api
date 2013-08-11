package ru.buzzlike.correctRequest.auth;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Enviroment;
import utils.Utils;
import java.util.List;



public class TestAuth {

    private String URL;
    private String USER;
    private String PASSWORD;
    private String HEADER_CONTENT_TYPE;
    private HttpPost requestPost;
    private HttpGet requestGet;


    //TODO url + user + pass
    // parameters for url
    private String SOCIAL_NETWORK;//create parameter {socialNetwork}
    //нужна ли авторизация для метода OPTIONS  по всем урлам?
    //url for auth учесть блять "\login"


    @BeforeClass
    @Parameters({"url","user", "password", "headerContentType"})
    public void createCorrectParameters(String url, String user, String password, String headerContentType){

        URL = url + "/auth";
        USER = user;
        PASSWORD = password;
        HEADER_CONTENT_TYPE = headerContentType;
    }


    //auth/login
    @Test
    @Parameters({"userId", "systemRole", "firstName", "lastName", "authParameter", "error"})
    public void correctAuth(String userId, String systemRole, String firstName, String lastName, String authParameter, String error){

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + "/login");
        requestPost = (HttpPost) Enviroment.setHeadersRequest(requestPost,HEADER_CONTENT_TYPE );
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest("login="+ USER,"password=" + PASSWORD));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, userId));
        Assert.assertTrue(Utils.checkResponse(response, systemRole));
        Assert.assertTrue(Utils.checkResponse(response, firstName));
        Assert.assertTrue(Utils.checkResponse(response, lastName));
        Assert.assertTrue(Utils.checkResponse(response, authParameter));
        Assert.assertTrue(Utils.checkResponse(response, error));
    }


    //auth/logout
    @Test
    @Parameters({"error", "dataNull"})
    public void correctLogout(String dataNull, String error) {

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + "/logout");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(USER, PASSWORD));
        List<String> response  = Enviroment.getAuthResponceRequest(requestPost, USER,PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, dataNull), "Fail \"data\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, error), "Fail \"error\" parameter");
    }


    //auth/status
    @Test
    @Parameters ({"userId", "systemRole", "firstName", "lastName", "authParameter", "error"})
    public void correctStatus(String userId, String systemRole, String firstName, String lastName, String authParameter, String error){

        //create correct status
        requestGet = Enviroment.createGETRequest(URL + "/status");
        requestGet = (HttpGet) Enviroment.setHeadersRequest(requestGet, HEADER_CONTENT_TYPE);
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponse(response, userId), "Fail \"userId\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, systemRole), "Fail \"systemRole\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, firstName), "Fail \"firstName\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, lastName), "Fail \"lastName\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, authParameter), "Fail \"authParameter\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, error),  "Fail \"error\" parameter");
    }


    /*//auth/connect/{socialNetwork}
    @Test
    public void correctAuthSocial(){

        //auth
        requestPost = TestUtlis.authorization(URL + "/login", USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + "/connect/" + SOCIAL_NETWORK);
        response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //auth/callback/{socialNetwork}
    @Test
    public void correctCallbackSocial(){

        //auth
        requestPost = TestUtlis.authorization(URL + "/login", USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + "/callback/" + SOCIAL_NETWORK);
        response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}