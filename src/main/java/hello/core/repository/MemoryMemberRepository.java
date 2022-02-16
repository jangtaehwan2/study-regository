package hello.core.repository;

import hello.core.domain.member.Member;
import hello.core.domain.member.MemberRepository;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    // 동시성 이슈로 ConcurrentHashMap 사용을 권장
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
