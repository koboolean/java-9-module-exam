package com.api.service;

import com.domain.service.StringRepository;

public class StringSaveComponent {

    private final StringRepository repository = StringRepositoryLoader.get();

    public void mainLogic(){
        repository.save("문자열");
    }

    public static void main(String[] args) {
        StringSaveComponent stringSaveComponent = new StringSaveComponent();
        stringSaveComponent.mainLogic();
    }
}
