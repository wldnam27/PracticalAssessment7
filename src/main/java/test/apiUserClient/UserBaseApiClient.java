package test.apiUserClient;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class UserBaseApiClient implements UserAbstractRequest{
    @Override
    public Response getUser(String userName) {
        return given()
                .log()
                .all()
                .contentType(JSON)
                .when()
                .log()
                .all()
                .get(userName);
    }

    @Override
    public Response postUser(Object user) {
        return given()
                .log()
                .all()
                .contentType(JSON)
                .when()
                .log()
                .all()
                .body(user)
                .post();
    }

    @Override
    public Response deleteUser(String userName) {
        return given()
                .log()
                .all()
                .contentType(JSON)
                .when()
                .log()
                .all()
                .delete(userName);
    }


    @Override
    public Response putUser(Object user, String userName) {
        return given()
                .log()
                .all()
                .contentType(JSON)
                .when()
                .log()
                .all()
                .body(user)
                .put(userName);

    }
}
