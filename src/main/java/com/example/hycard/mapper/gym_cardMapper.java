package com.example.hycard.mapper;

import com.example.hycard.entity.gym_card;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface gym_cardMapper {
    public List<gym_card> getAll(@Param("ids") Long card_type_id);
    public int insert(gym_card gym);
    public int update(@Param("status")Long status,@Param("id")Long id);

}
