package ProductApp.Demo.Controllers;

import ProductApp.Demo.Services.RegistrationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {
    RegistrationService registrationService=new RegistrationService();

    @DeleteMapping("/registrations")
    public String deleteRegistration(@RequestParam List<Integer> ids){
        return registrationService.deleteMultipleByIds(ids);
    }
}
