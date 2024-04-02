import io.qameta.allure.*;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiUserClient.ServicesUserSteps;
import test.data.User;

@Feature("Update User Name")
public class UpdateUserTest extends BaseTest2{
    private ServicesUserSteps apiClient = ServicesUserSteps.getInstance();

    @Test(description = "Validation update user with all field")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositiveFullPet() {
        User generateUser = TestUtils.generateSimpleTemplateUser();
        apiClient.createUserSuccessfully(generateUser);
        apiClient.updateUserSuccessfully(generateUser.getUsername());
    }
}
