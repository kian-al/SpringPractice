package com.practice.springpractice.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public class Person {
    @NotBlank (message = "id can not be null")
    public final Long id;
    private final String name;
    private final String lastname;
}
