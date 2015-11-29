package com.security.spring.api.samplestuff;

import java.util.List;

import com.security.spring.domain.DomainUser;
import com.security.spring.domain.Stuff;

public interface ServiceGateway {
    List<Stuff> getSomeStuff();

    void createStuff(Stuff newStuff, DomainUser domainUser);
}
