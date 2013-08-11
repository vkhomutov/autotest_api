package utils;

//import org.apache.commons.lang.StringUtils;


import java.util.List;

public class Utils {

    public static String createLink(String link, String... params){
        //if(StringUtils.isEmpty(link)){
            //throw new ConfigurationException("Link can't be empty");//TODO fake
        //}
        if(params == null || params.length == 0){
            return link;
        }
        StringBuilder result = new StringBuilder(link);
        result.append(link.contains("?") ? "?" : "");
        for(String param : params){
            result.append(param).append("/");
        }
        result.replace(result.length() - 1, result.length(), "");
        return result.toString();
    }

    public static String createBodyRequest(String...params){
        StringBuilder result = new StringBuilder();
        for(String param : params){
            result.append(param).append("&");
        }
        result.replace(result.length() - 1, result.length(), "");
        return result.toString();
    }

    public static boolean checkResponse (List<String> response, String parameter){
        if(response.toString().contains(parameter)){
            return true;
        }
        return false;
    }

    public static boolean checkResponseCombs (List<String> response, String parameter){
        if(response.toString().contains(parameter)){
            return true;
        }
        return false;
    }
}
