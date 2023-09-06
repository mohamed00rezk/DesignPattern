package designpattern.patterns.chainofresponsibilitypattern;

import designpattern.domain.dto.EnrichersData;
import designpattern.domain.dto.ContextType;
import designpattern.domain.dto.InventoryTypes;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Log4j2
@Service
@RequiredArgsConstructor
public class ChainContextData {

    private final Map<InventoryTypes, List<EnrichContext>> enrichers = Map.of(
            InventoryTypes.Instance, List.of(new InstanceEnricher(), new HoldingFromInstanceEnricher(), new ItemFromHoldingEnricher()),
            InventoryTypes.Holding, List.of(new HoldingEnricher(), new InstanceFromHoldingsEnricher(), new ItemFromHoldingEnricher()),
            InventoryTypes.Item, List.of(new ItemEnricher(), new HoldingFromItemEnricher(), new InstanceFromHoldingsEnricher())
    );

    public EnrichersData getContext(ContextType contextType) {
        InventoryTypes inventoryType = InventoryTypes.Instance; //assume -> Type Instances
        EnrichersData contextData = new EnrichersData();

        enrichers.get(inventoryType)
                .forEach(en -> en.enrichContext(contextType, contextData));

        return contextData;
    }

}
