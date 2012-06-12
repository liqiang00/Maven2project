package com.johny.ejb2;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface TestHome extends EJBHome 
{
    TestRemote create() throws RemoteException, CreateException;
}
