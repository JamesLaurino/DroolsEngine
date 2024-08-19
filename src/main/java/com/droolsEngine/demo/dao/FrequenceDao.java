package com.droolsEngine.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class FrequenceDao {
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
}
