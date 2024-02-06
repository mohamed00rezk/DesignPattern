package designpattern.patterns.chainOfResponsibility.pattern;

import designpattern.domain.dto.enrichers.ContextType;
import designpattern.domain.dto.enrichers.EnrichersData;
import designpattern.patterns.chainOfResponsibility.service.EnrichContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Log4j2
@Service
@RequiredArgsConstructor
public class HoldingFromInstanceEnricher implements EnrichContext {

    @Override
    public void enrichContext(ContextType contextType, EnrichersData enrichersData){
        enrichersData.Holdings  = List.of(Map.of("holdingFromInstance1" , "data of holdingFromInstance1")) ;
    }


}
