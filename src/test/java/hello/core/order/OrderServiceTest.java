//package hello.core.order;
//
//import hello.core.AppConfig;
//import hello.core.domain.member.Grade;
//import hello.core.domain.member.Member;
//import hello.core.domain.order.Order;
//import hello.core.service.MemberService;
//import hello.core.service.MemberServiceImpl;
//import hello.core.service.OrderService;
//import hello.core.service.OrderServiceImpl;
//import lombok.RequiredArgsConstructor;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//@RequiredArgsConstructor
//public class OrderServiceTest {
//
//    private final MemberService memberService;
//    private final OrderService orderService;
//
//    @BeforeEach
//    public void beforeEach() {
//        AppConfig appConfig = new AppConfig();
////        memberService = appConfig.memberService();
////        orderService = appConfig.orderService();
//    }
//
//    @Test
//    void createOrder() {
//        //given
//        Long memberId = 1L;
//        Member member = new Member(memberId, "memberA", Grade.VIP);
//        memberService.join(member);
//
//        //when
//        Order order = orderService.createOrder(memberId, "itemA", 10000);
//
//        //then
//        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
//    }
//
//}
