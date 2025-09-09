package aqa_hw_2.task_1_4;

import aqa_hw_2.task_1_4.dto.CategoryDto;
import aqa_hw_2.task_1_4.dto.PetDto;
import aqa_hw_2.task_1_4.dto.TagDto;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class PutPetTests {

    @Test
    public void verifyPetCanBeModified() {
        CategoryDto category = new CategoryDto();
        category.setId(1);
        category.setName("dog");

        TagDto tag = new TagDto();
        tag.setId(1);
        tag.setName("friendly");

        PetDto petToCreate = new PetDto();
        petToCreate.setId(1001);
        petToCreate.setCategory(category);
        petToCreate.setName("Rex");
        petToCreate.setPhotoUrls(Collections.singletonList("url1"));
        petToCreate.setTags(Collections.singletonList(tag));
        petToCreate.setStatus("available");

        Response postResponse = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(petToCreate)
                .post("https://petstore.swagger.io/v2/pet");

        assertEquals(200, postResponse.getStatusCode());

        Response getResponseBeforeUpdate = RestAssured
                .given()
                .get("https://petstore.swagger.io/v2/pet/" + petToCreate.getId());

        assertEquals(200, getResponseBeforeUpdate.getStatusCode());

        PetDto createdPet = getResponseBeforeUpdate.as(PetDto.class);

        assertEquals("Rex", createdPet.getName());
        assertEquals("available", createdPet.getStatus());
        assertEquals("dog", createdPet.getCategory().getName());
        assertEquals("friendly", createdPet.getTags().get(0).getName());
        assertEquals("url1", createdPet.getPhotoUrls().get(0));

        CategoryDto updatedCategory = new CategoryDto();
        updatedCategory.setId(category.getId());
        updatedCategory.setName("wolf");

        TagDto updatedTag = new TagDto();
        updatedTag.setId(tag.getId());
        updatedTag.setName("aggressive");

        PetDto petToUpdate = new PetDto();
        petToUpdate.setId(petToCreate.getId());
        petToUpdate.setCategory(updatedCategory);
        petToUpdate.setName("Max");
        petToUpdate.setPhotoUrls(Collections.singletonList("url2"));
        petToUpdate.setTags(Collections.singletonList(updatedTag));
        petToUpdate.setStatus("sold");

        Response putResponse = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(petToUpdate)
                .put("https://petstore.swagger.io/v2/pet");

        assertEquals(200, putResponse.getStatusCode());

        Response getResponseAfterUpdate = RestAssured
                .given()
                .get("https://petstore.swagger.io/v2/pet/" + petToCreate.getId());

        assertEquals(200, getResponseAfterUpdate.getStatusCode());

        PetDto finalPet = getResponseAfterUpdate.as(PetDto.class);

        assertEquals("Max", finalPet.getName());
        assertEquals("sold", finalPet.getStatus());
        assertEquals("wolf", finalPet.getCategory().getName());
        assertEquals("aggressive", finalPet.getTags().get(0).getName());
        assertEquals("url2", finalPet.getPhotoUrls().get(0));
    }
}