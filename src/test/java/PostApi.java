import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.put;
@Test
public class PostApi {

    @Test
    public void userTest1() {

        //making json using map
        //Map<String, Object> map = new HashMap<String, Object>();

        JSONObject request = new JSONObject();
        request.put( "firstname","Sabbir108");
        request.put( "lastname","mukit119");
        request.put( "age","10");
        request.put( "occupation","engineer");

        given().body(request.toJSONString()).when().post("http://localhost:8080/save").
                then().statusCode(200).log().all();

    }



}
