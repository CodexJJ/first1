package com.example.hycard.serivce.impl;

import com.example.hycard.entity.card_type;
import com.example.hycard.mapper.Card_typeMapper;
import com.example.hycard.serivce.card_typeSerivce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class card_typeSerivceImpl implements card_typeSerivce {
    @Resource
    public Card_typeMapper card_typeMapper;
    @Override
    public List<card_type> getAll() {
        return card_typeMapper.getAll();
    }
}
