package ru.buzzlike.correctRequest.combos.combId.preview;


import org.apache.http.client.methods.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.buzzlike.TestUtlis;
import utils.Enviroment;
import utils.Utils;

import java.util.List;

public class TestPreview {

    private String URL;
    private String USER;
    private String PASSWORD;
    private HttpPost requestPost;
    private HttpOptions requestOptions;
    private HttpGet requestGet;

    @BeforeClass
    @Parameters({"url","userYuriy", "passwordYuriy"})
    public void createCorrectParameters(String url, String user, String password){

        URL = url + "/combs";
        USER = user;
        PASSWORD = password;
    }


    ///combs/{combId}/preview get
    @Test
    @Parameters({"combsId", "textIds", "idCombs", "tags", "userId", "timestamp", "posts", "readyToSchedule", "picComments", "picIds"})
    public void correctGetAllImages(String combsId, String textIds, String idCombs, String tags, String userId, String timestamp, String posts,
                                    String readyToSchedule, String picComments, String picIds){

        //create correct request
        requestGet = Enviroment.createGETRequest(URL + combsId + "/preview");
        List<String> response = Enviroment.getAuthResponceRequest(requestGet, USER, PASSWORD);

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
}
