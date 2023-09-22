package designpattern.patterns.strategy.pattern;

import designpattern.domain.dto.ScopeTypes;

public class UserScopeService extends AbstractScopeService implements ScopeService {

  @Override
  public String getScopeKey() {
    return ScopeTypes.User.name();
  }

  @Override
  public String getQueryKey() {
    return "libraryId";
  }
}
