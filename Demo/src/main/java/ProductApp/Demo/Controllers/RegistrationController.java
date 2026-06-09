package ProductApp.Demo.Controllers;

import ProductApp.Demo.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @DeleteMapping("/registrations")
    public String deleteRegistration(@RequestParam List<Integer> ids){
        return registrationService.deleteMultipleByIds(ids);
    }
}
