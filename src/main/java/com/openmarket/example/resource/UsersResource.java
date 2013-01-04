
package com.openmarket.example.resource;

import com.openmarket.example.domain.User;
import com.openmarket.example.domain.service.UserService;
import com.openmarket.example.management.Monitored;
import com.sun.jersey.api.spring.Autowire;
import com.sun.jersey.spi.resource.Singleton;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

/**
 *
 * @author craigmackay
 */
@Singleton
@Path("/users")
@Component
@Autowire
public class UsersResource {
    
    private UserService userService;
    
    @GET @Produces({ "application/xml", "application/json" })
    @Monitored("Users Read All")
    public List<User> readAll() {
        return userService.findAll();
    }
    
    @DELETE
    public void deleteAll() {
        userService.deleteAll();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
