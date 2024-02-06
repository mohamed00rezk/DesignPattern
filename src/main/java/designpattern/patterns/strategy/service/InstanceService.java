package designpattern.patterns.strategy.service;

import designpattern.patterns.strategy.pattern.InstanceScopeService;
import designpattern.patterns.strategy.pattern.ScopedEntityService;

public class InstanceService extends ScopedEntityService {

    public InstanceService() {
        super(new InstanceScopeService());
    }
}
