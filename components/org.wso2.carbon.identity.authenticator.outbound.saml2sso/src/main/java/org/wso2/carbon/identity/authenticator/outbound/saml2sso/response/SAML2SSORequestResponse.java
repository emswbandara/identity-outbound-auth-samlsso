/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.authenticator.outbound.saml2sso.response;

import org.opensaml.saml2.core.RequestAbstractType;
import org.wso2.carbon.identity.gateway.api.response.GatewayResponse;

/**
 * The abstract model independent from binding representing an AuthnRequest sent to the federated IdP.
 */
public abstract class SAML2SSORequestResponse extends GatewayResponse {

    protected String saml2SSOUrl;
    protected RequestAbstractType samlRequest;
    protected String relayState;

    protected SAML2SSORequestResponse(SAML2SSORequestResponseBuilder builder) {
        super(builder);
        saml2SSOUrl = builder.saml2SSOUrl;
        samlRequest = builder.samlRequest;
        relayState = builder.relayState;
    }

    public String getSaml2SSOUrl() {
        return saml2SSOUrl;
    }

    public RequestAbstractType getSamlRequest() {
        return samlRequest;
    }

    public String getRelayState() {
        return relayState;
    }

    /**
     * The abstract builder for building SAML2SSORequestResponse.
     */
    public abstract static class SAML2SSORequestResponseBuilder extends GatewayResponseBuilder {

        protected String saml2SSOUrl;
        protected RequestAbstractType samlRequest;
        protected String relayState;

        public SAML2SSORequestResponse.SAML2SSORequestResponseBuilder setSaml2SSOUrl(String saml2SSOUrl) {
            this.saml2SSOUrl = saml2SSOUrl;
            return this;
        }

        public SAML2SSORequestResponse.SAML2SSORequestResponseBuilder setSamlRequest(RequestAbstractType samlRequest) {
            this.samlRequest = samlRequest;
            return this;
        }

        public SAML2SSORequestResponse.SAML2SSORequestResponseBuilder setRelayState(String relayState) {
            this.relayState = relayState;
            return this;
        }

    }
}
