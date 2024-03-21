/* (C)2024 */
package com.ironhack.ironlibrary.repository;

import com.ironhack.ironlibrary.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

    Optional<Member> findMemberByName(String name);

}
