package project.myshop.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.myshop.member.entity.Member;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Long, Member> {
    Optional<Member> findByLoginId(String loginId);
    Optional<Member> findByEmailAndLoginId(String email, String loginId);

}
