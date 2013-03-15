/*
* Copyright 2012 Devoteam http://www.devoteam.com
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
*
* This file is part of Multi-Protocol Test Suite (MTS).
*
* Multi-Protocol Test Suite (MTS) is free software: you can redistribute
* it and/or modify it under the terms of the GNU General Public License 
* as published by the Free Software Foundation, either version 3 of the 
* License.
* 
* Multi-Protocol Test Suite (MTS) is distributed in the hope that it will
* be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
* of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with Multi-Protocol Test Suite (MTS).  
* If not, see <http://www.gnu.org/licenses/>. 
*
*//*
 * ConnectionSip.java
 *
 * Created on 26 juin 2007, 10:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.devoteam.srit.xmlloader.sip;

import java.util.HashMap;

import javax.sip.address.Hop;

import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.tree.DefaultElement;
import org.dom4j.tree.DefaultElementInterface;

import com.devoteam.srit.xmlloader.core.exception.ExecutionException;
import com.devoteam.srit.xmlloader.core.protocol.Listenpoint;
import com.devoteam.srit.xmlloader.core.protocol.Msg;
import com.devoteam.srit.xmlloader.core.protocol.Stack;
import com.devoteam.srit.xmlloader.core.protocol.StackFactory;

/**
 *
 * @author gpasquiers
 */
public class ListenpointSip extends Listenpoint
{

    /** Creates a new instance of Listenpoint */
    public ListenpointSip(Stack stack) throws Exception
    {
        super(stack);
    }

	/** Creates a Listenpoint specific from XML tree*/
	public ListenpointSip(Stack stack, Element root) throws Exception	
	{
		super(stack, root);
	}
        	
    /** Send a Msg to Connection */
    @Override
    public synchronized boolean sendMessage(Msg msg, String remoteHost, int remotePort, String transport) throws Exception
    {
		if ((remoteHost == null) || (remotePort <= 0)) 
		{        		        	
    		Hop hop = DefaultRouter.getInstance().getNextHop(msg);
    		if (hop == null)
    		{
    			throw new ExecutionException("Could not determine the remote destination from the message : " + msg);
    		}
    		if (remoteHost == null)
    		{
    			remoteHost = hop.getHost();
    		}
    		if (remotePort <= 0)
    		{
    			remotePort = hop.getPort();
    		}
            String trans = hop.getTransport();
            if (transport == null)
            {
            	transport = trans;
            }    		
		}

		return super.sendMessage(msg, remoteHost, remotePort, transport);
    }
        
}