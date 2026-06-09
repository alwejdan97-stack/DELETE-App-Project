package DeleteApp.Demo.Services;

import DeleteApp.Demo.Entities.LibraryMember;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.ArrayList;

@Service
public class LibraryManager {
    ArrayList<LibraryMember> members=new ArrayList<>();

    public void initializeMembers(){
        members.add(new LibraryMember("M1-01","Wejdan","Standard"));
        members.add(new LibraryMember("M2-02","Ali","Standard"));
        members.add(new LibraryMember("M3-03","Ahmed","Premium"));

    }
    public ArrayList<LibraryMember> addMember(LibraryMember member){
        members.add(member);
        System.out.println(member+" Add SUCCESSFULLY...");
        return members;
    }
    public ArrayList<LibraryMember> displayMembers(){
        if(members.isEmpty()){
            System.out.println("NO Registered Member...");
        }
        System.out.println("*** Show Available Members ***");
        for(LibraryMember lm: members){
            System.out.println("Member ID: "+lm.getMemberId()+" | Member Name: "+lm.getFullName()+" | Member Ship Type: "+lm.getMembershipType());
        }
        return members;
    }

    public ArrayList<LibraryMember> deleteMemberByObject(LibraryMember memberToDelete){
        boolean memberFound=false;
        for(LibraryMember lm:members){
            if(lm.getMemberId().equals(memberToDelete)){
                members.remove(memberToDelete);
                System.out.println(memberToDelete+" Removed SUCCESSFULLY...");
                memberFound=true;
                break;
            }
        }
        if(!memberFound){
            System.out.println("Member NOT Found, NO Deletion Performed...");
        }
        return members;
    }
}
