/*
 * Copyright 2019 Dynatrace LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dynatrace.oneagent.sdk.impl.proxy;

import com.dynatrace.oneagent.sdk.api.enums.ChannelType;
import com.dynatrace.oneagent.sdk.api.infos.DatabaseInfo;

public class DatabaseInfoImpl implements DatabaseInfo {

	private final String name;
	private final String vendor;
	private final ChannelType channelType;
	private final String channelEndpoint;

	DatabaseInfoImpl(String name, String vendor, ChannelType channelType, String channelEndpoint) {
		this.name = name;
		this.vendor = vendor;
		this.channelType = channelType;
		this.channelEndpoint = channelEndpoint;
	}
	
	String getName() {
		return name;
	}
	
	String getVendor() {
		return vendor;
	}
	
	ChannelType getChannelType() {
		return channelType;
	}
	
	String getChannelEndpoint() {
		return channelEndpoint;
	}
}