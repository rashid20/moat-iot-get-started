/*
 * Copyright (C) 2013 InventIt Inc.
 * 
 * See https://github.com/inventit/moat-iot-get-started
 */
package com.yourinventit.moat.android.example2;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;

import com.yourinventit.dmc.api.moat.ContextFactory;

/**
 * The {@link ContextFactory} providing Android's {@link Context} object.
 * 
 * @author dbaba@yourinventit.com
 * 
 */
public class AndroidContextFactory implements ContextFactory {

	/**
	 * {@link SampleApplication}
	 */
	private final SampleApplication sampleApplication;

	/**
	 * 
	 * @param sampleApplication
	 */
	public AndroidContextFactory(SampleApplication sampleApplication) {
		this.sampleApplication = sampleApplication;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.yourinventit.dmc.api.moat.ContextFactory#createExecutionContext(java.lang.Object,
	 *      java.lang.String)
	 */
	public <T> Map<String, Object> createExecutionContext(T model,
			String methodName) {
		final Map<String, Object> executionContext = new HashMap<String, Object>();
		executionContext.put(Context.class.getName(),
				sampleApplication.getApplicationContext());
		executionContext.put(SerialInputOutputManager.class.getName(),
				sampleApplication.getSerialInputOutputManager());
		return executionContext;
	}

}
