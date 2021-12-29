package com.example.hycard.serivce;

import com.example.hycard.entity.gym_card;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface gym_cardSerivce {
    public List<gym_card> getAll(Long cardtype);
    public int insert(gym_card gym);
    public int update(Long status,Long id);
}
