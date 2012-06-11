package com.johny.ejb2;

import javax.ejb.EJBLocalHome;
import javax.ejb.CreateException;

public interface HaiLocalHome extends EJBLocalHome
{
	HaiLocal create() throws CreateException;
}
