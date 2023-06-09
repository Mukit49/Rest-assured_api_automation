import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetApi {
    @Test
    public void getUsers(){


        Response response =  RestAssured.get("http://localhost:8080/users");

        int status_code = response.getStatusCode();
        System.out.println(status_code);

        Assert.assertEquals(status_code,200);

    }
    @Test
    public void testUser(){

        given().get("http://localhost:8080/users").
                then().statusCode(200).
                body("id[0]", Matchers.equalTo(2)).
                log().all();

    }
}
