package com.johny.ejb2;
import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class HaiBean implements SessionBean
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException
    {
        System.out.println("set session context");
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

    public String sayHai() throws RemoteException
    {
        return "Hai, EJB 2!";
    }

}
