package sk.stu.fei.uim.asos.rest;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.stu.fei.uim.asos.dto.req.SubstRequestDto;
import sk.stu.fei.uim.asos.dto.res.SubstResponseDto;

@RestController("/subst")
public interface ISubstRestService {

    @PutMapping
    SubstResponseDto subtract(@RequestBody SubstRequestDto req);

}
