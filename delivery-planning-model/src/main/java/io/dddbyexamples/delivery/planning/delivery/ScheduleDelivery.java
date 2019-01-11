package io.dddbyexamples.delivery.planning.delivery;

import io.dddbyexamples.delivery.planning.delivery.Payload;
import io.dddbyexamples.delivery.planning.delivery.Transport;
import lombok.Value;

@Value
public class ScheduleDelivery {
    Transport transport;
    Payload payload;
}
