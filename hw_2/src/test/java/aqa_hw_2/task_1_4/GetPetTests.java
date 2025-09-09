package aqa_hw_2.task_1_4;

import aqa_hw_2.task_1_4.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetPetTests {

    @Test
    public void verifyPetBeObyained() {
        //given().get();

        int entityIdToFind = 333;
        Response response = given().get("https://petstore.swagger.io/v2/pet/" + entityIdToFind);
        System.out.println(response.asPrettyString());

        PetDto petDto = response.as(PetDto.class);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(entityIdToFind, petDto.getId());

    }

}
