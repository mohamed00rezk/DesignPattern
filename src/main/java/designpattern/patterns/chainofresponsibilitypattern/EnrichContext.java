package designpattern.patterns.chainofresponsibilitypattern;

import designpattern.domain.dto.EnrichersData;
import designpattern.domain.dto.ContextType;


public interface EnrichContext {
   void enrichContext(ContextType contextType, EnrichersData contextData);
}
