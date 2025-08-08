package aqa_hw_2.task_1_4;

import aqa_hw_2.task_1_4.dto.CategoryDto;
import aqa_hw_2.task_1_4.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreatePetTest {

    @Test
    public void verifyPetCanCreated() {
//        String  json = "{\n" +
//                "  \"id\": 793,\n" +
//                "  \"category\": {\n" +
//                "    \"id\": 0,\n" +
//                "    \"name\": \"Taksa\"\n" +
//                "  },\n" +
//                "  \"name\": \"Sousage\",\n" +
//                "  \"photoUrls\": [\n" +
//                "    \"string\"\n" +
//                "  ],\n" +
//                "  \"tags\": [\n" +
//                "    {\n" +
//                "      \"id\": 0,\n" +
//                "      \"name\": \"some tag\"\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"status\": \"available\"\n" +
//                "}";
        int petIdToCreate = 784;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Staff");
        String petNameToCreate = "Bul";
        String status = "available";

        PetDto petDtoToCreate = new PetDto(petIdToCreate, categoryDto, petNameToCreate, status);
//        petDtoToCreate.setId(petIdToCreate);
//        petDtoToCreate.setCategory(categoryDto);
//        petDtoToCreate.setName(petNameToCreate);
//        petDtoToCreate.setStatus(status);

        Response createPetResponse = given()
                .contentType("application/json")
                //.body(json)
                .body(petDtoToCreate)
                .post("https://petstore.swagger.io/v2/pet");
        PetDto postResponseDto = createPetResponse.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, postResponseDto.getId());
        System.out.println(createPetResponse.asPrettyString());
        System.out.println(postResponseDto);

        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());
        Assert.assertEquals(categoryDto.getName(), previouslyCreatedPetDto.getCategory().getName());
        Assert.assertEquals(petNameToCreate, previouslyCreatedPetDto.getName());
        Assert.assertEquals(status, previouslyCreatedPetDto.getStatus());
    }

}
