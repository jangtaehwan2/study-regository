package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.domain.member.MemberRepository;
import hello.core.service.MemberServiceImpl;
import hello.core.service.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationSingletonTest {

    @Test
    public void configurationTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
//        OrderServiceImpl orderService = ac.getBean("orderService", OrderServiceImpl.class);

        MemberRepository repository0 = ac.getBean("memberRepository", MemberRepository.class);
        MemberRepository repository1 = memberService.getMemberRepository();
//        MemberRepository repository2 = orderService.getMemberRepository();

        System.out.println("repository0 -> " + repository0);
        System.out.println("repository1 -> " + repository1);
//        System.out.println("repository2 -> " + repository2);

//        assertThat(repository0).isSameAs(repository1).isSameAs(repository2);
    }

    @Test
    public void configurationDeep() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);

        System.out.println("bean = " + bean.getClass());

    }
}
