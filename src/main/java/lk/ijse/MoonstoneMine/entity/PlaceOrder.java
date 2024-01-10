package lk.ijse.MoonstoneMine.entity;

import lk.ijse.MoonstoneMine.view.tm.CartTm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class PlaceOrder {
    private String orderId;
    private String cusId;
    private LocalDate date;
    private List<CartTm> tmList = new ArrayList<>();
}
