package designpattern.patterns.strategy.service;

import designpattern.patterns.strategy.pattern.ScopedEntityService;
import designpattern.patterns.strategy.pattern.UserScopeService;

public class UserService extends ScopedEntityService {

    public UserService() {
        super(new UserScopeService());
    }
}
