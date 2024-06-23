package com.bractits.inventoryservice.utils.event;

import com.bractits.inventoryservice.data.dto.OrderDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent {

    private final UUID id = UUID.randomUUID();

    private final LocalDateTime date = LocalDateTime.now();

    private OrderDTO data;

}