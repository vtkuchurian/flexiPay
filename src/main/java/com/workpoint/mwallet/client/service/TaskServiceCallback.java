package com.workpoint.mwallet.client.service;

import com.google.gwt.user.client.Window;
import com.gwtplatform.dispatch.rpc.shared.Result;
import com.workpoint.mwallet.client.ui.events.ErrorEvent;
import com.workpoint.mwallet.client.ui.events.ProcessingCompletedEvent;
import com.workpoint.mwallet.client.util.AppContext;
import com.workpoint.mwallet.shared.responses.BaseResponse;

/**
 * 
 * @author duggan
 *
 * @param <T>
 */
public abstract class TaskServiceCallback<T extends Result> extends ServiceCallback<T> {

	@Override
	public void onSuccess(T aResponse) {
		BaseResponse baseResult = (BaseResponse) aResponse;

		if (baseResult.getErrorCode() == 0) {
			processResult(aResponse);
		} else {
			// throw error
			AppContext.getEventBus().fireEvent(new ProcessingCompletedEvent());
			// AppContext.getEventBus().fireEvent(new
			// ErrorEvent(baseResult.getErrorMessage(),
			// baseResult.getErrorId()));

			Window.alert("Error Occured::" + baseResult.getErrorMessage());
		}

	}
}
