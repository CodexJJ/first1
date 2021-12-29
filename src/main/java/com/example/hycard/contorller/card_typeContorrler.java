package com.example.hycard.contorller;

import com.alibaba.fastjson.JSON;
import com.example.hycard.entity.card_type;
import com.example.hycard.serivce.card_typeSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/type")
public class card_typeContorrler {
    @Resource
    private card_typeSerivce card_typeSerivce;
    @RequestMapping("/all")
    @ResponseBody
    public String getall(){
        List<card_type> list=card_typeSerivce.getAll();
        return JSON.toJSONString(list);
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
