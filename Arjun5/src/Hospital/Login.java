package Hospital;

import java.io.PrintWriter;


import com.hospital.dao.HospitalDao;

public class Login {
 
    public static boolean authenticate(String username, String password) {
    
        // hardcoded username and password
    	if(HospitalDao.validate(username, password)){ 
            return true;
           
        }
        return false;
    }
    
}