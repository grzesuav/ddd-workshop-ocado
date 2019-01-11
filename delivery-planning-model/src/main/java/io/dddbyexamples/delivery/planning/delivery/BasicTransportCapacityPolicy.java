package io.dddbyexamples.delivery.planning.delivery;

public class BasicTransportCapacityPolicy implements TransportCapacityPolicy {
    @Override
    public StorageUnitsAmounts calculateExceedingAmounts(Transport capacity, StorageUnitsAmounts payload) {
        return payload;
    }
}
