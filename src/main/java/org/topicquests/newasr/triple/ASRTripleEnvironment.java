/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.triple;

import org.topicquests.newasr.triple.api.ITripleProvider;
import org.topicquests.newasr.triple.impl.TripleModel;
import org.topicquests.pg.PostgresConnectionFactory;
import org.topicquests.newasr.triple.api.ITripleModel;
import org.topicquests.newasr.impl.ASRBaseEnvironment;

/**
 * @author jackpark
 *
 */
public class ASRTripleEnvironment extends ASRBaseEnvironment {
	private ITripleModel model;
	private ITripleProvider database = null;
	private PostgresConnectionFactory driver = null;

	
	/**
	 * 
	 */
	public ASRTripleEnvironment() {
		super("asr-triple-config.xml");
		model = new TripleModel(this);

	}

	public PostgresConnectionFactory getTripleDatabaseDriver() {
		return driver;
	}
	public ITripleModel getModel() {
		return model;
	}
	
	public ITripleProvider getDatabase() {
		return database;
	}
	
	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}

}
