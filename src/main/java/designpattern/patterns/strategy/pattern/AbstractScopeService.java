package designpattern.patterns.strategy.pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractScopeService implements ScopeService {
  private static final Logger logger = LogManager.getLogger();

  public String getScopeQuery() {
    return getScopeKey() + getQueryKey();
  }

  public abstract String getScopeKey();

  public abstract String getQueryKey();
}
