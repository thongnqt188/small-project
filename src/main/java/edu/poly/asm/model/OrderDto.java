package edu.poly.asm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long orderId;
    private Date orderDate;

    private int customerId;
    private long productId;

    private double amount;
    private short status;

    private Boolean isEdit = false;
}