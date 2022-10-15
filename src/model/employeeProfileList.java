/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class employeeProfileList {
    private ArrayList<employeeProfile> emp;
    
    public employeeProfileList(){
        
        this.emp = new ArrayList<employeeProfile>();
    }

    public ArrayList<employeeProfile> getEmp() {
        return emp;
    }

    public void setEmp(ArrayList<employeeProfile> emp) {
        this.emp = emp;
    }
    
   
    public employeeProfile addNewEmp(){
        employeeProfile newEmp = new employeeProfile();
        emp.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmp(employeeProfile ep){
        emp.remove(ep);

    }
}

    

