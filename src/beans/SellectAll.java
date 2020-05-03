
package beans;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class SellectAll 
{   
    public static void main(String [] args)
    {
        Configuration con=new Configuration();
        con.configure();
        SessionFactory sf=con.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        String st="from Employee where id>0";//cllass
        Query q=s.createQuery(st);
        List<Employee> list=q.list();
        for(Employee e:list)
        {
            int i=e.getId();
            String n=e.getName();
            String p=e.getPost();
            int sa=e.getSalary();
            String a=e.getAddress();
            System.out.println(i+""+n+""+p+""+sa+" "+a);
        
        }
        
    }
    
}
