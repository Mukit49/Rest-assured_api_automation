import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.put;

public class updateUser {

   @Test
        public void update1()
        {

            JSONObject request = new JSONObject();
            request.put( "firstname","sabbir");
            request.put( "lastname","mukit");
            request.put( "age","10");
            request.put( "occupation","junior engineer111");

            given().body(request.toJSONString()).when().put("http://localhost:8080/update/3").
                    then().statusCode(200).log().all();


        }





    }

