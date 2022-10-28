package sk.stu.fei.uim.asos.rest;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.stu.fei.uim.asos.dto.req.AddRequestDto;
import sk.stu.fei.uim.asos.dto.res.AddResponseDto;

@RestController("/add")
public interface IAddRestService {

    @PutMapping
    AddResponseDto add(@RequestBody AddRequestDto req);

}

