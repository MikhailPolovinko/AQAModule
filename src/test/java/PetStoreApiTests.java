import Pojo.PostPetStoreUser;
import builders.PetStoreUserGenerator;
import io.restassured.http.ContentType;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static builders.PetStoreUserGenerator.setUserData;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class PetStoreApiTests {

    @Test
    public void postUserWithCode200(){
        given()
                .baseUri("https://petstore.swagger.io")
                .basePath("/v2/user")
                .contentType(JSON)
                .accept(JSON)
                .body(setUserData())
                .when().post()
                .then().log().body().statusCode(200).assertThat().body("message", CoreMatchers.equalTo(String.valueOf(setUserData().getId())));

    }
}
