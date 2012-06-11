package com.johny.ejb2;
import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface TestRemote extends EJBObject 
{
    public String InvokeLocal() throws RemoteException;
}
