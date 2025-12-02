package pageObject;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ReqresInAPITests {

    @Test

    public void getUsersWithCode200(){
      given()
              .header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
              .accept(ContentType.JSON)
        .contentType(ContentType.JSON)
              .baseUri("https://reqres.in")
              .basePath("/api/users")
              .queryParam("page", 2)
              .when().get()
              .then().log().body().statusCode(200);
    }
}
