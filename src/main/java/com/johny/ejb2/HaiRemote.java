package com.johny.ejb2;
import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface HaiRemote extends EJBObject
{
    String sayHai() throws RemoteException;
}
