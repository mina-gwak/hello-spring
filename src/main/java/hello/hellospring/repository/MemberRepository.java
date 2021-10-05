package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    // 회원 저장 시 저장된 회원 반환
    Member save(Member member);

    // id와 name으로 회원 찾기
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);

    // 저장된 모든 회원 리스트 반환
    List<Member> findAll();
}
