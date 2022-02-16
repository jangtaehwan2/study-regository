package hello.core.discount;

import hello.core.domain.member.Member;

public interface DiscountPolicy {

    /**
     *
     * @param member
     * @param price
     * @return return 할인 금액
     */
    int discount(Member member, int price);
}
