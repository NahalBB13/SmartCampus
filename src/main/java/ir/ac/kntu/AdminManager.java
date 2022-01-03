package ir.ac.kntu;

import java.util.ArrayList;

public class AdminManager {
    private ArrayList<Admin> adminList;

    public AdminManager(ArrayList<Admin> adminList) {
        this.adminList = adminList;
    }

    public void setAdminList(ArrayList<Admin> adminList) {
        this.adminList = adminList;
    }

    public Admin adminChecker(Admin admin){
        for (Admin anAdmin : adminList) {
            if(anAdmin.getId().equals(admin.getId()) && anAdmin.getPassword().equals(admin.getPassword())){
                return anAdmin;
            }
        }
        return null;
    }
}
