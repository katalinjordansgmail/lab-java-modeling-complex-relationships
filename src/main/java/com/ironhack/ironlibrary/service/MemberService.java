/* (C)2024 */
package com.ironhack.ironlibrary.service;

import com.ironhack.ironlibrary.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired private MemberRepository memberRepository;
}
