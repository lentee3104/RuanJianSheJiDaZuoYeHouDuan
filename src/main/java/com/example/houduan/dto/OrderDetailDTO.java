package com.example.houduan.dto;

import com.example.houduan.entity.Item;
import com.example.houduan.entity.OrderList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO {
    private Integer orderId;
    private Integer orderState;
    private Double orderCost;
    private Integer customerId;
    private Integer shopId;
    private String shopName;
    private String customerName;
    private List<OrderListDTO> orderListDTOList;
}
