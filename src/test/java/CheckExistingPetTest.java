import io.qameta.allure.*;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;

@Feature("Add new with existing Pets")
public class CheckExistingPetTest extends BaseTest{
    private ServicesPetSteps apiClient = ServicesPetSteps.getInstance();

    @Test(description = "Chek all field for existing simple default")
    public void checkExistingSimpleTest(){
        apiClient.uploadPetSuccessfully(pet).checkAllPetFields(pet);
    }
}
