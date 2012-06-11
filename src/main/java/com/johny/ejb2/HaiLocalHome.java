package com.johny.ejb2;

import javax.ejb.EJBLocalHome;

public interface HaiLocalHome extends EJBLocalHome
{
	HaiLocal create() throws Exception;
}
