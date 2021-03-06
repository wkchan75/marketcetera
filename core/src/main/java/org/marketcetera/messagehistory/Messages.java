package org.marketcetera.messagehistory;

import org.marketcetera.util.log.I18NLoggerProxy;
import org.marketcetera.util.log.I18NMessage0P;
import org.marketcetera.util.log.I18NMessageProvider;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * The internationalization constants used by this package.
 *
 * @author klim@marketcetera.com
 * @since 0.6.0
 * @version $Id: Messages.java 16154 2012-07-14 16:34:05Z colin $
 */
@ClassVersion("$Id: Messages.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public interface Messages
{
    /**
     * The message provider.
     */

    static final I18NMessageProvider PROVIDER = 
        new I18NMessageProvider("messagehistory"); //$NON-NLS-1$

    /**
     * The logger.
     */

    static final I18NLoggerProxy LOGGER = 
        new I18NLoggerProxy(PROVIDER);

    /*
     * The messages.
     */

    static final I18NMessage0P SHOULD_NEVER_HAPPEN_IN_ADDINCOMINGMESSAGE = 
        new I18NMessage0P(LOGGER,"should_never_happen_in_addincomingmessage"); //$NON-NLS-1$
    static final I18NMessage0P SHOULD_NEVER_HAPPEN_IN_UPDATEORDERIDMAPPINGS = 
        new I18NMessage0P(LOGGER,"should_never_happen_in_updateorderidmappings"); //$NON-NLS-1$
    static final I18NMessage0P UNEXPECTED_ERROR = 
    	    new I18NMessage0P(LOGGER,"unexpected_error"); //$NON-NLS-1$
   
}
