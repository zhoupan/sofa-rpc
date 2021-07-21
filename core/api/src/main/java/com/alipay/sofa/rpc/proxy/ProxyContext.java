/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.proxy;

/**
 * ProxyContext.
 * @author zhoupan
 */
public class ProxyContext {

    /** The instance. */
    private static ProxyContext instance = new ProxyContext();

    /**
     * Gets the single instance of ProxyContext.
     *
     * @return single instance of ProxyContext
     */
    public static synchronized ProxyContext getInstance() {
        return instance;
    }

    /**
     * Sets the instance.
     *
     * @param instance the new instance
     */
    public static synchronized void setInstance(ProxyContext instance) {
        ProxyContext.instance = instance;
    }

    /** The proxy ext instance. */
    private Proxy proxyExtInstance;

    /**
     * Gets the proxy ext instance.
     *
     * @return the proxy ext instance
     */
    public synchronized Proxy getProxyExtInstance() {
        return proxyExtInstance;
    }

    /**
     * Sets the proxy ext instance.
     *
     * @param proxyExtInstance the new proxy ext instance
     */
    public synchronized void setProxyExtInstance(Proxy proxyExtInstance) {
        this.proxyExtInstance = proxyExtInstance;
    }

    /**
     * Checks if is proxy ext instance present.
     *
     * @return true, if is proxy ext instance present
     */
    public synchronized boolean isProxyExtInstancePresent() {
        return this.proxyExtInstance != null;
    }

}
