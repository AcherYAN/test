package com.shiyanlou.lesson5.mapper;

import java.util.List;
import com.shiyanlou.lesson5.domain.Card;

public interface CardMapper {

      /**
     * 通过id查找card
     * @param id
     * @return
     */
    Card selectById(int id);

    /**
     * 模糊查找card
     * @param card
     * @return
     */
    List<Card> fuzzySearch(Card card);

      /**
     * 查找所有card
     * @return
     */
    List<Card> selectAll();

      /**
     * 通过level查找card
     * @param levels
     * @return
     */
    List<Card> selectByLevelId(List<Integer> levels);

      /**
     * 创建card
     * @param card
     * @return
     */
    int insert(Card card);

      /**
     * 通过id更新card
     * @param card
     * @return
     */
    int update(Card card);

      /**
     * 通过id删除card
     * @param id
     * @return
     */
    int delete(int id);
}