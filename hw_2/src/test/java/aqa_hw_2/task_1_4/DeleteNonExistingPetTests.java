package aqa_hw_2.task_1_4;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteNonExistingPetTests {

    @Test
    public void verifyNonExistingPetCannotBeDeleted() {
        RestAssured.defaultParser = Parser.JSON;

        int nonExistingId = 999999;

        Response getResponse = given()
                .get("https://petstore.swagger.io/v2/pet/" + nonExistingId);
        Assert.assertEquals(404, getResponse.getStatusCode());

        Response deleteResponse = given()
                .delete("https://petstore.swagger.io/v2/pet/" + nonExistingId);
        Assert.assertEquals(404, deleteResponse.getStatusCode());
    }
}