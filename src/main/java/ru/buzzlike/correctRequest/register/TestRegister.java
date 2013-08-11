package ru.buzzlike.correctRequest.register;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Enviroment;
import utils.Utils;

import java.util.List;

public class TestRegister {

    /*private String URL;
    private HttpPost requestPost;
    private HttpGet requestGet;

    private String NEW_USER;//in suite.xml and cast value
    private String NEW_PASSWORD;// in suite.xml and cast value
    private String EMAIL;// in suite.xml and cast value
    private String TOKEN; //in suite.xml

    @BeforeClass
    @Parameters({"url","newUser", "newPassword", "email", "token"})
    public void createCorrectParameters(String url, String user, String password, String email, String token){

        URL = url + "/register";
        NEW_USER = user;
        NEW_PASSWORD = password;
        EMAIL = email;
        TOKEN = token;
    }


    //register post
    @Test
    @Parameters({"urlAuth"})
    public void correctRegister(String urlAuth) {

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL);
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(NEW_USER, NEW_PASSWORD, EMAIL));
        List<String> response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //register/verify
    @Test
    @Parameters({"urlAuth"})
    public void correctRegisterVerify(String urlAuth) {

        //create correct request
        requestPost = Enviroment.createPOSTRequest(URL);
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(NEW_USER, TOKEN));
        List<String> response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }
*/

}
