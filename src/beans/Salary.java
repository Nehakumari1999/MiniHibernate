package beans;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class Salary
{   
    public static void main(String[] args)
    {
        Configuration con=new Configuration();
        con.configure();
        SessionFactory sf=con.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        Query ql=s.createQuery("select count(id) from Employee");
        List<Integer>list1=ql.list();
        System.out.println(list1);
        
        Query q2=s.createQuery("select sum(salary) from Employee");
        List<Integer>list2=q2.list();
        System.out.println(list2.get(0));
        
        
        
        
        
        t.commit();
        s.close();
    }
    

}
    
