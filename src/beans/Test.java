/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Test
{
    public static void main(String[] args)
    {
        Configuration cfg=new  Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session  s=sf.openSession();
        Employee e=new Employee();
        e.setName("Sinu");
        e.setPost("CEO");
        e.setSalary(1000000000);
        e.setAddress("BAB");
        
        Transaction t=s.beginTransaction();
        s.save(e);
        t.commit();
        s.close();
        sf.close();
        
        System.out.println("INSERTED SUCCESSFULLY");
    }
}
