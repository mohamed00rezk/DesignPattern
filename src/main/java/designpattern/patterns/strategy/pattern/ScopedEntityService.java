package designpattern.patterns.strategy.pattern;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Log4j2
@AllArgsConstructor
public  class ScopedEntityService {
  private static final Logger logger = LogManager.getLogger();

  private final ScopeService scopeService;

  public String getQuery() {
    return scopeService.getScopeQuery();
  }

}
