package ru.buzzlike.correctRequest.achieves;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;
import utils.Utils;

import java.util.List;


public class TestAchieves {

   /* private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpGet requestGet;


    // parameters for url
    //использовать 1 сессию на все тестовые методы, выпилить нахуй авторизацию в каждом методе
    private String ID;//create in suite.xml

    @BeforeClass
    @Parameters({"url","user", "password", "id"})
    public void createCorrectParameters(String url, String user, String password, String id){

        URL = url + "/achieves/";
        USER = user;
        PASSWORD = password;
        ID = id;
    }


    //achieves/userachieves get
    @Test
    public void correctGetAllAchieves() {

        //auth
        requestPost = TestUtlis.authorization(URL, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + "userachieves");
        response  = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //achieves/view	post	id
    @Test
    public void correctGetDescriptionAchieves() {

        //auth
        requestPost = TestUtlis.authorization(URL, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + "view");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(ID));
        response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //achieves/all	get
    @Test
    public void correctGetAllAchievesInSystem() {

        //auth
        requestPost = TestUtlis.authorization(URL, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + "all");
        response  = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}