
package com.openmarket.example.domain.service;

import com.openmarket.example.dao.UserDao;
import com.openmarket.example.domain.User;

/**
 *
 * @author craigmackay
 */
public class UserServiceImpl 
        extends GenericDomainObjectServiceImpl<UserDao, User, Long> 
        implements UserService {

}
