/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.triple.test;

import org.topicquests.newasr.triple.ASRTripleEnvironment;
import org.topicquests.newasr.triple.api.ITripleModel;

/**
 * @author jackpark
 *
 */
public class BaseClass {
	protected ASRTripleEnvironment environment;
	protected ITripleModel model;
	/**
	 * 
	 */
	public BaseClass() {
		environment = new ASRTripleEnvironment();
		model = environment.getModel();
	}

}
