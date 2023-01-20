package com.wsb.builder;

public class MainBuilder {

    public static void main(String[] args) {
        final BuilderTemplate record = BuilderTemplate.builder()
                .userId(1L)
                .userName("USER")
                .password("PASSWORD")
                .email("USER@USER")
                .build();

        System.out.println(record.toString());

    }
}
