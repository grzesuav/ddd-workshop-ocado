package io.dddbyexamples.delivery.planning.delivery;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class StorageUnitsAmounts {
    int pallets;
    int cages;
    int trailers;
}
