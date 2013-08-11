package ru.buzzlike.correctRequest.tags;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;

import java.util.List;

public class TestTags {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpGet requestGet;

    @BeforeClass
    @Parameters({"url","user", "password"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/tags/combs";
        USER = user;
        PASSWORD = password;
    }


    /*//text/combs get
    @Test
    //@Parameters({"urlAuth"})
    public void correctSearchTags() {

        //create get tags combs

        //get parameter tagValue

        //create correct request
        requestGet = Enviroment.createGETRequest(URL, TAG_VALUES);
        response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
