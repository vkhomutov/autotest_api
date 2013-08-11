package ru.buzzlike.failRequest.failParameterInBody;


import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Enviroment;
import utils.Utils;

import java.util.List;

public class TestFailParameterInBody {

   /* private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpPut requestPut;

    //todo authorization in methods
    private String COMB_ID;
    private String TEXT_ID;


    @BeforeClass
    @Parameters({"url","user", "password"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url;
        USER = user;
        PASSWORD = password;
    }


    //auth/login
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailLoginAndPass")
    public void inCorrectAuth(String user, String password) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/login");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(user, password));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //combos
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailParameterForCombs")
    public void inCorrectCreateNewCombs(String text, String tagValue, String imglds) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/combos");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(text, tagValue, imglds));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //combs/{combId}/tags
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailTagsForCombs")
    public void inCorrectRefreshTags(String tagValue) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/combs/" + COMB_ID + "/tags");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(tagValue));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //combs/{combId}/text
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailId")
    public void inCorrectRefreshListTextForCombs(String id) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/combs/" + COMB_ID + "/text");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(id));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //combs/{combId}/text
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailId")
    public void inCorrectReplacementListTextForCombs(String id) {

        //create request
        requestPut = Enviroment.createPUTRequest(URL + "/combs/" + COMB_ID + "/text");
        requestPut = (HttpPut) Enviroment.setEntityRequest(requestPut, Utils.createBodyRequest(id));
        List<String> response  = Enviroment.getResponceRequest(requestPut);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //combs/{combId}/images
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailId")
    public void inCorrectRefreshListImagesForCombs(String id) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/combs/" + COMB_ID + "/images");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(id));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //combs/{combId}/images
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailId")
    public void inCorrectReplacementListImagesForCombs(String id) {

        //create request
        requestPut = Enviroment.createPUTRequest(URL + "/combs/" + COMB_ID + "/images");
        requestPut = (HttpPut) Enviroment.setEntityRequest(requestPut, Utils.createBodyRequest(id));
        List<String> response  = Enviroment.getResponceRequest(requestPut);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //images
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailUploadedFile")
    public void inCorrectCreateNewImages(String uploadedFile) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/images");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(uploadedFile));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //text
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailText")
    public void inCorrectCreateNewText(String text) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/text");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(text));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //text/{textId}
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailText")
    public void inCorrectReplacementText(String text) {

        //create request
        requestPut = Enviroment.createPUTRequest(URL + "/text/" + TEXT_ID);
        requestPut = (HttpPut) Enviroment.setEntityRequest(requestPut, Utils.createBodyRequest(text));
        List<String> response  = Enviroment.getResponceRequest(requestPut);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //register
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailParametersForRegistration")
    public void inCorrectNewRegistration(String login, String password, String email) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/register");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(login,password, email));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //register/verify
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailParametersForRegisterVerify")
    public void inCorrectVerifyRegistration(String login, String token) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/register/verify");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(login, token));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }


    //notifications/viewed/
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailNotification")
    public void inCorrectNotificationIsView(String notification) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/notifications/viewed");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(notification));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //notifications/notify/
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailUser")
    public void inCorrectCreateNewNotification(String user) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/notifications/notify");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(user));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }

    //achieves/view
    @Test(dataProviderClass = utils.dataProviders.DataProviders.class, dataProvider = "listFailIdForAchieves")
    public void inCorrectGetDescriptionAchieves(String id) {

        //create request
        requestPost = Enviroment.createPOSTRequest(URL + "/achieves/view");
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest(id));
        List<String> response  = Enviroment.getResponceRequest(requestPost);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
