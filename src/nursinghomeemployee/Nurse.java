/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nursinghomeemployee;

/**
 *
 * @author castr
 */
public class Nurse extends NursingHomeEmployee {
    
    public Nurse(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " (ID: " + getEmployeeId() + ") is administering medication for the residents.");
    }
    
}
