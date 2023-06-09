import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class deleteUser {
    @Test
    public void deleteTest(){
        given().delete("http://localhost:8080/delete/2")
                .then().statusCode(200);

    }


}
