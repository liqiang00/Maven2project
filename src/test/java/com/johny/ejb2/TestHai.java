package com.johny.ejb2;
import java.util.Properties;
import javax.ejb.CreateException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import java.rmi.RemoteException;
import com.johny.ejb2.*;


public class TestHai {

	public static void main(String[] args)
    {
        System.out.println("===========================================================");
        Properties props = new Properties();
        props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
        props.setProperty("java.naming.provider.url", "localhost:1099");
        props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
        try
        {
            InitialContext ctx = new InitialContext(props);
           
            Object objRef = ctx.lookup("HaiEJB");
           
            HaiHome home = (HaiHome) PortableRemoteObject.narrow(objRef, HaiHome.class);
           
            HaiRemote remote = home.create();
           
            System.out.println(remote.sayHai());
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
	
}