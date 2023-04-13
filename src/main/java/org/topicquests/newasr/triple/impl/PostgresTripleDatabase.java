/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.triple.impl;

import org.topicquests.newasr.api.ISimpleTriple;
import org.topicquests.newasr.triple.ASRTripleEnvironment;
import org.topicquests.newasr.triple.api.ITripleProvider;
import org.topicquests.pg.PostgresConnectionFactory;
import org.topicquests.support.ResultPojo;
import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class PostgresTripleDatabase implements ITripleProvider {
	private ASRTripleEnvironment environment;
	private PostgresConnectionFactory database = null;

	/**
	 * 
	 */
	public PostgresTripleDatabase(ASRTripleEnvironment env) {
		environment = env;
		database = environment.getTripleDatabaseDriver();
	}

	@Override
	public IResult putTriple(ISimpleTriple t) {
		IResult result = new ResultPojo();
		
		return result;
	}

	@Override
	public IResult getTriple(long tripleId) {
		IResult result = new ResultPojo();
		
		return result;
	}

	@Override
	public IResult getThisTriple(ISimpleTriple templae) {
		IResult result = new ResultPojo();
		
		return result;
	}

	@Override
	public IResult addSentenceToTriple(long tripleId, long sentenceId) {
		IResult result = new ResultPojo();
		
		return result;
	}

	@Override
	public IResult listTripleIds() {
		IResult result = new ResultPojo();
		
		return result;
	}

	@Override
	public IResult listTriplesBySentenceId(long sentenceId) {
		IResult result = new ResultPojo();
		
		return result;
	}

}
