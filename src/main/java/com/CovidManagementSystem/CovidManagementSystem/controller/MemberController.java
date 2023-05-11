package com.CovidManagementSystem.CovidManagementSystem.controller;

import com.CovidManagementSystem.CovidManagementSystem.model.Member;
import com.CovidManagementSystem.CovidManagementSystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/create")
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @GetMapping("/getById/{id}")
    public Member getMemberById(@PathVariable String id) {
        return memberService.getMemberById(id);
    }

    @GetMapping("/all")
    public List<Member> getAllMembers() {
        List<Member> temp = memberService.getAllMembers();
        return temp;
    }

    @PutMapping("/update")
    public Member updateMember(@RequestBody Member member) {
        return memberService.updateMember(member);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMember(@PathVariable String id) {
        return memberService.deleteMember(id);
    }
}
