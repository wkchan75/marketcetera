package org.marketcetera.photon.views;

import org.eclipse.ui.IMemento;
import org.marketcetera.trade.Currency;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Facilitates serialization of an {@link Currency} to an Eclipse {@link IMemento}
 * 
 * 
 */
@ClassVersion("$Id: CurrencyToMemento.java 16901 2014-05-11 16:14:11Z colin $")
public class CurrencyToMemento extends InstrumentToMemento<Currency> {

    static final String CURRENCY_TAG = "currency"; //$NON-NLS-1$
    static final String LEFT_CCY_ATTRIBUTE = "leftCCY"; //$NON-NLS-1$
    static final String RIGHT_CCY_ATTRIBUTE = "rightCCY"; //$NON-NLS-1$
    static final String NEAR_TENOR_ATTRIBUTE = "neartenor"; //$NON-NLS-1$
    static final String FAR_TENOR_ATTRIBUTE = "fartenor"; //$NON-NLS-1$

    /**
     * Constructor.
     */
    public CurrencyToMemento() {
        super(Currency.class);
    }

    @Override
    protected void doSave(Currency instrument, IMemento memento) {
        IMemento currency = memento.createChild(CURRENCY_TAG);
        currency.putString(LEFT_CCY_ATTRIBUTE, instrument.getLeftCCY());
        currency.putString(RIGHT_CCY_ATTRIBUTE, instrument.getRightCCY());
        currency.putString(NEAR_TENOR_ATTRIBUTE, instrument.getNearTenor());
        currency.putString(FAR_TENOR_ATTRIBUTE, instrument.getFarTenor());
    }
}
