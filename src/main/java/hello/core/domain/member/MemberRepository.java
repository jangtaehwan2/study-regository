package hello.core.domain.member;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
