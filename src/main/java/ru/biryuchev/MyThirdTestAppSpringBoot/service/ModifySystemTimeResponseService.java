package ru.biryuchev.MyThirdTestAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.biryuchev.MyThirdTestAppSpringBoot.model.Response;
import ru.biryuchev.MyThirdTestAppSpringBoot.util.DataTimeUtil;

import java.util.Date;

@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService {
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DataTimeUtil.getCustomFormat().format(new Date()));
        return response;
    }
}
