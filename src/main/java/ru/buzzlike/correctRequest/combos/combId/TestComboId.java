package ru.buzzlike.correctRequest.combos.combId;


import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;
import utils.Utils;

import java.util.List;

public class TestComboId {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpGet requestGet;
    private HttpDelete requestDelete;

    @BeforeClass
    @Parameters({"url","user", "password"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/combs";
        USER = user;
        PASSWORD = password;
    }


    //combos/{comboId} get
    @Test
    @Parameters({"idCombs", "picIds", "textIds", "tags", "userId", "timestamp", "posts", "readyToSchedule", "picComments","combsId"})
    public void correctGetCombsId(String idCombs,String picIds, String textIds,String tags, String userId, String timestamp,
                                String posts, String readyToSchedule, String picComments, String combsId) {

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + combsId);
        List<String> response = Enviroment.getResponceRequest(requestGet);

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


    /*//combos {comboId} delete
    @Test
    @Parameters({"urlAuth"})
    public void correctDeleteCombos(String urlAuth) {

        //create new combs
        requestPost = Enviroment.createPOSTRequest(URL);
        requestPost = (HttpPost) Enviroment.setEntityRequest(requestPost, Utils.createBodyRequest("text", "tagValue", "img"));
        List<String> response = Enviroment.getAuthResponceRequest(requestPost, USER, PASSWORD);

        //get parameter CombId
        //Utils.getParameter

        //correct delete combs
        requestDelete = Enviroment.createDELETERequest(URL + COMBO_ID);
        response = Enviroment.getResponceRequest(requestDelete);

        //check response
        //Assert.assertTrue(Utils.checkParameter(response, "test"), "Error");
    }*/
}
