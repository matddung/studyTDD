package com.studyjun.studyTDD.junit;

import lombok.Getter;
import lombok.Setter;

import java.util.StringTokenizer;

@Getter
@Setter
public class Person {
    private static final int LIMIT_YEAR = 1996;

    private String name;
    private String birth;
    private String bloodType;
    private int weight;
    private int height;

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;

        StringTokenizer stringTokenizer = new StringTokenizer(birth, ".");
        int year = Integer.parseInt(stringTokenizer.nextToken());

        if (LIMIT_YEAR > year) {
            throw new IllegalArgumentException("get out!! noddang.");
        }
    }

    public Person(String name, String birth, int height) {
        this.name = name;
        this.birth = birth;
        this.height = height;
    }
}