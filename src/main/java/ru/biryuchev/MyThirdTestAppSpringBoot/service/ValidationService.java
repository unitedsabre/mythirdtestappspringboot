package ru.biryuchev.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.biryuchev.MyThirdTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.biryuchev.MyThirdTestAppSpringBoot.exception.ValidationFailedException;

@Service
public interface ValidationService {

    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}