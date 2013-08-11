package ru.buzzlike.correctRequest.community;


import org.apache.http.client.methods.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Enviroment;

import java.util.List;


public class TestCommunity {

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

        URL = url + "/community";
        USER = user;
        PASSWORD = password;
    }


    //community/list get
    @Test
    @Parameters({})
    public void correctGetAllCommunity(){

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + "/list");
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //System.out.print(response.toString() + "list comm\n");
        //check response
    }


    //community/groups get
    @Test
    @Parameters({})
    public void correctGetAllCommunityGroups(){

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + "/groups");
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

        //System.out.print(response.toString() + "list group\n");
        //check response
    }

    /*//community/groups	post
    @Test
    @Parameters({})
    public void correctCreateNewGroups(){

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + "/groups");
        List<String> response = Enviroment.getAuthResponceRequest(requestPost, USER, PASSWORD);

        System.out.print(response.toString() + "list group\n");
        //check response
    }*/
}
