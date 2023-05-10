package com.CovidManagementSystem.CovidManagementSystem.service;

import com.CovidManagementSystem.CovidManagementSystem.model.Member;
import com.CovidManagementSystem.CovidManagementSystem.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public Member createMember(Member member){
        return memberRepository.save(member);
    }

    public Member getMemberById(String id) {
        return memberRepository.findById(id).get();
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member updateMember (Member member) {
        return memberRepository.save(member);
    }

    public String deleteMember (String id) {
        memberRepository.deleteById(id);
        return "Member has been deleted.";
    }
}
