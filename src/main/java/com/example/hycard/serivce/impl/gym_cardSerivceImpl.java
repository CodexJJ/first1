package com.example.hycard.serivce.impl;

import com.example.hycard.entity.gym_card;
import com.example.hycard.mapper.gym_cardMapper;
import com.example.hycard.serivce.gym_cardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class gym_cardSerivceImpl implements gym_cardSerivce {
    @Resource
    private gym_cardMapper gym_cardMapper;
    @Override
    public List<gym_card> getAll(Long card_type_id) {
        return gym_cardMapper.getAll(card_type_id);
    }

    @Override
    public int insert(gym_card gym) {
        return gym_cardMapper.insert(gym);
    }


    @Override
    public int update(Long status, Long id) {
        return gym_cardMapper.update(status,id);
    }
}
