package mvc.common;

import javax.persistence.*;


@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private OrdersInfo order_id;

    @OneToOne
    @JoinColumn(name = "good_id")
    private GoodInfo good_id;

    @Column(name = "count")
    private Long count;

    public Cart() {
    }

    public Cart(OrdersInfo order_id, GoodInfo good_id, Long count) {
        this.order_id = order_id;
        this.good_id = good_id;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrdersInfo getOrder_id() {
        return order_id;
    }

    public void setOrder_id(OrdersInfo order_id) {
        this.order_id = order_id;
    }

    public GoodInfo getGood_id() {
        return good_id;
    }

    public void setGood_id(GoodInfo good_id) {
        this.good_id = good_id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
