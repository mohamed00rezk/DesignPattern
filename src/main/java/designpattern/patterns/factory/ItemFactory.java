package designpattern.patterns.factory;

import designpattern.domain.dto.Item;
import designpattern.domain.dto.ItemStatus;
import designpattern.domain.dto.facory.ItemCheckIn;
import designpattern.domain.dto.facory.ItemCheckOut;
import designpattern.domain.dto.facory.ItemLost;

public class ItemFactory {

    public Item createItem(ItemStatus itemStatus) {
        if (itemStatus.equals(ItemStatus.Lost)) {
                return new ItemLost();
        } else if (itemStatus.equals(ItemStatus.CheckIn)) {
            return new ItemCheckIn();
        }
        else if (itemStatus.equals(ItemStatus.CheckIn)) {
            return new ItemCheckOut();
        }

        return new Item();
    }
}
