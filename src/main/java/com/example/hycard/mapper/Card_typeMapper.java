package com.example.hycard.mapper;

import com.example.hycard.entity.card_type;
import com.example.hycard.entity.gym_card;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface Card_typeMapper {
    public List<card_type> getAll();
}
