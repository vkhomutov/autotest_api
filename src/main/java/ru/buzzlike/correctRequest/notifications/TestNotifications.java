package ru.buzzlike.correctRequest.notifications;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;
import utils.Utils;

import java.util.List;

public class TestNotifications {

  /*  private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpGet requestGet;
    private HttpOptions requestOptions;


    //использовать 1 сессию на все тестовые методы, выпилить нахуй авторизацию в каждом методе
    //link create
    private String NOTIFICATIONS;//create in suite.xml
    private String FOR_USER;// create in suite.xml


    @BeforeClass
    @Parameters({"url","user", "password", "notifications", "forUser"})
    public void createCorrectParameters(String url, String user, String password, String notifications, String forUser){

        URL = url + "/notifications";
        USER = user;
        PASSWORD = password;
        NOTIFICATIONS = notifications;
        FOR_USER = forUser;
    }


    //notifications get
    @Test
    @Parameters({"urlAuth"})
    public void correctGetAllNotificationsUser(String urlAuth) {

        //auth
        requestPost = TestUtlis.authorization(urlAuth, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestGet = Enviroment.createGETRequest(URL);
        response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //notifications/new get
    @Test
    @Parameters({"urlAuth"})
    public void correctGetNewNotificationsUser(String urlAuth) {

        //auth
        requestPost = TestUtlis.authorization(urlAuth, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + "/new");
        response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //notifications/viewed	post
    @Test
    @Parameters({"urlAuth"})
    public void correctPostViewedNotifications(String urlAuth) {

        //auth
        requestPost = TestUtlis.authorization(urlAuth, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + "/viewed");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(NOTIFICATIONS));
        response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //notifications/notify	post
    @Test
    @Parameters({"urlAuth"})
    public void correctCreateNewNotificationForUser(String urlAuth) {

        //auth
        requestPost = TestUtlis.authorization(urlAuth, USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL + "/notify");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(FOR_USER));
        response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
