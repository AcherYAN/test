package com.shiyanlou.lesson5.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.shiyanlou.lesson5.domain.Card;
import com.shiyanlou.lesson5.domain.ResultObject;
import com.shiyanlou.lesson5.service.CardService;

// 标识controller，返回消息为json格式，URL前缀/card
@RestController
@RequestMapping("card")
public class CardController {

    // 自动注入service
    @Autowired
    private CardService cardService;

      /**
     * 创建card
     * @param card
     * @return
     */
    @PostMapping("add")
    public ResultObject add(@RequestBody Card card) {
        int modifyId = cardService.insertCard(card);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

      /**
     * 删除card
     * @param id
     * @return
     */
    @DeleteMapping("delete/{id}")
    public ResultObject delete(@PathVariable int id) {
        int modifyId = cardService.deleteCard(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

      /**
     * 更新card
     * @param card
     * @return
     */
    @PutMapping("modify")
    public ResultObject modify(@RequestBody Card card) {
        int modifyId = cardService.updateCard(card);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

      /**
     * 通过id查询card
     * @param id
     * @return
     */
    @GetMapping("find/{id}")
    public ResultObject find(@PathVariable int id) {
        Card card = cardService.selectCardById(id);
        Map<String, Card> map = new HashMap<>();
        map.put("card", card);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

      /**
     * 查询所有card
     * @param
     * @return
     */
    @GetMapping("findAll")
    public ResultObject findAll() {
        List<Card> cards = cardService.selectAllCard();
        Map<String, List<Card>> map = new HashMap<>();
        map.put("card", cards);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }


      /**
     * 模糊查询card
     * @param card
     * @return
     */
    @PostMapping("fuzzySearch")
    public ResultObject fuzzySearch(Card card) {
        List<Card> cards = cardService.fuzzySearch(card);
        Map<String, List<Card>> map = new HashMap<>();
        map.put("card", cards);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

      /**
     * 通过levels查询card
     * @param levels
     * @return
     */
    @PostMapping("findByLevelId")
    public ResultObject selectCardByLevelId(String levels) {
        System.out.println("levels" + levels);
        System.out.println("levels-length:" + levels.length());

        String[] strings = levels.split(",");
        List<Integer> ids = new ArrayList<>();

        System.out.println("strings" + Arrays.toString(strings));
        System.out.println(strings.length);

        for(int i = 0; i < levels.length(); i++) {
            ids.add(Integer.parseInt(strings[i]));
        }

        System.out.println("ids" + ids);

        List<Card> cards = cardService.selectCardByLevelId(ids);
        Map<String, List<Card>> map = new HashMap<>();
        map.put("card", cards);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

}

