package org.marketcetera.photon.views.fixmessagedetail.dialogs.executionreport.data;

import java.math.BigDecimal;

import org.marketcetera.photon.Messages;
import org.marketcetera.trade.ExecutionReport;

import quickfix.Message;
import quickfix.field.OrderQty;

/**
 * Order quantity execution report field
 * 
 * @author milan
 *
 */
public class OrderQtyField extends ExecutionReportField 
{
	@Override
	public String getFieldName() 
	{
		return Messages.EXECUTION_REPORT_FIELD_ORDER_QTY.getText();
	}

	@Override
	public String[] getValues() 
	{
		return NULL_VALUE;
	}

	@Override
	public void insertField(Message message) 
	{
        if(fValue != null && fValue != EMPTY_STRING) {
			message.setField(new OrderQty(new BigDecimal(fValue)));
		}
	}

	@Override
	public boolean validateValue() 
	{
		if(!super.validateValue())
		{
			return false;
		}
		try
		{
			new BigDecimal(fValue);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}
	
	@Override
	public String getValidateMessage() 
	{
		return Messages.ADD_EXECUTION_REPORT_NUMBER_FORMAT_ERROR.getText();
	}

	@Override
	public void parseFromReport(ExecutionReport executionReport) 
	{
		fValue = (executionReport.getOrderQuantity() == null) ? EMPTY_STRING : executionReport.getOrderQuantity().toPlainString();
	}

	@Override
	public int getFieldTag() 
	{
		return OrderQty.FIELD;
	}
}
