package test.apiUserClient;

import io.qameta.allure.Step;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.response.Response;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;
import test.data.Pet;
import test.data.User;

import static org.assertj.core.api.Assertions.assertThat;

public class ServicesUserSteps extends UserBaseApiClient {
    private static ServicesUserSteps client;

    public static ServicesUserSteps getInstance() {
        if (client == null) {
            synchronized (ServicesUserSteps.class) {
                if (client == null) {
                    client = new ServicesUserSteps();
                }
            }
        }
        return client;
    }
    @Step("Check error message {0} for response {1}")
    public ServicesUserSteps checkErrorResponseMessage(String message, Response response){
        assertThat(response.getBody().jsonPath().get("message").toString()).isEqualTo(message);
        return this;
    }

    @Step("Check correct status {status}")
    public ServicesUserSteps checkStatusResponse(int status, Response response){
        assertThat(((RestAssuredResponseImpl) response).getStatusCode()).isEqualTo(status);
        return this;
    }

    @Step("Check parameter {expectedValue} is equal to {actualValue}")
    public ServicesUserSteps checkParamInResponseBody(Object expectedValue, Object actualValue){
        assertThat(expectedValue).isEqualTo(actualValue);
        return this;
    }

    @Step("Get User by userName {userName}")
    public User getUserByUserName(String userName){
        Response response = getUser(userName);
        checkStatusResponse(200, response);
        return response.as(User.class);
    }

    @Step("Create user by user {user}")
    public ServicesUserSteps createUserSuccessfully(User user) {
        Response response = postUser(user);
        checkStatusResponse(200, response);
        return this;
    }

    @Step("Update User with Name {user.name}")
    public ServicesUserSteps updateUserSuccessfully(String userName) {
        User user1 =TestUtils.generateSimpleTemplateUser();
       User user2 = getUserByUserName(userName);
       user2.setFirstName(TestUtils.getRandomWord());
        //User updateUser = TestUtils.generateSimpleTemplateUser();
        Response response = putUser(user1,userName);
        checkStatusResponse(200, response);
        return this;
    }

    @Step("Delete User with Name {user.name}")
    public ServicesUserSteps deleteUserSuccessfully(String userName) {
        Response response = deleteUser(userName);
        checkStatusResponse(200, response);
        return this;
    }

}
