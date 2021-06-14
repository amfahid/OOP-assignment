/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepairJob;

/**
 *
 * @author S.Narthu
 */

public class repair {
    private String employee_name;
    private String employee_id;
    private String department;
    private String instrument_type;
    private String instrument_id;
    private String path;
    private String mobile_number;
    private String experence;
    
    public repair(String employee_name, String employee_id, String department, String instrument_type, String instrument_id, String path, String mobile_number, String experence) {
        this.employee_name = employee_name;
        this.employee_id = employee_id;
        this.department = department;
        this.instrument_type = instrument_type;
        this.instrument_id = instrument_id;
        this.path = path;
        this.mobile_number = mobile_number;
        this.experence = experence;
}
     public String getEmployee_Name() {
        return employee_name;
    }

    public String getEmployee_ID() {
        return employee_id;
    }

    public String getDepartment() {
        return department;
    }

    public String getInstrument_Type() {
        return instrument_type;
    }
     public String getInstrument_ID() {
        return instrument_id;
    }

    public String getPath() {
        return path;
    }

    public String getMobile_Number() {
        return mobile_number;
    }

    public String getExperence() {
        return experence;
    }

    String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
