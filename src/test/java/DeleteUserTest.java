import io.qameta.allure.*;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiUserClient.ServicesUserSteps;
import test.data.User;

@Feature("Delete Username")
public class DeleteUserTest extends BaseTest2{
    private ServicesUserSteps apiClient = ServicesUserSteps.getInstance();
    @Test(description = "Validate Delete Username")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositiveFullPet() {
        User user1 = TestUtils.generateSimpleTemplateUser();
        apiClient.createUserSuccessfully(user1);
        apiClient.deleteUserSuccessfully(user1.getUsername());
    }
}
