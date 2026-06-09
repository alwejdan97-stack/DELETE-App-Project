package ProductApp.Demo.Controllers;

import ProductApp.Demo.Entities.LibraryMember;
import ProductApp.Demo.Services.LibraryManager;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@RestController
@RequestMapping("/members")
public class LibraryController {

   @Autowired
   private LibraryManager libraryManager;

   @PostMapping
    public ArrayList<LibraryMember>  addMember(@RequestBody LibraryMember member){
        return libraryManager.addMember(member);
    }

    @GetMapping
    public ArrayList<LibraryMember> displayMembers(){
        return libraryManager.displayMembers();
    }

    @DeleteMapping("/{memberId}")
    public ArrayList<LibraryMember> deleteMemberById(String memberId){
        return libraryManager.deleteMemberById(memberId);
    }
}
