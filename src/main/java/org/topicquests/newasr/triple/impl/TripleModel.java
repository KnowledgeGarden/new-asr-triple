/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.triple.impl;

import org.topicquests.newasr.api.ISimpleTriple;
import org.topicquests.newasr.triple.ASRTripleEnvironment;
import org.topicquests.newasr.triple.api.ITripleModel;
import org.topicquests.newasr.triple.api.ITripleProvider;
import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class TripleModel implements ITripleModel {
	private ASRTripleEnvironment environment;
	private ITripleProvider database;
	/**
	 * 
	 */
	public TripleModel(ASRTripleEnvironment env) {
		environment = env;
		database = new PostgresTripleDatabase(environment);
	}

	@Override
	public IResult putTriple(ISimpleTriple t) {
		return database.putTriple(t);
	}

	@Override
	public IResult getTriple(long tripleId) {
		return database.getTriple(tripleId);
	}

	@Override
	public IResult getThisTriple(ISimpleTriple template) {
		return database.getThisTriple(template);
	}

	@Override
	public IResult addSentenceToTriple(long tripleId, long sentenceId) {
		return database.addSentenceToTriple(tripleId, sentenceId);
	}

	@Override
	public IResult listTripleIds() {
		return database.listTripleIds();
	}

	@Override
	public IResult listTriplesBySentenceId(long sentenceId) {
		return database.listTriplesBySentenceId(sentenceId);
	}

}
