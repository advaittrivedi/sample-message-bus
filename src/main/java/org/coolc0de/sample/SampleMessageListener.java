package org.coolc0de.sample;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

public class SampleMessageListener implements MessageListener {
	
	private static Log _log = LogFactoryUtil.getLog(SampleMessageListener.class);

	public void receive(Message message) throws MessageListenerException {
		_log.info("this is listener");
		_log.info("message received: "+message);
	}
}
