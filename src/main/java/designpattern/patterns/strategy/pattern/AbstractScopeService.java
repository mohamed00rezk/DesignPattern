package designpattern.patterns.strategy.pattern;

public abstract class AbstractScopeService implements ScopeService {

  public String getScopeQuery() {
    return getScopeKey() + getQueryKey();
  }

  public abstract String getScopeKey();

  public abstract String getQueryKey();
}
