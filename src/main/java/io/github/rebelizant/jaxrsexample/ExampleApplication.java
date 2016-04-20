package io.github.rebelizant.jaxrsexample;

import io.github.rebelizant.jaxrsexample.rest.CustomerResourceImpl;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * @author rebelizant
 *         Created on 18.04.16
 */
@ApplicationPath("/")
public class ExampleApplication extends ResourceConfig {

    public ExampleApplication() {
        register(new CustomerResourceImpl());
    }

}
