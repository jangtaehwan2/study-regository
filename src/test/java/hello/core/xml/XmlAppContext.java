package hello.core.xml;

import hello.core.service.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class XmlAppContext {

    @Test
    public void xmlContext() {
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService bean = ac.getBean("memberService", MemberService.class);
        assertThat(bean).isInstanceOf(MemberService.class);
    }
}
