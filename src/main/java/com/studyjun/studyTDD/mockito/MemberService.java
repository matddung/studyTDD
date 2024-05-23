package com.studyjun.studyTDD.mockito;

import java.util.Optional;

public interface MemberService {
    Optional<Member> findById(Long memberId );

    void validate( long id );
}