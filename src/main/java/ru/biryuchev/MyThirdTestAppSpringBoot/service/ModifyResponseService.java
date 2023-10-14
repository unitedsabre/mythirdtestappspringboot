package ru.biryuchev.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.biryuchev.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}