package project.myshop.member.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(nullable = false)
    private Long goodsId;

    @Column(nullable = false)
    private int totalAmount;

    @Column(nullable = false)
    private int totalPrice;

    @Column
    private Long optionNumber;

    public Cart(Long id, Member member,Long goodsId, int totalAmount, int totalPrice, Long optionNumber){
        this.id = id;
        this.member = member;
        this.goodsId = goodsId;
        this.totalAmount = totalAmount;
        this.totalPrice = totalPrice;
        this.optionNumber = optionNumber;
    }


}
