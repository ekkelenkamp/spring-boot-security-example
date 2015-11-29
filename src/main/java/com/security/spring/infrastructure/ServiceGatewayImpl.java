package com.security.spring.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.security.spring.api.samplestuff.ServiceGateway;
import com.security.spring.domain.DomainUser;
import com.security.spring.domain.Stuff;

@Component
public class ServiceGatewayImpl extends ServiceGatewayBase implements ServiceGateway {

    @Autowired
    public ServiceGatewayImpl(AuthenticatedExternalServiceProvider authenticatedExternalServiceProvider) {
        super(authenticatedExternalServiceProvider);
    }

    public List<Stuff> getSomeStuff() {
        String stuffFromExternalWebService = externalService().getSomeStuff();
        // do some processing, create return list
        return null;
    }

    public void createStuff(Stuff newStuff, DomainUser domainUser) {
        // do some processing, store domainUser in newStuff, send newStuff over the wire to external web service etc.
    }
}

