package com.example.houduan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderListDTO {
    private Integer Id;
    private Integer orderId;
    private Integer itemId;
    private String itemName;
    private Integer itemQuantity;
    private Double itemPrice;
}
