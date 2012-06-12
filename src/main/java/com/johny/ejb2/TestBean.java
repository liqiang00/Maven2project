package com.johny.ejb2;
import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class TestBean implements SessionBean 
{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 2365907040465752270L;
	private SessionContext context;

	public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException
    {
        System.out.println("set session context");
        context= arg0;
    }
   
    public void ejbCreate() throws EJBException
    {
        System.out.println("ejb create");
    }

    public void ejbRemove() throws EJBException, RemoteException
    {
        System.out.println("ejb remove");
    }

    public void ejbActivate() throws EJBException, RemoteException
    {
        System.out.println("ejb activate");
    }

    public void ejbPassivate() throws EJBException, RemoteException
    {
        System.out.println("ejb passivate");
    }

    public String InvokeLocal() throws RemoteException
    {
        HaiLocalHome localhome= (HaiLocalHome) this.context.lookup("HaiEJBLocal");
        try
        {
        HaiLocal local=localhome.create();
        return local.sayHai();
        }
        catch (Exception e)
        {
        	return e.toString();
        }
    }
}
