package mvc.services;

import mvc.common.CategoryInfo;
import mvc.common.GoodInfo;
import mvc.common.MenuInfo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Service
public class MenuService {

    /**
     * Получаем основное меню сайта
     */
    public List<MenuInfo> getMainMenu() {
        List<MenuInfo> listMenu = new ArrayList<MenuInfo>();
        listMenu.add(new MenuInfo(1L, "Fantasy", "#", getCategoryForMenu(1L)));
        listMenu.add(new MenuInfo(2L, "Non-fiction", "#", getCategoryForMenu(2L)));
        listMenu.add(new MenuInfo(3L, "Science", "#", getCategoryForMenu(3L)));
        listMenu.add(new MenuInfo(4L, "Comedy", "#", getCategoryForMenu(4L)));
        return listMenu;
    }

    /**
     * Получаем список популярных товаров для определенного элемента меню
     */
    public List<GoodInfo> getTrendsForMenu(Long menuId) {
        CategoryInfo category = new CategoryInfo(1L, "Watches", null);
        List<GoodInfo> trendGoods = new ArrayList<GoodInfo>();
        trendGoods.add(new GoodInfo("Book1",new BigDecimal(87),category,"BestSeller",19L,"Pushkin","Russia",300L,
                "/images/books/Blok1.jpg","lalaalllallalal"));
        trendGoods.add(new GoodInfo("Book2",new BigDecimal(36),category,"New arrival",20L,"Dostoevskiy","Russia",98L,
                "/images/books/Blok2.jpg","lalalallalal2"));
        trendGoods.add(new GoodInfo("Book3",new BigDecimal(72),category, "New arrival", 21L, "Akhmatova","Russia",520L,
                "/images/books/Blok3.jpg","lalalalallala3"));
        return trendGoods;
    }

    /**
     * Получаем категории для отображения в меню
     */
    public List<CategoryInfo> getCategoryForMenu(Long menuId) {
        List<CategoryInfo> categories = new ArrayList<CategoryInfo>();
        List<CategoryInfo> fantasy = new ArrayList<CategoryInfo>();

        categories.add(new CategoryInfo(11L, "Fantasy", fantasy));

        List<CategoryInfo> nonfiction = new ArrayList<CategoryInfo>();

        categories.add(new CategoryInfo(22L, "Nofiction", nonfiction));

        List<CategoryInfo> science = new ArrayList<CategoryInfo>();

        categories.add(new CategoryInfo(32L, "Science", science));

        List<CategoryInfo> comedy = new ArrayList<CategoryInfo>();

        categories.add(new CategoryInfo(42L, "Comedy", comedy));
        return categories;
    }
}

