package ru.buzzlike.failRequest.failParameterInUrl;


import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;

import java.util.List;

public class TestFailParameterInUrl {

    /*@Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailSocialNetwork")
    public void inCorrectAuthSocial(String socialNetwork) {

        //auth
        requestPost = TestUtlis.authorization(URL + "/login", USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create request
        requestGet = Enviroment.createGETRequest(URL + "/connect/" + socialNetwork);
        response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/

    /*@Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailSocialNetwork")
    public void inCorrectCallbackSocial(String socialNetwork) {

        //auth
        requestPost = TestUtlis.authorization(URL + "/login", USER, PASSWORD);
        List<String> response = Enviroment.getResponceRequest(requestPost);

        //create request
        requestGet = Enviroment.createGETRequest(URL + "/callback/" + socialNetwork);
        response = Enviroment.getResponceRequest(requestGet);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
