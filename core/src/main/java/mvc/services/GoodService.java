package mvc.services;

import mvc.common.GoodInfo;
import mvc.repositories.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodService {

    @Autowired
    private GoodRepository goodRepository;

    public GoodInfo getGood(Long goodId) {
        return goodRepository.getGoodById(goodId);
    }
}
