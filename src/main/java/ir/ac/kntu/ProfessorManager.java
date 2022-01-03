package ir.ac.kntu;

import java.util.ArrayList;

public class ProfessorManager {
    private ArrayList<Professor> professorList;

    public ProfessorManager(ArrayList<Professor> professorList) {
        this.professorList = professorList;
    }

    public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<Professor> professorList) {
        this.professorList = professorList;
    }

    public Professor professorChecker(Professor professor) {
        for(Professor aProfessor : professorList){
            if(aProfessor.getProfessorName().equals(professor.getProfessorName()) && aProfessor.getProfessorNumber().equals(professor.getProfessorNumber())){
                return aProfessor;
            }
        }
        return null;
    }

    public void changeProfessorName() {
        System.out.println("Enter professor name");
        String name = ScannerWrapper.getInstance().next();
        if(searchForProfessor(name) != null){
            System.out.println("Enter professor's new name");
            String newName = ScannerWrapper.getInstance().next();
            searchForProfessor(name).setProfessorName(newName);
            System.out.println("Changes were successfully made");
        }
    }

    public void changeProfessorNumber() {
        System.out.println("Enter professor name");
        String name = ScannerWrapper.getInstance().next();
        if(searchForProfessor(name) != null){
            System.out.println("Enter professor's new number");
            String number = ScannerWrapper.getInstance().next();
            searchForProfessor(name).setProfessorNumber(number);
            System.out.println("Changes were successfully made");
        }
    }

    private Professor searchForProfessor(String name) {
        for(Professor professor : professorList){
            if(professor.getProfessorName().equals(name)){
                return professor;
            }
        }
        return null;
    }
}
