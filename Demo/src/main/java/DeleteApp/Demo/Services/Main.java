package DeleteApp.Demo.Services;

import DeleteApp.Demo.Entities.LibraryMember;

public class Main {
    public static void main(String[] args){
        LibraryManager manager=new LibraryManager();

        manager.initializeMembers();
        manager.addMember(new LibraryMember("M5-05","Nasser","Premium"));
        manager.displayMembers();
        manager.deleteMemberByObject(new LibraryMember("M5-05","Nasser","Premium"));
        manager.displayMembers();
    }
}
