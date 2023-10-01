/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nursinghomeemployee;

/**
 *
 * @author castr
 */
public class HealthCare extends NursingHomeEmployee {
    
    public HealthCare(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " (ID: " + getEmployeeId() + ") is assisting with the showers.");
    }

    
}
