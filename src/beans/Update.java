/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class Update
{ 
    public static void main(String[] args)
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        Employee e=(Employee)s.load(Employee.class, 3);
        e.setName("Guriya");
        e.setPost("C.M");
        s.update(e);
        t.commit();
        s.close();
        System.out.println("Updation Successfully");
        
        
        
       
    }
    
}
