package ru.buzzlike.correctRequest.combos;


import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Enviroment;
import utils.Utils;

import java.util.List;

public class TestCombos {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpGet requestGet;
    private HttpOptions requestOptions;
    private HttpDelete requestDelete;

    @BeforeClass
    @Parameters({"url","userYuriy", "passwordYuriy"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/combs";
        USER = user;
        PASSWORD = password;
    }


    //combos get
    @Test
    @Parameters({"picIds", "textIds", "idCombs", "tags", "userId", "timestamp", "posts", "readyToSchedule", "picComments"})
    public void correctGetAllCombs(String picIds, String textIds, String idCombs, String tags, String userId, String timestamp, String posts,
                                    String readyToSchedule, String picComments) {

        //create correct request
        requestGet = Enviroment.createGETRequest(URL);
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //check response
        Assert.assertTrue(Utils.checkResponseCombs(response, idCombs), "Fail \"id\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, picIds), "Fail \"picIds\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, textIds), "Fail \"textIds\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, tags), "Fail \"tags\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, userId), "Fail \"userId\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, timestamp), "Fail \"timestamp\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, posts), "Fail \"posts\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, readyToSchedule), "Fail \"readyToSchedule\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, picIds), "Fail \"picIds\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, picComments), "Fail \"picComments\" parameter");
        Assert.assertTrue(Utils.checkResponse(response, textIds), "Fail \"textIds\" parameter");
    }


    /*//combos post
    @Test
    //@Parameters({"text", "tagValue", "imglds"})
    public void correctCreateNewCombos(){//String urlAuth,String text, String tagValue, String imglds){

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL);
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest("atest", "TEST", "imm"));
        List<String> response = Enviroment.getAuthResponceRequest(requestPost, USER, PASSWORD);

        System.out.println(response.toString() + "create-------------");
        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //combos option
    @Test
    //@Parameters ({"urlAuth"})
    public void correctCreateOption(){

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL);
        List<String> response = Enviroment.getAuthResponceRequest(requestOptions, USER, PASSWORD);

        System.out.print(response.toString());
        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }  */
}
