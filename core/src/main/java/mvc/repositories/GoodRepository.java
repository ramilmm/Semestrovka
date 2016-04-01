package mvc.repositories;

import mvc.common.GoodInfo;


public interface GoodRepository {

    void addGood(GoodInfo goodInfo);

    void updateGood(GoodInfo goodInfo);

    void deleteGood(Long goodId);

    GoodInfo getGoodById(Long goodId);
}
