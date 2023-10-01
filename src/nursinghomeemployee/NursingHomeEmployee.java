/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nursinghomeemployee;

/**
 *
 * @author castr
 */
public class NursingHomeEmployee {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        private String name;
        private int employeeId;
    
        public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
        
     public void performDuties() {
        System.out.println(name + " is doing their job!");
    }
}
}


    
    
   