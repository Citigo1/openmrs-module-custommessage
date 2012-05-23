/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.custommessage.service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.openmrs.api.OpenmrsService;
import org.openmrs.messagesource.PresentationMessageMap;
import org.openmrs.module.custommessage.CustomMessage;
import org.springframework.transaction.annotation.Transactional;

/**
 * Interface for managing custom messages
 */
@Transactional
public interface CustomMessageService extends OpenmrsService {
	
	/**
	 * @return the CustomMessage with the given id
	 */
	public CustomMessage getCustomMessage(Integer id);
	
	/**
	 * @return the CustomMessage with the given uuid
	 */
	public CustomMessage getCustomMessageByUuid(String uuid);
	
	/**
	 * @return all custom messages defined
	 */
	public List<CustomMessage> getAllCustomMessages();
	
	/**
	 * @return all custom messages for the associated code
	 */
	public List<CustomMessage> getCustomMessagesForCode(String code);

	
	/**
	 * @param customMessage the Custom Message to save to the database
	 */
	public void saveCustomMessage(CustomMessage customMessage);
	
	/**
	 * @param customMessage the Custom Message to delete from the database
	 */
	public void deleteCustomMessage(CustomMessage customMessage);
	
	/**
	 * @return all messages by locale
	 */
	public Map<Locale, PresentationMessageMap> getPresentationMessagesByLocale();
	
	/**
	 * @return all custom messages by code
	 */
	public Map<String, Map<Locale, CustomMessage>> getCustomMessagesByCode();
}
