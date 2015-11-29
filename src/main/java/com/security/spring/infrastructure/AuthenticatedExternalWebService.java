package com.security.spring.infrastructure;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.security.spring.infrastructure.externalwebservice.ExternalWebServiceStub;
import com.security.spring.infrastructure.security.AuthenticationWithToken;

public class AuthenticatedExternalWebService extends AuthenticationWithToken {

    private ExternalWebServiceStub externalWebService;

    public AuthenticatedExternalWebService(Object aPrincipal, Object aCredentials, Collection<? extends GrantedAuthority> anAuthorities) {
        super(aPrincipal, aCredentials, anAuthorities);
    }

    public void setExternalWebService(ExternalWebServiceStub externalWebService) {
        this.externalWebService = externalWebService;
    }

    public ExternalWebServiceStub getExternalWebService() {
        return externalWebService;
    }
}
