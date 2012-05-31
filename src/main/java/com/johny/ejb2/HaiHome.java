package com.johny.ejb2;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface HaiHome extends EJBHome
{
    HaiRemote create() throws RemoteException, CreateException;
}
