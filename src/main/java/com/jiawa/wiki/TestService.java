package com.jiawa.wiki;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource  //JDK自带
//    @Autowired  //spring自带
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }

}
