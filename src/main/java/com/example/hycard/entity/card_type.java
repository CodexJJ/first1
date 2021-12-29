package com.example.hycard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.logging.Logger;
//get,set封装
@Data
//带参构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
public class card_type {
    private Long id;
    private String name;
}
