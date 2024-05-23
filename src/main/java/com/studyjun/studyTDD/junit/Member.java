package com.studyjun.studyTDD.junit;

import lombok.Getter;
import lombok.Setter;

import java.util.StringTokenizer;

@Getter
@Setter
public class Member {
    private static final int ENTRANCE_CUT_YEAR = 1996;

    private String name;
    private String birth;
    private int weight;
    private int height;

    public Member(String name, String birth) {
        this.name = name;
        this.birth = birth;

        StringTokenizer stringTokenizer = new StringTokenizer(birth, ".");
        int year = Integer.parseInt(stringTokenizer.nextToken());

        if (year <= ENTRANCE_CUT_YEAR) {
            throw new IllegalArgumentException("get out!! old boy");
        }
    }
}