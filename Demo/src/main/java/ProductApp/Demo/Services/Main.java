package ProductApp.Demo.Services;

import ProductApp.Demo.Entities.LibraryManager;
import ProductApp.Demo.Entities.LibraryMember;

public class Main {
    public static void main(String[] args){
        LibraryManager manager=new LibraryManager();
        manager.initializeMembers();
        manager.addMember(new LibraryMember("M5-05","Nasser","Premium"));
        manager.displayMembers();
        manager.deleteMemberById("M4-04");
        manager.displayMembers();
    }
}
