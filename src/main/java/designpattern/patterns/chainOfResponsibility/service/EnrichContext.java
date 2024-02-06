package designpattern.patterns.chainOfResponsibility.service;

import designpattern.domain.dto.enrichers.EnrichersData;
import designpattern.domain.dto.enrichers.ContextType;


public interface EnrichContext {
   void enrichContext(ContextType contextType, EnrichersData contextData);
}
