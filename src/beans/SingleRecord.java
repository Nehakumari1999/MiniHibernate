/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;
public class SingleRecord 
{
    public static void main(String[] args)
    {   
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter your id=");
        int id=sc.nextInt();
        Employee e=(Employee)s.get(Employee.class, id);
        if(id==0)
        {
            System.out.println("No record found");
        
        }
       
        
        
    
    }
    
}
