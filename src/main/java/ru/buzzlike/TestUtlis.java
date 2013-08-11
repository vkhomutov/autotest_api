package ru.buzzlike;

import org.apache.http.client.methods.HttpPost;
import utils.Enviroment;
import utils.Utils;

public class TestUtlis {

    public static HttpPost authorization (String url,String user,String password){
         return (HttpPost)Enviroment.setEntityRequest(Enviroment.createPOSTRequest(url), Utils.createBodyRequest(user, password));
    }
}
