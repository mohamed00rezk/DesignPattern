package designpattern.patterns.chainOfResponsibilityPattern;

import designpattern.domain.dto.enrichers.EnrichersData;
import designpattern.domain.dto.enrichers.ContextType;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Log4j2
@Service
@RequiredArgsConstructor
public class InstanceEnricher implements EnrichContext {

  @Override
  public void enrichContext(ContextType contextType, EnrichersData enrichersData){
    enrichersData.Instances  = List.of(Map.of("instance1" , "data of instance1")) ;
  }


}
