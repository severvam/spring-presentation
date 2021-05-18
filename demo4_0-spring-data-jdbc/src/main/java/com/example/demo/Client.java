package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Client implements FourFinanceClient {

    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    private Long id;

    @ToString.Include
    @EqualsAndHashCode.Include
    private String userId;

    private String email;

    private String password;

    @Override
    public void addPrefix(String prefix) {
        userId = prefix + userId;
    }

}
