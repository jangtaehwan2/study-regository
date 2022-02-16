package hello.core.discount;

import hello.core.domain.member.Grade;
import hello.core.domain.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void vip_o() {
        //given
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);

        //when
        int discount = rateDiscountPolicy.discount(memberVIP, 10000);

        //then
        assertThat(discount).isEqualTo(1000);
    }


    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    void vip_x() {
        //given
        Member memberBasic = new Member(1L, "memberVIP", Grade.BASIC);

        //when
        int discount = rateDiscountPolicy.discount(memberBasic, 10000);

        //then
        assertThat(discount).isEqualTo(0);
    }
}