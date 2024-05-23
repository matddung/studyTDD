package com.studyjun.studyTDD.mockito;

import java.util.List;

public interface MockRepository {
    List<Mock> findAll();
//    List<Mock> findAll(Sort sort);
}