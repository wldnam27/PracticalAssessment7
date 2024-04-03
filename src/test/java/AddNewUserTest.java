import io.qameta.allure.*;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiUserClient.ServicesUserSteps;
import test.data.Pet;

import static test.TestUtils.*;
@Feature("Add new username")
public class AddNewUserTest extends BaseTest2{
    private ServicesUserSteps apiClient = ServicesUserSteps.getInstance();

    @Test(description = "Create user")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositivePostSimpleTest(){apiClient.createUserSuccessfully(user);
    }


}
