package utils.dataProviders;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {  //

    @DataProvider(name = "listUrlForDelete" )
    public static Iterator<Object[]> listUrlForDelete (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathUrlForDelete");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listUrlForPut" )
    public static Iterator<Object[]> listUrlForPut (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathUrlForPut");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            String[] to = userData.split(",") ;
            dataToBeReturned.add(new Object[] { to[0],to[1]} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listUrlForPost" )
    public static Iterator<Object[]> listUrlForPost (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathUrlForPost");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            String[] to = userData.split(",") ;
            dataToBeReturned.add(new Object[] { to[0],to[1]} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listUrlForGet" )
    public static Iterator<Object[]> listUrlForGet (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathUrlForGet");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailIdForAchieves" )
    public static Iterator<Object[]> listFailIdForAchieves (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailIdForAchieves");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailUser" )
    public static Iterator<Object[]> listFailUser (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailUser");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailNotification" )
    public static Iterator<Object[]> listFailNotification (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailNotification");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailParametersForRegisterVerify" )
    public static Iterator<Object[]> listFailParametersForRegisterVerify (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailParametersForRegisterVerify");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            String[] to = userData.split(",") ;
            dataToBeReturned.add(new Object[] { to[0],to[1]} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailParametersForRegistration" )
    public static Iterator<Object[]> listFailParametersForRegistration (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailParametersForRegistration");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            String[] to = userData.split(",") ;
            dataToBeReturned.add(new Object[] { to[0],to[1], to[2]} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailText" )
    public static Iterator<Object[]> listFailText (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailText");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailUploadedFile" )
    public static Iterator<Object[]> listFailUploadedFile (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailUploadedFile");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailIdCombId" )
    public static Iterator<Object[]> listFailId (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailCombId");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailTagsForCombs" )
    public static Iterator<Object[]> listFailTagsForCombs (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailTagsForCombs");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();
    }

    @DataProvider(name = "listFailParameterForCombs" )
    public static Iterator<Object[]> listFailParameterForCombs (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailParameterForCombs");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            String[] to = userData.split(",") ;
            dataToBeReturned.add(new Object[] { to[0],to[1], to[2]} );
        }
        return dataToBeReturned.iterator();

    }

    @DataProvider(name = "listFailLoginAndPass" )
    public static Iterator<Object[]> listFailLoginAndPass (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailLoginAndPass");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            String[] to = userData.split(",") ;
            dataToBeReturned.add(new Object[] { to[0],to[1]} );
            }
        return dataToBeReturned.iterator();

    }

    @DataProvider(name = "listFailSocialNetwork" )
    public static Iterator<Object[]> listFailSocialNetwork (ITestContext context) {
        String inputFile = context.getCurrentXmlTest().getParameter("filenamePathFailSocialNetwork");
        String workingDir = System.getProperty("user.dir");
        List<String> testData = getFileContentList(workingDir.substring(0, workingDir.length()) + inputFile);
        List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
        for (String userData : testData ) {
            dataToBeReturned.add(new Object[] {userData} );
        }
        return dataToBeReturned.iterator();

    }

    private static List<String> getFileContentList(String filenamePath) {
        
        InputStream inputStream;
        List<String> lines = new ArrayList<String> ();
        try {
            inputStream = new FileInputStream(new File(filenamePath));
            DataInputStream in = new DataInputStream(inputStream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null)   {
                lines.add(strLine);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }     
        return lines;
    }
}