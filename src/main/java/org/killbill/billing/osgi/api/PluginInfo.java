/*
 * Copyright 2010-2013 Ning, Inc.
 * Copyright 2015 Groupon, Inc
 * Copyright 2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.osgi.api;

import java.util.Set;

public interface PluginInfo {

    /**
     *
     * @return the osgi bundle symbolic name
     */
    public String getBundleSymbolicName();

    /**
     *
     * @return the killbill plugin name (as seen on the filesystem)
     */
    public String getPluginName();

    /**
     *
     * @return the killbill plugin version (as seen on the filesystem)
     */
    public String getVersion();

    /**
     *
     * @return whether plugin is running
     */
    public PluginState getPluginState();

    /**
     *
     * @return the set of services this plugin registered
     */
    public Set<PluginServiceInfo> getServices();

}
