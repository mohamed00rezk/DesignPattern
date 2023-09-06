package designpattern.patterns.chainofresponsibilitypattern;

import designpattern.domain.dto.ContextType;
import designpattern.domain.dto.EnrichersData;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Log4j2
@Service
@RequiredArgsConstructor
public class ItemEnricher implements EnrichContext {

    @Override
    public void enrichContext(ContextType contextType, EnrichersData enrichersData){
        enrichersData.Items  = List.of(Map.of("item" , "data of item")) ;
    }
}
