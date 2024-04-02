import io.qameta.allure.*;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;
import test.data.Pet;

import static test.TestUtils.*;
@Feature("Add new per in store")
public class AddNewPetTest extends BaseTest{
    private ServicesPetSteps apiClient = ServicesPetSteps.getInstance();

    @Test(description = "Validation adding default pet to store")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositivePostSimpleTest(){
        apiClient.updatePetSuccessfully(pet);
    }

    @Test(description = "Validation adding pet with all field")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositiveFullPet() {
        apiClient.updatePetSuccessfully(TestUtils.generateFullTemplate());
    }
}
