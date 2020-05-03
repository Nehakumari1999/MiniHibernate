/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class Delete 
{
     public static void main(String[] args)
     {  
         Configuration cfg=new Configuration();
         cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Employee e=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id ");
        int i=sc.nextInt();
        
        e.setId(i);
        Session ss=sf.openSession();
        ss.delete(e);
        
        Transaction t=ss.beginTransaction();
        t.commit();
        s.close();
        System.out.println("Deleted");
         
     
     }
}
