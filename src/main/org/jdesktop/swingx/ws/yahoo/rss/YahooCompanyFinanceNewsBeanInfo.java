/*
 * $Id$
 *
 * Copyright 2004 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.jdesktop.swingx.ws.yahoo.rss;

import org.jdesktop.beans.BeanInfoSupport;

import java.beans.BeanDescriptor;

/**
 *
 * @author rbair
 */
public class YahooCompanyFinanceNewsBeanInfo extends BeanInfoSupport {
    
    /** Creates a new instance of BackgroundWorkerBeanInfo */
    public YahooCompanyFinanceNewsBeanInfo() {
        super(YahooCompanyFinanceNews.class);
    }

    protected void initialize() {
        BeanDescriptor bd = getBeanDescriptor();
        bd.setName("YahooCompanyFinanceNews");
        bd.setShortDescription("A JavaBean for reading financial news feeds for one or more specific companies.");
        
        setHidden(true, "propertyChangeListeners");
    }
    
}
