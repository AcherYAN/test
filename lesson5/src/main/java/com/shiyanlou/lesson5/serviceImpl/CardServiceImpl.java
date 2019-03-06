package com.shiyanlou.lesson5.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.lesson5.domain.Card;
import com.shiyanlou.lesson5.mapper.CardMapper;
import com.shiyanlou.lesson5.service.CardService;

// 标识service
@Service
public class CardServiceImpl implements CardService{

      // 自动注入mapper
    @Autowired
    private CardMapper cardMapper;

    /**
     * 创建card
     * @param card
     * @return
     */
    public int insertCard(Card card) {
        int modifyId = cardMapper.insert(card);
        return modifyId;
    }

    /**
     * 删除card
     * @param id
     * @return
     */
    public int deleteCard(int id) {
        int modifyId = cardMapper.delete(id);
        return modifyId;
    }

    /**
     * 更新card
     * @param card
     * @return
     */
    public int updateCard(Card card) {
        int modifyId = cardMapper.update(card);
        return modifyId;
    }

    /**
     * 通过id查询card
     * @param id
     * @return
     */
    public Card selectCardById(int id) {
        Card card = cardMapper.selectById(id);
        return card;
    }

    /**
     * 查询所有card
     * @param
     * @return
     */
    public List<Card> selectAllCard() {
        List<Card> cards = cardMapper.selectAll();
        return cards;
    }

    /**
     * 模糊查询card
     * @param card
     * @return
     */
    public List<Card> fuzzySearch(Card card) {
        List<Card> cards = cardMapper.fuzzySearch(card);
        return cards;
    }

    /**
     * 通过levels查询card
     * @param levels
     * @return
     */
    public List<Card> selectCardByLevelId(List<Integer> levels) {
        List<Card> cards = cardMapper.selectByLevelId(levels);
        return cards;
    }
}