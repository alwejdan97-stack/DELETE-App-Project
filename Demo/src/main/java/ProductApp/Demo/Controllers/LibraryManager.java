package ProductApp.Demo.Controllers;

import ProductApp.Demo.Entities.LibraryMember;

import java.util.ArrayList;

public class LibraryManager {
    ArrayList<LibraryMember> members=new ArrayList<>();

    public void initializeMembers(){
        members.add(new LibraryMember("M1-01","Wejdan","Standard"));
        members.add(new LibraryMember("M2-02","Ali","Standard"));
        members.add(new LibraryMember("M3-03","Ahmed","Premium"));

    }
    public void addMember(LibraryMember member){
        members.add(member);
        System.out.println(member+" Add SUCCESSFULLY...");
    }
    public void displayMembers(){
        if(members.isEmpty()){
            System.out.println("NO Registered Member...");
        }
        System.out.println("*** Show Available Members ***");
        for(LibraryMember lm: members){
            System.out.println("Member ID: "+lm.getMemberId()+" | Member Name: "+lm.getFullName()+" | Member Ship Type: "+lm.getMembershipType());
        }
    }

    public ArrayList<LibraryMember> deleteMemberById(String memberId){
        boolean memberFound=false;
        for(LibraryMember lm:members){
            if(lm.getMemberId().equals(memberId)){
                members.remove(memberId);
                System.out.println(memberId+" Removed SUCCESSFULLY...");
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
