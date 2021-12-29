package com.example.hycard.contorller;

import com.alibaba.fastjson.JSON;
import com.example.hycard.entity.gym_card;
import com.example.hycard.serivce.gym_cardSerivce;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class gym_CardController {
    @Resource
    private gym_cardSerivce serivce;
    @RequestMapping("/all")
    public String all(Model model,@RequestParam(value = "id",required = false,defaultValue = "0") String card_type_id){
        Long ids=Long.parseLong(card_type_id);
        List<gym_card> gymCardList=serivce.getAll(ids);
        model.addAttribute("gymCardList",gymCardList);
        model.addAttribute("name",ids);
        return "index";
    }
    @RequestMapping("/add")
    public String insert(gym_card gym_card)
    {
        gym_card.setStatus(0);
        int cont=serivce.insert(gym_card);
        if (cont>0)
        {
            return "redirect:/all";
        }
        else
        {
            return null;
        }
    }
    @RequestMapping("/toadd")
    public String toadd()
    {
        return "add";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(@RequestParam("status") Long status,@RequestParam("id") Long id){
        int count=serivce.update(status,id);
        if(count>0){
            return JSON.toJSONString("true");
        }else {
            return JSON.toJSONString("false");
        }
    }

}
