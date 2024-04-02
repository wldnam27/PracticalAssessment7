package test.apiUserClient;

import io.restassured.response.Response;

public interface UserAbstractRequest {

    Response getUser(String userName);
    Response postUser(Object user);
    Response deleteUser(String userName);
    Response putUser(Object user, String userName);


}
