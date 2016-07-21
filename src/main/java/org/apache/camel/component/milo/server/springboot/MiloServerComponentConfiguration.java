/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.milo.server.springboot;

import java.util.Collection;
import java.util.Set;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * OPC UA Server based endpoint
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.milo-server")
public class MiloServerComponentConfiguration {

    /**
     * The URI of the namespace defaults to urn:org:apache:camel
     */
    private String namespaceUri;
    /**
     * The application name
     */
    private String applicationName;
    /**
     * The application URI
     */
    private String applicationUri;
    /**
     * The product URI
     */
    private String productUri;
    /**
     * The TCP port the server binds to
     */
    private int bindPort;
    /**
     * Set whether strict endpoint URLs are enforced
     */
    private Boolean strictEndpointUrlsEnabled = false;
    /**
     * Server name
     */
    private String serverName;
    /**
     * Security policies
     */
    private Set<SecurityPolicy> securityPolicies;
    /**
     * Security policies by URI or name
     */
    private Collection<String> securityPoliciesById;
    /**
     * Set user password combinations in the form of user1:pwd1user2:pwd2
     * Usernames and passwords will be URL decoded
     */
    private String userAuthenticationCredentials;
    /**
     * Enable anonymous authentication disabled by default
     */
    private Boolean enableAnonymousAuthentication = false;
    /**
     * Set the addresses of the local addresses the server should bind to
     */
    private String bindAddresses;
    /**
     * Server build info
     */
    private BuildInfo buildInfo;

    public String getNamespaceUri() {
        return namespaceUri;
    }

    public void setNamespaceUri(String namespaceUri) {
        this.namespaceUri = namespaceUri;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationUri() {
        return applicationUri;
    }

    public void setApplicationUri(String applicationUri) {
        this.applicationUri = applicationUri;
    }

    public String getProductUri() {
        return productUri;
    }

    public void setProductUri(String productUri) {
        this.productUri = productUri;
    }

    public int getBindPort() {
        return bindPort;
    }

    public void setBindPort(int bindPort) {
        this.bindPort = bindPort;
    }

    public Boolean getStrictEndpointUrlsEnabled() {
        return strictEndpointUrlsEnabled;
    }

    public void setStrictEndpointUrlsEnabled(Boolean strictEndpointUrlsEnabled) {
        this.strictEndpointUrlsEnabled = strictEndpointUrlsEnabled;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Set<SecurityPolicy> getSecurityPolicies() {
        return securityPolicies;
    }

    public void setSecurityPolicies(Set<SecurityPolicy> securityPolicies) {
        this.securityPolicies = securityPolicies;
    }

    public Collection<String> getSecurityPoliciesById() {
        return securityPoliciesById;
    }

    public void setSecurityPoliciesById(Collection<String> securityPoliciesById) {
        this.securityPoliciesById = securityPoliciesById;
    }

    public String getUserAuthenticationCredentials() {
        return userAuthenticationCredentials;
    }

    public void setUserAuthenticationCredentials(
            String userAuthenticationCredentials) {
        this.userAuthenticationCredentials = userAuthenticationCredentials;
    }

    public Boolean getEnableAnonymousAuthentication() {
        return enableAnonymousAuthentication;
    }

    public void setEnableAnonymousAuthentication(
            Boolean enableAnonymousAuthentication) {
        this.enableAnonymousAuthentication = enableAnonymousAuthentication;
    }

    public String getBindAddresses() {
        return bindAddresses;
    }

    public void setBindAddresses(String bindAddresses) {
        this.bindAddresses = bindAddresses;
    }

    public BuildInfo getBuildInfo() {
        return buildInfo;
    }

    public void setBuildInfo(BuildInfo buildInfo) {
        this.buildInfo = buildInfo;
    }
}