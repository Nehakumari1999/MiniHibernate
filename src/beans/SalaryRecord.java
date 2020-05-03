/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


public class SalaryRecord 
{
     public static void main(String[] args)
    {
        Configuration con=new Configuration();
        con.configure();
        SessionFactory sf=con.buildSessionFactory();
        Session s=sf.openSession();
        
        Criteria ct=s.createCriteria(Employee.class);
       ct.add(Restrictions.gt("salary", 10000000));
        List<Employee>list=ct.list();
        for(Employee e:list)
        {
            int i=e.getId();
            String n=e.getName();
            String p=e.getPost();
            int sa=e.getSalary();
            String a=e.getAddress();
            
            System.out.println(i+""+n+""+p+""+sa+""+a);
     




        }
        
    }
}
     
    

