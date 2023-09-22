package designpattern.patterns.strategy.service;

import designpattern.patterns.strategy.pattern.ScopedEntityService;
import designpattern.patterns.strategy.pattern.UserScopeService;

public class userService extends ScopedEntityService {

    public userService() {
        super(new UserScopeService());
    }
}
