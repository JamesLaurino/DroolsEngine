package com.droolsEngine.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class UserDao {
    private String name;
    private String moment;
    private LocalDateTime localDateTime;
    private ProgramDao programDao;
    private List<Integer> percentage;
    private List<FrequenceDao> frequenceDaoList;


}
