package com.example.houduan.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer itemQuantity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(
            name = "orderId",/*这里和数据库表的列名对应*/
            referencedColumnName = "orderId"/*这里和entity的Business类里面的属性对应*/
    )
    private OrderTable orderTable;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumns({
            @JoinColumn(name = "itemId", referencedColumnName = "itemId"),
            @JoinColumn(name = "itemName", referencedColumnName = "itemName"),
    })
    private Item item;

}
