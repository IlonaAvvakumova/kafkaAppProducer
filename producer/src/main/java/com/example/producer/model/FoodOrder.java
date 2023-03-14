package com.example.producer.model;
import lombok.Data;
import lombok.Value;

@Value
@Data
public class FoodOrder {
    String item;
    Double amount;
}
