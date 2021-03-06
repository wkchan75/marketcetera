package org.marketcetera.client.rpc;

import org.marketcetera.client.Client;
import org.marketcetera.client.ClientFactory;
import org.marketcetera.client.ClientInitException;
import org.marketcetera.client.ClientParameters;
import org.marketcetera.client.ConnectionException;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Returns an RPC {@link Client} implementation.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: RpcClientFactory.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@ClassVersion("$Id: RpcClientFactory.java 16901 2014-05-11 16:14:11Z colin $")
public class RpcClientFactory
        implements ClientFactory
{
    /* (non-Javadoc)
     * @see org.marketcetera.client.ClientFactory#getClient(org.marketcetera.client.ClientParameters)
     */
    @Override
    public Client getClient(ClientParameters inClientParameters)
            throws ClientInitException, ConnectionException
    {
        return new RpcClientImpl(inClientParameters);
    }
}
