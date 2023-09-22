package designpattern.patterns.strategy.pattern;

import designpattern.domain.dto.ScopeTypes;

public class InstanceScopeService extends AbstractScopeService implements ScopeService {

  @Override
  public String getScopeKey() {
    return ScopeTypes.Instance.name();
  }

  @Override
  public String getQueryKey() {
    return "Instance";
  }

}
