package ru.buzzlike.correctRequest.combos.combId.posts;


import org.apache.http.client.methods.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;

import java.util.List;

public class TestPosts {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpOptions requestOptions;

    @BeforeClass
    @Parameters({"url","user", "password"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/combs/";
        USER = user;
        PASSWORD = password;
    }

   /* //comb/{combId}/posts options
    @Test
    @Parameters({"combsId"})
    public void correctOptionsPosts(String combsId){

        //create correct request
        requestOptions = Enviroment.createOPTIONSRequest(URL + combsId + "/posts");
        List<String> response = Enviroment.getAuthResponceRequest(requestOptions, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //comb/{combId}/posts post
    @Test
    @Parameters({"combsId"})
    public void correctPostPosts(String combsId){

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + combsId + "/posts");
        //TODO set Entity     ???
        List<String> response = Enviroment.getAuthResponceRequest(requestOptions, USER, PASSWORD);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }
*/
}
