/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.triple;

import org.topicquests.newasr.impl.ASRBaseEnvironment;
import org.topicquests.newasr.triple.api.IASRTripleDataProvider;
import org.topicquests.newasr.triple.api.IASRTripleModel;

/**
 * @author jackpark
 *
 */
public class ASRTripleEnvironment extends ASRBaseEnvironment {
	private IASRTripleModel model = null;
	private IASRTripleDataProvider database = null;
	
	/**
	 * 
	 */
	public ASRTripleEnvironment() {
		super("asr-triple-config.xml");
		// TODO Auto-generated constructor stub
	}

	public IASRTripleModel getModel() {
		return model;
	}
	
	public IASRTripleDataProvider getDatabase() {
		return database;
	}
	
	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}

}
