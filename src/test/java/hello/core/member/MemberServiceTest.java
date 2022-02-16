package hello.core.member;

import hello.core.AppConfig;
import hello.core.domain.member.Grade;
import hello.core.domain.member.Member;
import hello.core.service.MemberService;
import hello.core.service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //then
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //when
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
