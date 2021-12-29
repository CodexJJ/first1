package com.example.hycard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.logging.Logger;

//get,set封装
@Data
//带参构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
public class gym_card {
    private Long id;
    private String user_name;
    private Long card_type_id;
    private int status;
    private String phone;
    private String balance;
    private java.sql.Date open_date;
    private card_type card_type;
}
