package com.shiyanlou.lesson5.service;

import java.util.List;
import com.shiyanlou.lesson5.domain.Card;

public interface CardService {

      /**
     * 创建card
     * @param card
     * @return
     */
    public int insertCard(Card card);

      /**
     * 删除card
     * @param id
     * @return
     */
    public int deleteCard(int id);

      /**
     * 更新card
     * @param card
     * @return
     */
    public int updateCard(Card card);

      /**
     * 通过id查找card
     * @param id
     * @return
     */
    public Card selectCardById(int id);

      /**
     * 查找所有card
     * @return
     */
    public List<Card> selectAllCard();

      /**
     * 模糊查询card
     * @param card
     * @return
     */
    public List<Card> fuzzySearch(Card card);

      /**
     * 通过levelIds查找card
     * @param levels
     * @return
     */
    public List<Card> selectCardByLevelId(List<Integer> levels);
}