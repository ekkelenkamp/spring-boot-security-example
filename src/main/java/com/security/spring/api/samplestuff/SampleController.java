package com.security.spring.api.samplestuff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.security.spring.api.ApiController;
import com.security.spring.domain.CurrentlyLoggedUser;
import com.security.spring.domain.DomainUser;
import com.security.spring.domain.Stuff;

@RestController
@PreAuthorize("hasAuthority('ROLE_DOMAIN_USER')")
public class SampleController extends ApiController {
    private final ServiceGateway serviceGateway;

    @Autowired
    public SampleController(ServiceGateway serviceGateway) {
        this.serviceGateway = serviceGateway;
    }

    @RequestMapping(value = STUFF_URL, method = RequestMethod.GET)
    public List<Stuff> getSomeStuff() {
        return serviceGateway.getSomeStuff();
    }

    @RequestMapping(value = STUFF_URL, method = RequestMethod.POST)
    public void createStuff(@RequestBody Stuff newStuff, @CurrentlyLoggedUser DomainUser domainUser) {
        serviceGateway.createStuff(newStuff, domainUser);
    }
}
