package ru.buzzlike.correctRequest.schedule;


import org.apache.http.client.methods.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Enviroment;

import java.util.List;


public class TestSchedule {

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

        URL = url + "/schedule";
        USER = user;
        PASSWORD = password;
    }


   /* //schedule/get	post
    @Test
    @Parameters({})
    public void correctGetPost(){

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + "/get" );
        List<String> response = Enviroment.getAuthResponceRequest(requestPost, USER, PASSWORD);

        System.out.print(response.toString()+"-----------get\n");
        //check response
    }

    //schedule	post
    @Test
    @Parameters({})
    public void correctCreatePlaning(){

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL );
        List<String> response = Enviroment.getAuthResponceRequest(requestPost, USER, PASSWORD);

        System.out.print(response.toString()+"-----------post\n");
        //check response
    }

    //schedule	put
    @Test
    @Parameters({})
    public void correctRecreatePlaning(){

        //create correct request
        requestPut = Enviroment.createPUTRequest(URL );
        List<String> response = Enviroment.getAuthResponceRequest(requestPut, USER, PASSWORD);

        System.out.print(response.toString()+"-----------post\n");
        //check response
    }
     */

    /*//schedule/{sheduleId} delete
    @Test
    @Parameters({})
    public void correctDeletePlaning(){

        //create new plan

        //get parameter id

        //create correct request
        requestDelete = Enviroment.createDELETERequest(URL + "/" + id );
        List<String> response = Enviroment.getAuthResponceRequest(requestDelete, USER, PASSWORD);

        System.out.print(response.toString()+"-----------post\n");
        //check response
    }*/

}
