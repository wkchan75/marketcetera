package org.marketcetera.marketdata.csv;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.marketdata.AbstractMarketDataFeedToken;
import org.marketcetera.marketdata.MarketDataFeedTokenSpec;

/**
 * Token for {@link CSVFeed}.
 * Dummy implementation, we are not doing anything clever in our subscriptions.
 *
 * @author <a href="mailto:toli@marketcetera.com">Toli Kuznets</a>
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @since 2.1.0
 * @version $Id: CSVFeedToken.java 16154 2012-07-14 16:34:05Z colin $
 */
@ClassVersion("$Id: CSVFeedToken.java 16154 2012-07-14 16:34:05Z colin $")
public class CSVFeedToken
        extends AbstractMarketDataFeedToken<CSVFeed>
{
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return String.format("CSVFeedToken [%s]", //$NON-NLS-1$
                             getStatus());
    }
    /**
     * Gets a <code>CSVFeedToken</code> with the given attributes. 
     *
     * @param inTokenSpec a <code>MarketDataFeedTokenSpec</code> value
     * @param inFeed a <code>CSVFeed</code> value
     * @return a <code>CSVFeedToken</code> value
     */
    static CSVFeedToken getToken(MarketDataFeedTokenSpec inTokenSpec,
                                   CSVFeed inFeed) 
    {
        return new CSVFeedToken(inTokenSpec,
                                  inFeed);
    }
    /**
     * Create a new <code>CSVFeedToken</code> instance.
     *
     * @param inTokenSpec a <code>MarketDataFeedTokenSpec</code> value
     * @param inFeed a <code>CSVFeed</code> value
     */
    private CSVFeedToken(MarketDataFeedTokenSpec inTokenSpec,
                         CSVFeed inFeed) 
    {
        super(inTokenSpec,
              inFeed);
    }
}
